import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.tree.*;

public class JTreeDemo1 extends MouseAdapter {
    JTree t;
    JTextField jtf;
    JFrame f1;

    JTreeDemo1() {
        f1 = new JFrame();
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Adavanced Java");
        DefaultMutableTreeNode dmt1 = new DefaultMutableTreeNode("Swing Component 1");
        top.add(dmt1);
        DefaultMutableTreeNode dt1 = new DefaultMutableTreeNode("JDialogBox");
        dmt1.add(dt1);
        DefaultMutableTreeNode dt2 = new DefaultMutableTreeNode("JComponent");
        dmt1.add(dt2);
        DefaultMutableTreeNode dmt2 = new DefaultMutableTreeNode("Swing Component 2");
        top.add(dmt2);
        DefaultMutableTreeNode dt3 = new DefaultMutableTreeNode("JTable");
        dmt2.add(dt3);
        DefaultMutableTreeNode dt4 = new DefaultMutableTreeNode("JTree");
        dmt2.add(dt4);
        DefaultMutableTreeNode dmt3 = new DefaultMutableTreeNode("JDBC");
        top.add(dmt3);
        DefaultMutableTreeNode dt5 = new DefaultMutableTreeNode("JDBC Architecture");
        dmt3.add(dt5);
        DefaultMutableTreeNode dt6 = new DefaultMutableTreeNode("JDBC Drivers");
        dmt3.add(dt6);
        DefaultMutableTreeNode dmt4 = new DefaultMutableTreeNode("Networking with Java");
        top.add(dmt4);
        DefaultMutableTreeNode dt7 = new DefaultMutableTreeNode("InetAddress");
        dmt4.add(dt7);
        DefaultMutableTreeNode dt8 = new DefaultMutableTreeNode("URL");
        dmt4.add(dt8);
        t = new JTree(top);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(t, v, h);
        f1.add(jsp, BorderLayout.CENTER);
        jtf = new JTextField(15);
        f1.add(jtf, BorderLayout.SOUTH);
        t.addMouseListener(this);

        f1.setSize(300, 300);
        f1.setVisible(true);

    }

    public void mouseClicked(MouseEvent me) {
        doMouseClicked(me);
    }

    void doMouseClicked(MouseEvent me) {
        TreePath tp = t.getPathForLocation(me.getX(), me.getY());
        if (tp != null) {
            jtf.setText(tp.toString());
        } else {
            jtf.setText(" ");
        }
    }

    public static void main(String ar[]) {
        new JTreeDemo1();
    }
}