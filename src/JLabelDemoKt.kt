import javax.swing.*
import java.awt.*

fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        val frame = JFrame()
        frame.title = "JLabel Test"
        val layout = FlowLayout()
        layout.hgap = 20
        layout.vgap = 30
        frame.layout = layout
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        val label1 = JLabel("First Name")
        label1.font = Font("Courier New", Font.ITALIC, 20)
        label1.foreground = Color.GRAY

        val label2 = JLabel()
        label2.text = "<html>Last Name<br><font face='courier new' color=red>(mandatory)</font></html>"

        val label3 = JLabel()
        label3.text = "<html>LastName<br><font face='garamond' color='green'>(mandatory)</font></html>"

        val heartIcon = ImageIcon("images/heartIcon.png")
        val label4 = JLabel(heartIcon)

        val addIcon = ImageIcon("images/add.png")
        val label5 = JLabel("購物車", addIcon, SwingConstants.RIGHT)

        frame.add(label1)
        frame.add(label2)
        frame.add(label3)
        frame.add(label4)
        frame.add(label5)

        frame.pack()
        frame.isVisible = true
    }

    SwingUtilities.invokeLater {
        constructGUI()
    }
}