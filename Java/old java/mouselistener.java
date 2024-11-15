import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class mouselistener extends MouseAdapter {
    JLabel l;
    JFrame f1;
    JTextField area;

    mouselistener() {
        f1 = new JFrame();
        l = new JLabel();
        l.setBounds(30, 50, 200, 30);
        area = new JTextField(50);
        area.setBounds(20, 50, 200, 30);
        area.addMouseListener(this);

        f1.add(l);
        f1.add(area);
        f1.setSize(300, 300);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void mouseClicked(MouseEvent e) {

        l.setText("clicked");
    }

    public void mouserEntered(MouseEvent e) {

        l.setText("Entered");
    }

    public void mouseExited(MouseEvent e) {

        l.setText("Exited");
    }

    public void mousePressed(MouseEvent e) {

        l.setText("Pressed");
    }

    public void mouseReleased(MouseEvent e) {


        l.setText("Released");
    }

    public static void main(String[] args) {
        new mouselistener();
        
    }
}
