import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class ListExample extends JFrame implements ListSelectionListener {

    JLabel l1, l2;
    JList jl1;
    String str[] = { "A", "B", "C", "D", "E" };

    ListExample() {
        l1 = new JLabel("Select any one");
        jl1 = new JList(str);
        l2 = new JLabel("");

        jl1.addListSelectionListener(this);
        add(l1);
        add(new JScrollPane(jl1));
        add(l2);

        jl1.setVisibleRowCount(3);
        setSize(200, 200);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void valueChanged(ListSelectionEvent le) {

        String str1="";
        Object obj[]=jl1.getSelectedValues();
        for(int i=0;i<obj.length;i++){
            str1=str1+(String)obj[i];
        }
        l2.setText(" "+str1);
        JOptionPane.showConfirmDialog(this,"Values are :"+str1,"alert",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {

        new ListExample();
    }

   }