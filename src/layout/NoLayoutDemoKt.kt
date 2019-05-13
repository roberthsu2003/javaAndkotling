package layout

import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JTextField
import javax.swing.SwingUtilities

fun main(){
    fun constructGUI(){
        val frame = JFrame("No Layout Test")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.layout = null
        val label = JLabel("First Name:")
        label.setBounds(20, 20, 100, 20)
        val textField = JTextField()
        textField.setBounds(124, 25, 100, 20)
        frame.add(label)
        frame.add(textField)
        frame.setSize(300, 100)
        frame.isVisible = true
    }

    SwingUtilities.invokeLater { constructGUI() }
}