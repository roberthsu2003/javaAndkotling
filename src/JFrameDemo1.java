import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class JFrameDemo1 {
    private static class MyRunnable implements Runnable{
        @Override
        public void run() {
            constructGUI();
        }
    }

    private static void constructGUI(){
        JFrame frame = new JFrame();
        frame.setTitle("My First Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Welcome");
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args){
        MyRunnable doSomething = new MyRunnable();
        SwingUtilities.invokeLater(doSomething);
    }
    /*
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                constructGUI();
            }
        });
    }
    */



}
