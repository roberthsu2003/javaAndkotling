package event

import java.awt.Color
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*
import javax.swing.border.EmptyBorder

class MyActionListenerKt:ActionListener{
    override fun actionPerformed(e: ActionEvent?) {
        val source = e?.source as JButton
        val buttonText = source.text
        JOptionPane.showMessageDialog(null, "you Click $buttonText")
    }
}

fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        JDialog.setDefaultLookAndFeelDecorated(true)
        val frame = JFrame("ActionListener Test 1")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        val button = JButton("Register")
        button.addActionListener(MyActionListenerKt())
        frame.contentPane.add(button)
        frame.pack()
        frame.isVisible = true
    }

    SwingUtilities.invokeLater(Runnable {
        constructGUI()
    })
}
