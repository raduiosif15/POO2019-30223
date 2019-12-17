/** DragDemo.java – Aplicatie duala de târâre a mouse
 @author Fred Swartz
 @version 2004-04-15
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
////////////////////////////////////////////////////////// class DragDemo
public class DragDemo{
    //======================================================== metoda main
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("Drag Demo");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new DragBallPanel());
        window.pack();
        window.setVisible(true);
    }//end main

}//endclass DragDemo
