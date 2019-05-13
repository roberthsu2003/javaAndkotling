import java.awt.Button
import java.awt.FlowLayout
import java.awt.event.ActionEvent
import javax.swing.JDialog
import javax.swing.JFrame
import javax.swing.SwingUtilities

class JDialogDemoKt(title:String):JFrame(title){
    val dialog = AddressDialog(this,false)
    constructor():this("no title")

    init{
        this.contentPane.layout = FlowLayout()
        this.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        val button = Button("Show Dialog")
        button.addActionListener { e:ActionEvent -> displayDialog()}
        this.contentPane.add(button)
    }

    fun displayDialog(){
        dialog.setSize(250,120)
        dialog.isVisible = true
    }
}

fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        JDialog.setDefaultLookAndFeelDecorated(true)
        val frame = JDialogDemo()
        frame.pack()
        frame.isVisible = true
    }

    SwingUtilities.invokeLater { constructGUI() }
}