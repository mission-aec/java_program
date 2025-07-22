class TrafficSignal {
    private String currentLight = "RED"; // Initial state is RED

    public synchronized void turnOnRedLight() {
        while (!currentLight.equals("RED")) {
            try {
                wait(); // Wait until it's RED's turn
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
        System.out.println("RED light is ON");
        try {
            Thread.sleep(10000); // RED light stays on for 10 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }
        currentLight = "YELLOW"; // Switch to YELLOW
        notifyAll(); // Notify other threads
    }

    public synchronized void turnOnYellowLight() {
        while (!currentLight.equals("YELLOW")) {
            try {
                wait(); // Wait until it's YELLOW's turn
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
        System.out.println("YELLOW light is ON");
        try {
            Thread.sleep(3000); // YELLOW light stays on for 3 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }
        currentLight = "GREEN"; // Switch to GREEN
        notifyAll(); // Notify other threads
    }

    public synchronized void turnOnGreenLight() {
        while (!currentLight.equals("GREEN")) {
            try {
                wait(); // Wait until it's GREEN's turn
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
        System.out.println("GREEN light is ON");
        try {
            Thread.sleep(15000); // GREEN light stays on for 15 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }
        currentLight = "RED"; // Switch back to RED
        notifyAll(); // Notify other threads
    }
}

public class TrafficSignalSimulation {
    public static void main(String[] args) {
        TrafficSignal trafficSignal = new TrafficSignal();

        // Create threads for each light
        Thread redLightThread = new Thread(() -> {
            while (true) {
                trafficSignal.turnOnRedLight();
            }
        });

        Thread yellowLightThread = new Thread(() -> {
            while (true) {
                trafficSignal.turnOnYellowLight();
            }
        });

        Thread greenLightThread = new Thread(() -> {
            while (true) {
                trafficSignal.turnOnGreenLight();
            }
        });

        // Start the threads
        redLightThread.start();
        yellowLightThread.start();
        greenLightThread.start();
    }
}