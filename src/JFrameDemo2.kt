import java.awt.GridLayout
import java.awt.Label
import java.awt.Toolkit
import javax.swing.*

fun constructGUI2(){
    JFrame.setDefaultLookAndFeelDecorated(true)
    val frame = JFrame()
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.title = "JFrame Test"
    frame.layout = GridLayout(3,2)
    frame.add(Label("First name:"))
    frame.add(JTextField())
    frame.add(JLabel("Last Name:"))
    frame.add(JTextField())
    frame.add(JButton("Register"))

    val frameWidth = 200
    val frameHeight = 100
    val screenSize = Toolkit.getDefaultToolkit().screenSize
    frame.setBounds(screenSize.width - (frameWidth+30), 0, frameWidth, frameHeight )
    frame.isVisible = true

}
fun main(){
    SwingUtilities.invokeLater{
        constructGUI2()
    }
}