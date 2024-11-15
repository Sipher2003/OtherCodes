import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class radiobutton extends JFrame implements ActionListener {
    JRadioButton rb1, rb2;
    JLabel l1, l2;

    radiobutton() {
        rb1 = new JRadioButton("First");
        rb2 = new JRadioButton("Second");
        l1 = new JLabel("Select:");
        l2 = new JLabel("");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        add(l1);
        add(rb1);
        add(rb2);
        add(l2);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        setSize(200, 300);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Checkbox");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == rb1) {
            l2.setText("first");
        } else
            l2.setText("second");

    }

    public static void main(String[] args) {
        new radiobutton();
    }
}
