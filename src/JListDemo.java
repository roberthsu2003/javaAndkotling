import javax.swing.*;
import java.awt.*;

public class JListDemo {
    private static void constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("JList Test");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] selections = {"green", "red", "orange", "dark blue"};
        JList<String> list = new JList<String>(selections);
        list.setSelectedIndex(1);
        System.out.println(list.getSelectedValue());
        frame.add(list);
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
