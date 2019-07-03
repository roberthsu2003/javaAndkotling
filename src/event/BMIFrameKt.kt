package event

import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*

class BMIFrameKt(title:String,var isMale:Boolean? = true):JFrame(title){
    private lateinit var heightField:JTextField
    private lateinit var weightField:JTextField

    //建立性別監聽者class
    private inner class SexClickListener:ActionListener{
        override fun actionPerformed(e: ActionEvent?) {
            val command = e?.actionCommand
            isMale = when(command){
                "男" -> true
                "女" -> false
                else -> null
            }
            println(isMale)
        }
    }

    init{
        defaultCloseOperation = EXIT_ON_CLOSE

        //建立空白邊框的contentPanel
        val contentPanel = JPanel()
        val padding = BorderFactory.createEmptyBorder(20, 20, 20, 20)
        contentPanel.border = padding
        this.contentPane = contentPanel

        //建立GridLayout
        val gridLayout = GridLayout(5, 1)
        gridLayout.hgap = 10
        gridLayout.vgap = 10
        this.layout = gridLayout

        //加入TitleLabel
        val titleLabel = JLabel("BMI試算", SwingConstants.CENTER)
        titleLabel.font = Font(titleLabel.font.name, titleLabel.font.style, 30)
        this.add(titleLabel)

        //radioButton
        val sexPanel = JPanel()
        sexPanel.layout = FlowLayout()
        val maleButton = JRadioButton("男")
        val femaleButton = JRadioButton("女")

        //群組化radioButton
        val sexButtonGroup = ButtonGroup()
        sexButtonGroup.add(maleButton)
        sexButtonGroup.add(femaleButton)
        sexPanel.add(maleButton)
        sexPanel.add(femaleButton)
        maleButton.isSelected = true
        this.add(sexPanel)

        //建立性別監聽者class
        val sexClickListener = SexClickListener()
        maleButton.addActionListener(sexClickListener)
        femaleButton.addActionListener(sexClickListener)

        //建立heightPanel
        val heightPanel = Panel()
        heightPanel.layout = FlowLayout()
        val heightLabel = JLabel("身高", SwingConstants.LEADING)
        heightLabel.font = Font(titleLabel.font.name, titleLabel.font.style, 15)
        this.heightField = JTextField(10)
        val cmLabel = JLabel("cm")
        heightPanel.add(heightLabel)
        heightPanel.add(heightField)
        heightPanel.add(cmLabel)
        this.add(heightPanel)

        //建立weightPanel
        val weightPanel = Panel()
        weightPanel.layout = FlowLayout()
        val weightLabel = JLabel("體重", SwingConstants.LEADING)
        weightLabel.font = Font(titleLabel.font.name, titleLabel.font.style, 15)
        weightField = JTextField(10)
        val kgLabel = JLabel("kg")

        weightPanel.add(weightLabel)
        weightPanel.add(weightField)
        weightPanel.add(kgLabel)
        this.add(weightPanel)

        //建立Button
        val calculateButton = Button("計算")
        this.add(calculateButton)

        calculateButton.addActionListener {
                e:ActionEvent ->
            val heightString = heightField.text
            val weightString = weightField.text


                val height = heightString.toIntOrNull()
                var weight = weightString.toIntOrNull()
                if (height == null || weight == null){
                    JOptionPane.showMessageDialog(null, "身高或體重格式有誤", "警告", JOptionPane.ERROR_MESSAGE)
                    return@addActionListener
                }
                weight = if (isMale!!) weight else weight - 2
                val BMIValue = weight / (height / 100.0 * height / 100)
                var BMIMessage = when(BMIValue.toFloat()){
                    in 0.0..18.4 -> "體重過輕"
                    in 18.5..24.0 -> "正常範圍"
                    in 24.1..27.0 -> "過重"
                    in 27.1..30.0 -> "輕度肥胖"
                    in 30.1..35.0 -> "中度肥胖"
                    else -> "重度肥胖"
                }

            JOptionPane.showMessageDialog(
                null,
                "<html><center>您的BMI指數是 ${"%.2f".format(BMIValue)} <br><br> $BMIMessage </center></html>",
                "BMI指數",
                JOptionPane.INFORMATION_MESSAGE
            )

        }
    }
}

fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        JDialog.setDefaultLookAndFeelDecorated(true)
        val mainFrame = BMIFrameKt("BMI 試算")
        mainFrame.pack()
        mainFrame.isVisible = true
    }
    SwingUtilities.invokeLater { constructGUI()}
}