package event;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String buttonText = source.getText();
        JOptionPane.showMessageDialog(null, "You Click" + buttonText);
    }
}
