package FrameDemo1
import java.awt.GridLayout
import java.awt.Toolkit
import javax.swing.*

fun constructGUI(){
    JFrame.setDefaultLookAndFeelDecorated(true)
    val frame = JFrame()
    //建立空白邊框的contentPanel
    val contentPanel = JPanel()
    val padding = BorderFactory.createEmptyBorder(10, 10, 10, 10)
    contentPanel.border = padding
    //視窗關閉,JVM同時關閉
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.title = "JFrame Test"
    frame.layout = GridLayout(3, 2, 0, 10)

    //建立FirstNameLabel
    val firstNameLabel = JLabel("First Name:")
    firstNameLabel.horizontalAlignment = JLabel.RIGHT
    frame.add(firstNameLabel)

    frame.add(JTextField())

    //建立LastNameLabel
    val lastNameLabel = JLabel("Last Name")
    lastNameLabel.horizontalAlignment = JLabel.RIGHT
    frame.add(lastNameLabel)

    frame.add(JTextField())

    frame.add(JButton("Register"))

    val frameWidth = 300
    val frameHeight = 150
    val screenSize = Toolkit.getDefaultToolkit().screenSize
    frame.setBounds(screenSize.width - (frameWidth+30), 0, frameWidth, frameHeight )
    frame.isVisible = true

}
fun main(){
    SwingUtilities.invokeLater{
        constructGUI()
    }
}