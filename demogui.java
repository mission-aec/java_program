
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class demogui {

    public demogui() {
        Frame f = new Frame("my frame");
        f.setLayout(new FlowLayout());
        Label l1 = new Label("first name");
        Label l2 = new Label("second name");
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        Button B1 = new Button("submit");
        l1.setBackground(Color.GREEN);
        l2.setBackground(Color.GREEN);
        f.setSize(400, 500);
        f.setVisible(true);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(B1);
        f.setBackground(Color.gray);

        B1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String str = t1.getText();
                String str1 = t2.getText();
                t1.setText(str1);
                t2.setText(str);
                f.setBackground(Color.CYAN);
                l1.setBackground(Color.RED);
                l2.setBackground(Color.RED);
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public static void main(String[] args) {
        demogui mission = new demogui();
        System.out.println("start");

    }
}
