import javax.swing.*
import java.awt.*

fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        val frame = JFrame()
        frame.title = "JLabel Test"
        frame.layout = FlowLayout()
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        val label1 = JLabel("First Name")
        label1.font = Font("Courier New", Font.ITALIC, 12)
        label1.foreground = Color.GRAY
        val label2 = JLabel()
        label2.text = "<html>Last Name<br><font face='courier new' color=red>(mandatory)</font></html>"
        val label3 = JLabel()
        label3.text = "<html>LastName<br><font face=garamond color=red>(mandatory)</font></html>"
        val imageIcon = ImageIcon("images/heartIcon.png")
        val label4 = JLabel(imageIcon)
        val label5 = JLabel("Mixed", imageIcon, SwingConstants.RIGHT)
        frame.add(label1)
        frame.add(label2)
        frame.add(label3)
        frame.add(label4)
        frame.add(label5)

        frame.pack()
        frame.isVisible = true
    }

    constructGUI()
}