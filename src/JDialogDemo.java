import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JDialogDemo extends JFrame {
    AddressDialog dialog = new AddressDialog(this, false);
    public JDialogDemo(String title){
        super(title);
        init();
    }

    public JDialogDemo(){
        super();
        init();
    }

    private void init(){
        this.getContentPane().setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //AddressDialog dialog = new AddressDialog(this,false);
        JButton button = new JButton("Show Dialog");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayDialog();
            }
        });
        this.getContentPane().add(button);

    }

    private void displayDialog(){
        dialog.setSize(250, 120);
        dialog.setVisible(true);
    }

    private static void constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        JDialogDemo frame = new JDialogDemo();
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
