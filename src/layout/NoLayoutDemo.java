package layout;

import javax.swing.*;

public class NoLayoutDemo {
    private static void constructGUI(){
        JFrame frame = new JFrame("No Layout Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel label = new JLabel("First Name:");
        label.setBounds(20, 20, 100, 20);
        JTextField textField = new JTextField();
        textField.setBounds(124, 25, 100,20);
        frame.add(label);
        frame.add(textField);
        frame.setSize(300, 100);
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
