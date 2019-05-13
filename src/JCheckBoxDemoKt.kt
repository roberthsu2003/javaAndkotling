import java.awt.FlowLayout
import javax.swing.JCheckBox
import javax.swing.JFrame
import javax.swing.JLabel

fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        val frame = JFrame("JCheckBox Test")
        frame.layout = FlowLayout()
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        val ac = JCheckBox("A/C")
        ac.isSelected = true
        val cdPlayer = JCheckBox("CD Player")
        val cruiseControl = JCheckBox("Cruise Control")
        val keylessEntry = JCheckBox("keyless Entry")
        val antiTheft = JCheckBox("Anti-Theft")
        val centralLock = JCheckBox("Central Lock")

        frame.add(JLabel("Car Features"))
        frame.add(ac)
        frame.add(cdPlayer)
        frame.add(cruiseControl)
        frame.add(keylessEntry)
        frame.add(antiTheft)
        frame.add(centralLock)
        frame.pack()
        frame.isVisible = true
    }

    constructGUI()
}