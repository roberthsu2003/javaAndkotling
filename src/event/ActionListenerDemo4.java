package event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerDemo4 extends JFrame {
    private class RadioClickListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            ActionListenerDemo4.this.setTitle(command);
        }

    }

    public ActionListenerDemo4(String title){
        super(title);
        init();
    }

    private void init(){
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton button1 = new JRadioButton("Red");
        JRadioButton button2 = new JRadioButton("Green");
        JRadioButton button3 = new JRadioButton("Blue");
        RadioClickListener listener = new RadioClickListener();
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        ButtonGroup colorButtonGroup = new ButtonGroup();
        colorButtonGroup.add(button1);
        colorButtonGroup.add(button2);
        colorButtonGroup.add(button3);
        button1.setSelected(true);
        this.add(new JLabel("Color:"));
        this.add(button1);
        this.add(button2);
        this.add(button3);
    }

    private static void constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        ActionListenerDemo4 frame = new ActionListenerDemo4("ActionListener Demo 4");
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
