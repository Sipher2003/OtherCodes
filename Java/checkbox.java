import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class checkbox extends JFrame implements ItemListener {
    JCheckBox c1, c2;
    JLabel l1, l2;

    checkbox() {
        c1 = new JCheckBox("First");
        c2 = new JCheckBox("Second");
        l1 = new JLabel("Select ");
        l2 = new JLabel("");

        add(l1);
        add(c1);
        add(c2);
        add(l2);

        c1.addItemListener(this);
        c2.addItemListener(this);
        setSize(200, 300);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Checkbox");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent ae) {
        String msg = "", msg1 = "";
        if (c1.isSelected())
            msg = "first";
        else
            msg = "";
        if (c2.isSelected())
            msg1 = "second";
        else
            msg1 = "";
        l2.setText(msg + "" + msg1);

    }

    public static void main(String[] args) {
        new checkbox();

    }
}
