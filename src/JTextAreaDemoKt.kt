import java.awt.Dimension
import java.awt.FlowLayout
import javax.swing.JFrame
import javax.swing.JScrollPane
import javax.swing.JTextArea

fun main(){
    fun constructGUI(){
       JFrame.setDefaultLookAndFeelDecorated(true)
       val frame = JFrame("JTextArea Test")
       frame.layout = FlowLayout()
       frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
       val text = """A JTextArea object represents  a multiline area for displaying text.You con change the number of lines that can be displayed at a time as well as the number of columns.
           You cna wrap lines and words too. You cna also put your JTextArea in a JScrollPane to make it scrollable.
           """
       val textArea1 = JTextArea(text,5,10)
       textArea1.preferredSize = Dimension(100,100)
       val textArea2 = JTextArea(text,5,10)
       textArea2.preferredSize = Dimension(100,100)
       val scrollPane = JScrollPane(textArea2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS)
       textArea1.lineWrap = true
       textArea2.lineWrap = true
       frame.add(textArea1)
       frame.add(scrollPane)
       frame.pack()
       frame.isVisible = true
    }
    constructGUI()
}