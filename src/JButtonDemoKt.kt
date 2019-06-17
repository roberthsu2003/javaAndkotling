import javax.swing.*
import java.awt.*

object JButtonDemoKt {
    private class CustomFrame(title: String, buttonText: String) : JFrame(title) {
        init {
            JFrame.setDefaultLookAndFeelDecorated(true)
            defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            val imageIcon = ImageIcon("images/heartIcon.png")
            val imageButton = JButton(buttonText, imageIcon)
            imageButton.preferredSize = Dimension(200, 200)
            add(imageButton)
        }
    }

     fun constructGUI() {
        val frame = CustomFrame("JButtonDemo", "Heart")
        frame.pack()
        frame.isVisible = true
    }


}

fun main(){
    SwingUtilities.invokeLater { JButtonDemoKt.constructGUI() }

}
