import javax.swing.JDialog
import javax.swing.JOptionPane

fun main(){
    JDialog.setDefaultLookAndFeelDecorated(true)
    val selectionValues = arrayOf<Any>("pandas", "Dogs", "Horses")
    val initialSelection = "Dogs"
    val selection = JOptionPane.showInputDialog(
        null,
        "What are your favorite animals",
        "Zoo Quiz",
        JOptionPane.QUESTION_MESSAGE,
        null,
        selectionValues,
        initialSelection
    )
    println(selection)
}