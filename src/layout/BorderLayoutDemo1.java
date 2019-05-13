package layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo1 {
    private static void constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("BorderLayout Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        JTextField textField = new JTextField("<your name>");
        frame.add(textField,BorderLayout.WEST);
        JButton button = new JButton("<html>R<b>e</b>gister</html>");
        frame.add(button,BorderLayout.EAST);
        frame.pack();
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
