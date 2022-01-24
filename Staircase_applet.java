/* This code is to create applet. Import ‘swing.*’ to create graphical user interface. Then import applet for creating applet, 
   follow by ‘awt.*’ to import graphic. First open public class and set integer valuables. Public void init() to allow user to input. 
   After that ‘while’ is request to re-enter positive number if negative number received until receive positive input. Next is public 
   void paint (Graphics g) is for draw a graphic in the applet. For loop to the formular to repeat counting form the input of stepsCount. */

import javax.swing.*;           // to allow creating windows app
import java.applet.Applet;          // import applet package
import java.awt.*; // import graphic (link to line 15)

public class Question3Applet extends Applet {           // create Applet

    int stepsCount;

    public void init() { //init to allow users to input number
        stepsCount = Integer.parseInt(JOptionPane.showInputDialog("Enter number of steps"));
        while (stepsCount <= 0 ) {
            stepsCount = Integer.parseInt(JOptionPane.showInputDialog("Please enter valid number!"));
        }
    }
    public void paint(Graphics g) {
        int row = 50, col = 50, x; //col=column
        for (x = 1; x <= stepsCount; x++) { //x++ = plus to the stepsCount input
            g.drawLine(col, row, col + 30, row);
            col = col + 30;         // col = column
            g.drawLine(col, row, col, row + 30);
            row += 30;
        }
    }
}
