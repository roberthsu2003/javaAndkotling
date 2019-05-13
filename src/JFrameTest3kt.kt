import java.awt.GridLayout
import java.awt.Toolkit
import javax.swing.*

fun main(){


    class MyFrame:JFrame{
        constructor():super()
        constructor(title:String):super(title)

        init{
            this.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            this.title = "JFrame Test"
            this.layout = GridLayout(3,2)
            this.add(JLabel("FirstName:"))
            this.add(JTextField())
            this.add(JLabel("LastName:"))
            this.add(JTextField())
            this.add(JButton("Register"))
            val frameWidth = 200
            val frameHeight = 100
            val screenSize = Toolkit.getDefaultToolkit().screenSize
            this.setBounds(screenSize.width - frameWidth, 0, frameWidth, frameHeight)
        }
    }

    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        val frame = MyFrame()
        frame.isVisible = true
    }

    constructGUI()



}