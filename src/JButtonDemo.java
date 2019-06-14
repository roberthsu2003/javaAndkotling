import javax.swing.*;
import java.awt.*;

public class JButtonDemo {
    private static class CustomFrame extends JFrame{
        public CustomFrame(String title,String buttonText){
            super(title);
            JFrame.setDefaultLookAndFeelDecorated(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ImageIcon imageIcon = new ImageIcon("images/heartIcon.png");
            JButton imageButton = new JButton(buttonText, imageIcon);
            imageButton.setPreferredSize(new Dimension(200,200));
            add(imageButton);
        }
    }

    private static void constructGUI(){
        CustomFrame frame = new CustomFrame("JButtonDemo", "Heart");
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
