import javax.swing.*;
import java.awt.*;

public class border extends JFrame {
    JButton b1, b2, b3, b4, b5;

    border() {
        b1 = new JButton("North");
        b2 = new JButton("South");
        b3 = new JButton("East");
        b4 = new JButton("West");
        b5 = new JButton("Center");

        setLayout(new BorderLayout());
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);

        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static  void main(String[] args){

        new border();
    }

}
