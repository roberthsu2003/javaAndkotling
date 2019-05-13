import javax.swing.ImageIcon
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.SwingUtilities

fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        val frame = JFrame()
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.title = "JButton Test"
        val imageIcon = ImageIcon("images/heartIcon.png")
        val loginButton = JButton("Login", imageIcon)
        frame.add(loginButton)
        frame.pack()
        frame.isVisible = true
    }

    SwingUtilities.invokeLater { constructGUI() }
}