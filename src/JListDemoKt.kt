import java.awt.FlowLayout
import javax.swing.JFrame
import javax.swing.JList
import javax.swing.SwingUtilities

fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        val frame = JFrame("JList Test")
        frame.layout = FlowLayout()
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        val selections = arrayOf("green", "red", "orange", "dark blue")
        val list = JList(selections)
        list.selectedIndex = 1
        println(list.selectedValue)
        frame.add(list)
        frame.pack()
        frame.isVisible = true
    }

    SwingUtilities.invokeLater { constructGUI() }
}