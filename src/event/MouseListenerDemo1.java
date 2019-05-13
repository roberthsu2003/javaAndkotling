package event;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MouseClickListener extends MouseAdapter{
    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        if(SwingUtilities.isLeftMouseButton(e)){
            System.out.println("The mouse left button was clicked");
        }else if(SwingUtilities.isRightMouseButton(e)){
            System.out.println("The Mouse Right button was Clicked");
        }
        System.out.println(e.getClickCount() + " time(s)");
        int x = e.getX();
        int y = e.getY();
        System.out.println("at(" + x + "," + y + ")");

    }
}

public class MouseListenerDemo1 {
    private static void constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("MouseListener Test 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addMouseListener(new MouseClickListener());
        frame.setSize(200, 200);
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
