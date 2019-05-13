package layout

import java.awt.BorderLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JTextField
import javax.swing.SwingUtilities

fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        val frame = JFrame("BorderLayout Test")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.layout = BorderLayout()
        val textField = JTextField("<your name>")
        frame.add(textField, BorderLayout.WEST)
        val button = JButton("<html>R<b>e</b>gister</html>")
        frame.add(button, BorderLayout.EAST)
        frame.pack()
        frame.isVisible = true
    }

    SwingUtilities.invokeLater { constructGUI() }
}