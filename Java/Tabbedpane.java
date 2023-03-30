import javax.swing.*;
import java.awt.*;

public class Tabbedpane extends JFrame {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    JRadioButton rb1, rb2;
    ButtonGroup bg;
    JButton b1;
    JPanel p1, p2, p3, p4;

    Tabbedpane() {
        l1 = new JLabel("Welcome to Home Page");
        l4 = new JLabel("ABC.com");

        p1 = new JPanel();
        p4 = new JPanel();
        rb1 = new JRadioButton("New User");
        rb2 = new JRadioButton("Already REgister");
        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        p4.add(rb1);
        p4.add(rb2);
        p1.add(l1);

        p1.setLayout(new FlowLayout());

        p2 = new JPanel();
        l2 = new JLabel("User Name");
        l3 = new JLabel("Email ID");
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        b1 = new JButton("Register");
        p2.setLayout(new GridLayout(3, 2));
        p2.add(l2);
        p2.add(t1);
        p2.add(l3);
        p2.add(t2);

        p2.add(b1);

        p2.add(p4);

        p3 = new JPanel();

        JTabbedPane tp = new JTabbedPane();

        tp.add("main", p1);
        tp.add("Registration", p2);
        tp.add("help", p3);
        add(l4);
        add(tp);

        setSize(400, 400);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Tabbedpane();
    }
}
