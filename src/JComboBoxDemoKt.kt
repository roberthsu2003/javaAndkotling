import java.awt.FlowLayout
import javax.swing.JComboBox
import javax.swing.JFrame
import javax.swing.SwingUtilities

fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        val frame = JFrame("JComboBox Test")
        frame.layout = FlowLayout()
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        val selections = arrayOf("green", "red", "orange", "dark blue")
        val comboBox = JComboBox(selections)
        comboBox.selectedIndex = 1
        println(comboBox.selectedItem)
        frame.add(comboBox)
        frame.pack()
        frame.isVisible = true
    }
    SwingUtilities.invokeLater { constructGUI() }

}