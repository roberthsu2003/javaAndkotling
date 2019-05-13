import javax.swing.*;
import java.awt.*;

public class JTextAreaDemo {
    private static void constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("JTextArea Test");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String text = "A JTextArea object represents" + " a multiline area for displaying text."
                + "You con change the number of lines" + "that can be displayed at a time " + "as well as the number of columns."
                + "You cna wrap lines and words too. " + "You cna also put your JTextArea in a JScrollPane to make it scrollable.";
        JTextArea textArea1 = new JTextArea(text,5,10);
        textArea1.setPreferredSize(new Dimension(100,100));
        JTextArea textArea2 = new JTextArea(text, 5, 10);
        textArea2.setPreferredSize(new Dimension(100,100));
        JScrollPane scrollPane = new JScrollPane(textArea2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        textArea1.setLineWrap(true);
        textArea2.setLineWrap(true);
        frame.add(textArea1);
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        constructGUI();
    }
}
