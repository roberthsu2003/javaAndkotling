package event;

import javax.swing.*;
import javax.swing.border.Border;
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
    }

    {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //建立空白邊框的contentPanel
        JPanel contentPanel = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        contentPanel.setBorder(padding);
        this.setContentPane(contentPanel);

        JRadioButton redButton = new JRadioButton("Red");
        JRadioButton greenButton = new JRadioButton("Green");
        JRadioButton blueButton = new JRadioButton("Blue");

        RadioClickListener listener = new RadioClickListener();
        redButton.addActionListener(listener);
        greenButton.addActionListener(listener);
        blueButton.addActionListener(listener);

        ButtonGroup colorButtonGroup = new ButtonGroup();
        colorButtonGroup.add(redButton);
        colorButtonGroup.add(greenButton);
        colorButtonGroup.add(redButton);

        redButton.setSelected(true);
        add(new JLabel("Color:"));
        add(redButton);
        add(greenButton);
        add(blueButton);
    }

    private static void constructGUI(){
        setDefaultLookAndFeelDecorated(true);
        ActionListenerDemo4 frame = new ActionListenerDemo4("ActionListener Demo 4");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> constructGUI());
    }
}
