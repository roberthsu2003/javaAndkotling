package layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo2 {
    private static void constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("BorderLayout Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        JLabel label1 = new JLabel("Registration Form");
        label1.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label1,BorderLayout.NORTH);
        JLabel label2 = new JLabel("name:");
        frame.add(label2,BorderLayout.WEST);
        JTextField textField = new JTextField("<your name>");
        frame.add(textField,BorderLayout.CENTER);
        JButton button1 = new JButton("Register");
        frame.add(button1,BorderLayout.EAST);
        JButton button2 = new JButton("Clear Form");
        frame.add(button2,BorderLayout.SOUTH);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                constructGUI();
            }
        });
    }
}
