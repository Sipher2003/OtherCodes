import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class loginapp extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JButton b1;
    JPasswordField p1;
    JTextField t1, t2;

    loginapp() {
        l1 = new JLabel("Enter UserName");
        l2 = new JLabel("Enter Password");
        l3 = new JLabel("");

        b1 = new JButton("Login");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        p1 = new JPasswordField(10);

        add(l1);
        add(t1);
        add(l2);
        add(p1);
        add(b1);
        add(l3);
        b1.addActionListener(this);

        setLayout(new FlowLayout());
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String struser = t1.getText();
        String strpass = p1.getText();
        if (ae.getSource() == b1) {
            if (struser.equals("admin") && strpass.equals("admin")) {
                l3.setText("Login Successsfully");
            } else {
                l3.setText("Try again Later!!!");
            }

        }
    }

    public static void main(String ar[]) {
        new loginapp();
    }
}
