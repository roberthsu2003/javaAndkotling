import javax.swing.*;
import java.awt.*;

public class JFrameTest3 {
    static class MyFrame extends JFrame{
        public MyFrame(){
            super();
            init();
        }

        public MyFrame(String title){
            super(title);
            init();
        }

        private void init(){
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setTitle("JFrame Test");
           this.setLayout(new GridLayout(3, 2));
           this.add(new JLabel("FirstName:"));
           this.add(new JTextField());
           this.add(new JLabel("LastName:"));
           this.add(new JTextField());
           this.add(new JButton("Register"));
           int frameWidth = 200;
           int frameHeight = 100;
           Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
           this.setBounds((int)screenSize.getWidth() - frameWidth, 0, frameWidth, frameHeight);

        }
    }

    static void constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }

    public static void main(String[] args){



        SwingUtilities.invokeLater(()->constructGUI());

    }
}
