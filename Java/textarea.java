
import javax.swing.*;
import java.awt.*;

public class textarea extends JFrame {

    JTextArea ta;

    textarea() {

        ta = new JTextArea("", 20, 60);
        add(ta);
        add(new JScrollPane(ta));
        setSize(300, 400);
        setVisible(true);
        setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        new textarea();
    }
}