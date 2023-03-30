import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menu extends JFrame {
    JMenu m1, m2;
    JMenuItem mb1, mb2, mb3;
    JMenuBar mb;

    menu() {
        m1 = new JMenu("File");
        m2 = new JMenu("About");
        mb1 = new JMenuItem("New");
        mb2 = new JMenuItem("Open");
        mb3 = new JMenuItem("Contact us");

        mb = new JMenuBar();

        m1.add(mb1);
        m1.add(mb2);
        m2.add(mb3);
        mb.add(m1);
        mb.add(m2);
        setJMenuBar(mb);
        setSize(300, 200);
        setVisible(true);
        setTitle("menubar");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        new menu();
    }
}
