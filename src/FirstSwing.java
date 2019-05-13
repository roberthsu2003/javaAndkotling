import javax.swing.JFrame;
import javax.swing.JButton;

public class FirstSwing {
    public static void main(String[] args){
            JFrame jFrame = new JFrame();
            JButton jButton = new JButton();
            jButton.setBounds(100,100,100,50);
            jButton.setText("Hello");
            jFrame.add(jButton);
            jFrame.setSize(400, 400);
            jFrame.setLayout(null);
            jFrame.setVisible(true);
    }
}
