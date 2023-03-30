import javax.swing.*;
import java.awt.*;

public class myfirstapp extends JFrame {

    JLabel l1;

    myfirstapp() {
        l1 = new JLabel("This is first Label");
        add(l1);
        setSize(200, 200);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("My Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new myfirstapp();
    }
}