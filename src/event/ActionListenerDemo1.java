package event;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ActionListenerDemo1 {
    private static void constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("ActionListener Test 1");
        //建立空白邊框的contentPanel
        JPanel contentPanel = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        contentPanel.setBorder(padding);
        frame.setContentPane(contentPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //建立Button
        JButton button = new JButton("Register");

        //加入Button大小
        button.setPreferredSize(new Dimension(150,40));
        //加入監聽
        button.addActionListener(new MyActionListener());

        frame.getContentPane().add(button);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> constructGUI());
    }
}
