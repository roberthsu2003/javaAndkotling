package layout

import javax.swing.BoxLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.SwingUtilities

fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        val frame = JFrame("BoxLayout Test")

        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        val boxLayout = BoxLayout(frame.contentPane, BoxLayout.Y_AXIS)
        frame.layout = boxLayout
        frame.add(JButton("Button 1"))
        frame.add(JButton("Button 2"))
        frame.add(JButton("Button 3"))
        frame.pack()
        frame.isVisible = true
    }

    SwingUtilities.invokeLater { constructGUI() }
}