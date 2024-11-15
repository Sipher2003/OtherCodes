import javax.swing.*;
import java.awt.*;

public class secondapp extends JFrame {

    JLabel l1, l2;
    JTextField t1, t2;

    secondapp() {

        l1 = new JLabel("Enter username: ");
        t1 = new JTextField(10);
        l2 = new JLabel("Enter password: ");
        t2 = new JTextField(10);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        setSize(300, 200);
        setVisible(true);
        setTitle("Login");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        new secondapp();
    }
}
