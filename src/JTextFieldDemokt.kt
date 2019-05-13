import java.awt.GridLayout
import javax.swing.*

fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        val frame = JFrame()
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.title = "JTextField Test"
        frame.layout = GridLayout(2, 2)
        val label1 = JLabel("User Name:", SwingConstants.RIGHT)
        val label2 = JLabel("User Name", SwingConstants.RIGHT)
        val userNameField = JTextField(20)
        val passwordField = JPasswordField()
        frame.add(label1)
        frame.add(userNameField)
        frame.add(label2)
        frame.add(passwordField)
        frame.setSize(200, 70)
        frame.isVisible = true
    }

    SwingUtilities.invokeLater { constructGUI() }
}