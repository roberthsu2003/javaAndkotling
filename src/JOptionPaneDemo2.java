import javax.swing.*;

public class JOptionPaneDemo2 {
    public static void main(String[] args){
        JDialog.setDefaultLookAndFeelDecorated(true);
        Object[] selectionValues = {"pandas", "Dogs", "Horses"};
        String initialSelection = "Dogs";
        Object selection = JOptionPane.showInputDialog(null,
                "What are your favorite animals",
                "Zoo Quiz",
                JOptionPane.QUESTION_MESSAGE,
                null,
                selectionValues,
                initialSelection);
        System.out.println(selection);
    }
}
