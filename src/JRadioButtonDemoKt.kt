import java.awt.FlowLayout
import javax.swing.*

fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        val frame = JFrame("JRadioButton Test")
        frame.layout = FlowLayout()
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        val button1 = JRadioButton("Red")
        val button2 = JRadioButton("Green")
        val button3 = JRadioButton("Blue")
        val colorButtonGroup = ButtonGroup()
        colorButtonGroup.add(button1)
        colorButtonGroup.add(button2)
        colorButtonGroup.add(button3)
        button1.isSelected = true
        frame.add(JLabel("Color:"))
        frame.add(button1)
        frame.add(button2)
        frame.add(button3)
        frame.pack()
        frame.isVisible = true
    }

    SwingUtilities.invokeLater { constructGUI() }
}