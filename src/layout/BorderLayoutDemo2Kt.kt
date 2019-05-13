package layout

import java.awt.BorderLayout
import javax.swing.*

fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        val frame = JFrame("BorderLayout Test")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.layout = BorderLayout()
        val label1 = JLabel("Registration Form")
        label1.horizontalAlignment = JLabel.CENTER
        frame.add(label1, BorderLayout.NORTH)
        val label2 = JLabel("name:")
        frame.add(label2, BorderLayout.WEST)
        val textField = JTextField("<your name>")
        frame.add(textField, BorderLayout.CENTER)
        val button1 = JButton("Register")
        frame.add(button1, BorderLayout.EAST)
        val button2 = JButton("Clear Form")
        frame.add(button2, BorderLayout.SOUTH)
        frame.setSize(300, 150)
        frame.isVisible = true
    }


    SwingUtilities.invokeLater { constructGUI() }

}