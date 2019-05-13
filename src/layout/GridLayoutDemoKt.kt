package layout

import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.SwingUtilities

fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        val frame = JFrame("GridLayout Text")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.layout = GridLayout(3, 2)
        frame.add(JButton("Button 1"))
        frame.add(JButton("Button 2"))
        frame.add(JButton("Button 3"))
        frame.add(JButton("Button 4"))
        frame.add(JButton("Button 5"))
        frame.add(JButton("Button 6"))
        frame.add(JButton("Button 7"))
        frame.add(JButton("Button 8"))
        frame.pack()
        frame.isVisible = true
    }

    SwingUtilities.invokeLater { constructGUI() }
}