import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.border.Border;

public class JFrameDemo2 {
    private static void constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        //建立JFrame
        JFrame frame = new JFrame();
        //建立空白邊框的contentPanel
        JPanel contentPanel = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        contentPanel.setBorder(padding);
        frame.setContentPane(contentPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JFrame Test");
        //建立frame的Layout

        frame.setLayout(new GridLayout(3,2,0,10));

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setHorizontalAlignment(JLabel.RIGHT);
        frame.add(firstNameLabel);
        frame.add(new JTextField());

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setHorizontalAlignment(JLabel.RIGHT);
        frame.add(lastNameLabel);

        frame.add(new JTextField());

        frame.add(new JButton("Register"));

        int frameWidth = 300;
        int frameHeight = 150;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds((int)screenSize.getWidth() - frameWidth, 0 , frameWidth, frameHeight);
        frame.setVisible(true);

    }

    public static void main(String[] args){
        /*
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                constructGUI();
            }
        });
        */
         SwingUtilities.invokeLater(() -> constructGUI());
    }
}
