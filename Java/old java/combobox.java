import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class combobox extends JFrame implements ActionListener {
    JComboBox cb1;
    JLabel l1, l2;

    combobox() {

        l1 = new JLabel("Select: ");
        l2 = new JLabel("");
        cb1 = new JComboBox();
        cb1.addItem("Pizza");
        cb1.addItem("Salad");
        cb1.addItem("Noodles");

        add(l1);
        add(cb1);
        add(l2);
        cb1.addActionListener(this);
        setSize(200, 300);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Combobox");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == cb1) {
            String str = (String) cb1.getSelectedItem();
            if (str.equals("Pizza"))
                l2.setText("500");
            else if (str.equals("Noodles"))
                l2.setText("400");
            else
                l2.setText("700");
        }

    }

    public static void main(String[] args) {

        new combobox();

    }

}
