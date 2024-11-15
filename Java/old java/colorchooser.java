import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class colorchooser extends JFrame implements ActionListener {
    JButton b;
    JLabel L1;

    colorchooser() {
        b = new JButton("color");
        b.addActionListener(this);
        L1 = new JLabel("HELLOO!!!!");

        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(b);
        add(L1);
    }

    public void actionPerformed(ActionEvent ae){

        Color initialColor=Color.RED;
        Color color=JColorChooser.showDialog(this,"Select a color",initialColor); 
        L1.setForeground(color);

    }

    public static void main(String[] args){

        new colorchooser();
    }
}
