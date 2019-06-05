

import javax.swing.*;
import java.awt.*;

public class JLabelDemo {
    private static void constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame();
        frame.setTitle("JLabel Test");
        FlowLayout layout = new FlowLayout();
        layout.setHgap(20);
        layout.setVgap(30);
        frame.setLayout(layout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("First Name");
        label1.setFont(new Font("Courier New", Font.ITALIC, 20));
        label1.setForeground(Color.GRAY);

        JLabel label2 = new JLabel();
        label2.setText("<html>Last Name<br><font face='courier new' color='red'>(mandatory)</font></html>");

        JLabel label3 = new JLabel();
        label3.setText("<html>LastName<br><font face='garamond' color='red'>(mandatory)</font></html>");

        ImageIcon heartIcon = new ImageIcon("images/heartIcon.png");
        JLabel label4 = new JLabel(heartIcon);

        ImageIcon addIcon = new ImageIcon("images/add.png");

        JLabel label5 = new JLabel("購物車", addIcon, SwingConstants.RIGHT);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){

        SwingUtilities.invokeLater(() -> constructGUI());
    }
}
