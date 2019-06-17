package event

import java.awt.FlowLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*


class ActionListenerDemo4Kt(title:String):JFrame(title){
     private inner class RadioClickListener: ActionListener{
        override fun actionPerformed(e: ActionEvent?) {
            val command = e!!.actionCommand
            this@ActionListenerDemo4Kt.title = command
        }
     }

    init {
        this.layout = FlowLayout()
        this.defaultCloseOperation = EXIT_ON_CLOSE

        val button1 = JRadioButton("Red")
        val button2 = JRadioButton("Green")
        val button3 = JRadioButton("Blue")
        val listener = RadioClickListener()
        button1.addActionListener(listener)
        button2.addActionListener(listener)
        button3.addActionListener(listener)

        val colorButtonGroup = ButtonGroup()
        colorButtonGroup.add(button1)
        colorButtonGroup.add(button2)
        colorButtonGroup.add(button3)
        button1.isSelected = true
        add(JLabel("Color:"))
        add(button1)
        add(button2)
        add(button3)
    }

    companion object{
        private fun constructGUI(){
            setDefaultLookAndFeelDecorated(true)
            val frame = ActionListenerDemo4Kt("ActionListener Demo 4")
            frame.pack()
            frame.isVisible = true
        }
        @JvmStatic
        fun main(args:Array<String>){
           SwingUtilities.invokeLater { constructGUI() }
        }
    }
}



