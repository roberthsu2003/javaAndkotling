package event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyListenerDemo1 extends JFrame implements KeyListener {
    public KeyListenerDemo1(String title){
        super(title);
        this.getContentPane().setLayout(new BorderLayout());
        JTextField textField = new JTextField(20);
        textField.addKeyListener(this);
        this.getContentPane().add(textField);
    }
    @Override
    public void keyTyped(KeyEvent e) {
      e.setKeyChar(Character.toUpperCase(e.getKeyChar()));
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    private static void constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        KeyListenerDemo1 frame = new KeyListenerDemo1("KeyListener Demo 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
