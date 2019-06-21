package event;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMI {
    private static class SexClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

        }

    }
    private static void constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("BMI試算");

        //建立空白邊框的contentPanel
        JPanel contentPanel = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(20, 20, 20, 20);
        contentPanel.setBorder(padding);
        frame.setContentPane(contentPanel);



        GridLayout gridLayout = new GridLayout(5,1);
        gridLayout.setHgap(10);
        gridLayout.setVgap(10);
        frame.setLayout(gridLayout);
        JLabel titleLabel = new JLabel("BMI試算",SwingConstants.CENTER);
        titleLabel.setFont(new Font(titleLabel.getFont().getName(), titleLabel.getFont().getStyle(), 30));
        frame.add(titleLabel);

        //radioButton
        JPanel sexPanel = new JPanel();
        sexPanel.setLayout(new FlowLayout());
        JRadioButton redButton = new JRadioButton("男");
        JRadioButton greenButton = new JRadioButton("女");
        redButton.addActionListener(new SexClickListener());
        ButtonGroup sexButtonGroup = new ButtonGroup();
        sexButtonGroup.add(redButton);
        sexButtonGroup.add(greenButton);
        sexPanel.add(redButton);
        sexPanel.add(greenButton);
        redButton.setSelected(true);
        frame.add(sexPanel);


        Panel heightPanel = new Panel();
        heightPanel.setLayout(new FlowLayout());
        JLabel heightLabel = new JLabel("身高", SwingConstants.LEADING);
        heightLabel.setFont(new Font(titleLabel.getFont().getName(), titleLabel.getFont().getStyle(), 15));
        JTextField heightField = new JTextField(10);
        JLabel cmLabel = new JLabel("cm");
        heightPanel.add(heightLabel);
        heightPanel.add(heightField);
        heightPanel.add(cmLabel);
        frame.add(heightPanel);

        Panel weightPanel = new Panel();
        weightPanel.setLayout(new FlowLayout());
        JLabel weightLabel = new JLabel("體重", SwingConstants.LEADING);
        weightLabel.setFont(new Font(titleLabel.getFont().getName(), titleLabel.getFont().getStyle(), 15));
        JTextField weightField = new JTextField(10);
        JLabel kgLabel = new JLabel("kg");

        weightPanel.add(weightLabel);
        weightPanel.add(weightField);
        weightPanel.add(kgLabel);
        frame.add(weightPanel);

        //frame.add(heightField,BorderLayout.WEST);
        //frame.add(weightLabel,BorderLayout.EAST);
        //frame.add(weightField,BorderLayout.WEST);


        frame.add(new Button("計算"));
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args){
        SwingUtilities.invokeLater( () -> constructGUI());
    }
}
