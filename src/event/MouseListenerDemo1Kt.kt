package event

import java.awt.Dimension
import java.awt.Frame
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.JFrame
import javax.swing.SwingUtilities

class MouseClickListenerKt:MouseAdapter(){
    override fun mouseClicked(e: MouseEvent?) {
        super.mouseClicked(e)
        if (SwingUtilities.isLeftMouseButton(e)){
           println("The mouse left button was clicked")
        }else if(SwingUtilities.isRightMouseButton(e)){
            println("The Mouse Right button was Clicked")
        }
        println("${e!!.clickCount} time(s)")
        val x = e!!.x
        val y = e!!.y
        println("at( $x, $y)")
    }
}

fun main(){
    fun constructGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true)
        val frame = JFrame("MouseListener Test 1")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.addMouseListener(MouseClickListenerKt())
        frame.setSize(200, 200)
        frame.isVisible = true
    }

    SwingUtilities.invokeLater ( Runnable {
        constructGUI()
    } )
}