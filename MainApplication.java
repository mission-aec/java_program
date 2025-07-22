import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class LogFileReader {

    public List<String> readLogFile(String filePath) throws LogAnalysisException {
        List<String> logEntries = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                logEntries.add(line);
            }
        } catch (IOException e) {
            throw new LogAnalysisException("Error reading log file: " + filePath, e);
        }

        return logEntries;
    }
}
class LogAnalysisException extends Exception {
    public LogAnalysisException(String message) {
        super(message);
    }

    public LogAnalysisException(String message, Throwable cause) {
        super(message, cause);
    }
}


class LogAnalyzer {

    public void analyzeLogs(List<String> logEntries) throws LogAnalysisException {
        if (logEntries == null || logEntries.isEmpty()) {
            throw new LogAnalysisException("No log entries to analyze.");
        }

        int errorCount = 0;
        for (String entry : logEntries) {
            if (entry.contains("ERROR")) {
                errorCount++;
                System.out.println("Error found: " + entry);
            }
        }

        System.out.println("Total errors found: " + errorCount);

        if (errorCount > 0) {
            throw new LogAnalysisException("Errors detected in log entries.");
        }
    }
}
public class MainApplication {

    public static void main(String[] args) {
        String filePath = "server_logs.txt"; // Replace with your log file path

        LogFileReader logFileReader = new LogFileReader();
        LogAnalyzer logAnalyzer = new LogAnalyzer();

        try {
            // Read log entries from the file
            List<String> logEntries = logFileReader.readLogFile(filePath);

            // Analyze the log entries
            logAnalyzer.analyzeLogs(logEntries);

        } catch (LogAnalysisException e) {
            System.err.println("Log analysis failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}