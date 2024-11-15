import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class keylistener extends JFrame implements KeyListener {

    JLabel l;
    JTextField area;
    JFrame f1;

    keylistener() {
        f1 = new JFrame();
        l = new JLabel();
        l.setBounds(20, 50, 100, 20);
        area = new JTextField(50);
        area.setBounds(20, 80, 90, 30);
        area.addKeyListener(this);

        f1.add(l);
        f1.add(area);
        f1.setSize(400, 400);
        f1.setLayout(null);
        f1.setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        l.setText("Pressed");
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Typed");
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Released");
    }

    public static void main(String[] args) {
        new keylistener();
    }
}
