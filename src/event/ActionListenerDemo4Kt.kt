package event

import java.awt.FlowLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*


class ActionListenerDemo4Kt(title:String):JFrame(title){
     private inner class RadioClickListener: ActionListener{
        override fun actionPerformed(e: ActionEvent?) {
            val command = e?.actionCommand
            this@ActionListenerDemo4Kt.title = command
        }
     }

    init {
        this.layout = FlowLayout()
        this.defaultCloseOperation = EXIT_ON_CLOSE

        //建立空白邊框的contentPanel
        val contentPanel = JPanel()
        val padding = BorderFactory.createEmptyBorder(10, 10, 10, 10)
        contentPanel.border = padding
        this.contentPane = contentPanel


        val redButton = JRadioButton("Red")
        val greenButton = JRadioButton("Green")
        val blueButton = JRadioButton("Blue")

        val listener = RadioClickListener()
        redButton.addActionListener(listener)
        greenButton.addActionListener(listener)
        blueButton.addActionListener(listener)

        val colorButtonGroup = ButtonGroup()
        colorButtonGroup.add(redButton)
        colorButtonGroup.add(greenButton)
        colorButtonGroup.add(blueButton)
        redButton.isSelected = true
        add(JLabel("Color:"))
        add(redButton)
        add(greenButton)
        add(blueButton)
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



