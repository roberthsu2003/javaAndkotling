import java.awt.Dimension
import java.awt.Rectangle
import javax.swing.JButton
import javax.swing.JFrame

fun main(){
    var jFrame = JFrame()
    var jButton = JButton()
    jButton.bounds = Rectangle(100,100,100,50)
    jButton.text = "Hello"
    jFrame.add(jButton)
    jFrame.size = Dimension(400,400)
    jFrame.layout = null
    jFrame.isVisible = true
}