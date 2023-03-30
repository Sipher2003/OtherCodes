import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menu2 extends JFrame {
    JMenu m1, m2, m6;
    JMenuItem mb1, mb2, mb3, mb4, mb5, mb6;
    JMenuBar mk1;

    menu2() {
        m1 = new JMenu("Color");
        m2 = new JMenu("City");
        mb1 = new JMenuItem("Red");
        mb2 = new JMenuItem("Blue");
        mb3 = new JMenuItem("Mumbai");
        m6 = new JMenu("Delhi");
        mb4 = new JMenuItem("A");
        mb5 = new JMenuItem("B");

        mk1 = new JMenuBar();
        m1.add(mb1);
        m1.add(mb2);
        m2.add(mb3);
        m2.add(m6);
        m6.add(mb4);
        m6.add(mb5);
        mk1.add(m1);
        mk1.add(m2);

        setJMenuBar(mk1);
        setSize(300, 200);
        setVisible(true);
        setTitle("menu2");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new menu2();
    }

}
