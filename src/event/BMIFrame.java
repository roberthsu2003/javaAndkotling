package event;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMIFrame extends JFrame {
    private boolean isMale = true;
    private JTextField heightField;
    private JTextField weightField;

    private class SexClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch(command){
                case "男":
                    isMale = true;
                    break;
                case "女":
                    isMale = false;
                    break;
            }
            System.out.println(isMale);

        }

    }

    private BMIFrame(String title){
        super(title);
    }

    {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("BMI試算");

        //建立空白邊框的contentPanel
        JPanel contentPanel = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(20, 20, 20, 20);
        contentPanel.setBorder(padding);
        this.setContentPane(contentPanel);


        //建立GridLayout
        GridLayout gridLayout = new GridLayout(5,1);
        gridLayout.setHgap(10);
        gridLayout.setVgap(10);
        this.setLayout(gridLayout);

        //加入TitleLabel
        JLabel titleLabel = new JLabel("BMI試算",SwingConstants.CENTER);
        titleLabel.setFont(new Font(titleLabel.getFont().getName(), titleLabel.getFont().getStyle(), 30));
        this.add(titleLabel);

        //radioButton
        JPanel sexPanel = new JPanel();
        sexPanel.setLayout(new FlowLayout());
        JRadioButton maleButton = new JRadioButton("男");
        JRadioButton femaleButton = new JRadioButton("女");

        //群組化radioButton
        ButtonGroup sexButtonGroup = new ButtonGroup();
        sexButtonGroup.add(maleButton);
        sexButtonGroup.add(femaleButton);
        sexPanel.add(maleButton);
        sexPanel.add(femaleButton);
        maleButton.setSelected(true);
        this.add(sexPanel);

        //建立性別事件監聽者
        SexClickListener sexClickListener = new SexClickListener();
        maleButton.addActionListener(sexClickListener);
        femaleButton.addActionListener(sexClickListener);

        //建立heightPanel
        Panel heightPanel = new Panel();
        heightPanel.setLayout(new FlowLayout());
        JLabel heightLabel = new JLabel("身高", SwingConstants.LEADING);
        heightLabel.setFont(new Font(titleLabel.getFont().getName(), titleLabel.getFont().getStyle(), 15));
        heightField = new JTextField(10);
        JLabel cmLabel = new JLabel("cm");
        heightPanel.add(heightLabel);
        heightPanel.add(heightField);
        heightPanel.add(cmLabel);
        this.add(heightPanel);

        //建立weightPanel
        Panel weightPanel = new Panel();
        weightPanel.setLayout(new FlowLayout());
        JLabel weightLabel = new JLabel("體重", SwingConstants.LEADING);
        weightLabel.setFont(new Font(titleLabel.getFont().getName(), titleLabel.getFont().getStyle(), 15));
        weightField = new JTextField(10);
        JLabel kgLabel = new JLabel("kg");

        weightPanel.add(weightLabel);
        weightPanel.add(weightField);
        weightPanel.add(kgLabel);
        this.add(weightPanel);

        //建立Button
        Button calculateButton = new Button("計算");
        this.add(calculateButton);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String heightString = heightField.getText();
                String weightString = weightField.getText();
                try{
                    double height = Double.parseDouble(heightString);
                    double weight = Double.parseDouble(weightString);
                    weight = isMale ? weight : weight - 2;
                    double BMIValue = weight / (height / 100.0 * height / 100);
                    String BMIMessage;
                    if(BMIValue < 18.5)
                        BMIMessage = "體重過輕";
                    else if (BMIValue < 24)
                        BMIMessage = "正常範圍";
                    else if (BMIValue < 27)
                        BMIMessage = "過重";
                    else if (BMIValue < 30)
                        BMIMessage = "輕度肥胖";
                    else if (BMIValue < 35)
                        BMIMessage = "中度肥胖";
                    else BMIMessage = "重度肥胖";

                    JOptionPane.showMessageDialog(null, "<html><center>您的BMI指數是 " + BMIValue + " <br><br> " + BMIMessage + "</center></html>","BMI指數", JOptionPane.INFORMATION_MESSAGE);
                    heightField.setText("");
                    weightField.setText("");

                }catch (NumberFormatException en){
                   JOptionPane.showMessageDialog(null, "身高或體重格式有誤", "警告",JOptionPane.ERROR_MESSAGE);

                }





            }
        });



    }


    private static void constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);

        BMIFrame mainFrame = new BMIFrame("BMI 試算");
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    public static void main(String[] args){

        SwingUtilities.invokeLater( () -> constructGUI());
    }
}
