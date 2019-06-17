import java.awt.GridLayout
import java.awt.Toolkit
import javax.swing.*

fun main(){


    class MyFrame:JFrame{
        constructor():super()
        constructor(title:String):super(title)

        init{
            defaultCloseOperation = EXIT_ON_CLOSE
            title = "JFrame Test"
            layout = GridLayout(3,2)
            add(JLabel("FirstName:"))
            add(JTextField())
            add(JLabel("LastName:"))
            add(JTextField())
            add(JButton("Register"))
            val frameWidth = 200
            val frameHeight = 100
            val screenSize = Toolkit.getDefaultToolkit().screenSize
            setBounds(screenSize.width - frameWidth, 0, frameWidth, frameHeight)
        }
    }

    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        val frame = MyFrame()
        frame.isVisible = true
    }

    constructGUI()



}