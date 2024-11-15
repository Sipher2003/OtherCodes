import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// System.setProperty("file.encoding", "UTF-8")
public class combobox1 extends JFrame implements itemListener {

    JComboBox cb1;
    JLabel l1;

    combobox1() {
        cb1 = new JComboBox();
        cb1.addItem(Red);
        cb1.addItem(Blue);
        cb1.addItem(Green);

        l1 = new JLabel("Hello");
        cb1.addItemListener(this);
        add(cb1);
        add(l1);
        setLayout(new FlowLayout());
        setSize(200,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent ie){
        String str=(String)cb1.getSelectedItem();
        if(str.equals("Red")){
            l1.setForeground(Color.red);
        }
        if(str.equals("Blue")){
            l1.setForeground(Color.blue);
        }
        if(str.equals("Green")){
            l1.setForeground(Color.green);
        }

    }
    public static void main(String[] args) {

        new combobox1();
    }
}
