import javax.swing.*;

public class JButtonDemo {
    private static void constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JButton Test");
        ImageIcon imageIcon = new ImageIcon("images/heartIcon.png");
        JButton loginButton = new JButton("Login", imageIcon);
        frame.add(loginButton);
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
