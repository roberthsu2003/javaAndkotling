import javax.swing.JDialog
import javax.swing.JOptionPane

fun main(){
    JDialog.setDefaultLookAndFeelDecorated(true);
    val response = JOptionPane.showConfirmDialog(null,"Do you want to continue?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)
    if (response == JOptionPane.NO_OPTION){
        println("No button clicked")
    }else if(response == JOptionPane.YES_OPTION){
        println("Yes button clicked")
    }else if (response == JOptionPane.NO_OPTION){
        println("JOptionPan close")
    }
}