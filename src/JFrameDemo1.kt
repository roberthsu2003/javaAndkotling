import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.SwingUtilities

fun constructGUI(){
    val frame = JFrame()
    frame.title = "My First Swing Application"
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    val label = JLabel("welcome")
    frame.add(label)
    frame.pack()
    frame.isVisible = true
}

fun main(){
    //SwingUtilities.invokeLater(::constructGUI)
    /*
    SwingUtilities.invokeLater(Runnable {
        constructGUI()
    })
    */
     SwingUtilities.invokeLater {
         constructGUI()
     }
}