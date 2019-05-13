import javax.swing.*;
import java.awt.*;

public class JRadioButtonDemo {
    private static void constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("JRadioButton Test");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JRadioButton button1 = new JRadioButton("Red");
        JRadioButton button2 = new JRadioButton("Green");
        JRadioButton button3 = new JRadioButton("Blue");
        ButtonGroup colorButtonGroup = new ButtonGroup();
        colorButtonGroup.add(button1);
        colorButtonGroup.add(button2);
        colorButtonGroup.add(button3);
        button1.setSelected(true);
        frame.add(new JLabel("Color:"));
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
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
