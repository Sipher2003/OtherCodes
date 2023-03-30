import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class text1 extends JFrame implements ActionListener{

    JLabel l1,l2;
    JTextField t1;
    JButton b1;
    JPasswordField p1;

    text1(){
        // l1=new JLabel("Enter your name");
        l1=new JLabel("password");
        t1=new JPasswordField(10);
        l2=new JLabel();
        b1=new JButton("Reset");

        b1.addActionListener(this);
        setSize(200,300);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(l1);
        add(t1);
        add(b1);
        add(l2);
    }

    public void actionPerformed(ActionEvent ae){
        //   String s1=t1.getText();
        //   l2.setText("Hello "+s1);
    }


    public static void main(String[] args){
     new text1();
    }
}
