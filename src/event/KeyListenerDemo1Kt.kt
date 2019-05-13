package event

import java.awt.BorderLayout
import java.awt.event.KeyEvent
import java.awt.event.KeyListener
import javax.swing.JFrame
import javax.swing.JTextField
import javax.swing.SwingUtilities

class KeyListenerDemo1Kt(title:String):JFrame(title),KeyListener{

    init{
        contentPane.layout = BorderLayout()
        val textField = JTextField(20)
        textField.addKeyListener(this)
        contentPane.add(textField)
    }

    override fun keyTyped(e: KeyEvent?) {
        e!!.keyChar = Character.toUpperCase(e!!.keyChar)
    }

    override fun keyPressed(e: KeyEvent?) {
    }

    override fun keyReleased(e: KeyEvent?) {
    }

    companion object{
        private fun constructGUI(){
            setDefaultLookAndFeelDecorated(true)
            val frame = KeyListenerDemo1Kt("KeyListener Demo 1")
            frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            frame.pack()
            frame.isVisible = true
        }
        @JvmStatic
        fun main(args:Array<String>){
            SwingUtilities.invokeLater {
                constructGUI()
            }
        }
    }
}