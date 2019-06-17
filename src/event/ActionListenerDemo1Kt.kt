package event

import java.awt.Dimension
import javax.swing.*



fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        JDialog.setDefaultLookAndFeelDecorated(true)
        val frame = JFrame("ActionListener Test 1")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        //建立空白邊框的contentPanel
        val contentPanel = JPanel()
        val padding = BorderFactory.createEmptyBorder(10, 10, 10, 10)
        contentPanel.border = padding
        frame.contentPane = contentPanel

        //建立Button
        val button = JButton("Register")

        //加入Button大小
        button.preferredSize = Dimension(150, 40)

        //Button加入監聽
        button.addActionListener{
            val source = it?.source as JButton
            val buttonText = source.text
            JOptionPane.showMessageDialog(null, "you Click $buttonText")
        }

        frame.contentPane.add(button)
        frame.pack()
        frame.isVisible = true
    }

    SwingUtilities.invokeLater{constructGUI()}
}
