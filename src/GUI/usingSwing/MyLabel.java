package GUI.usingSwing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel extends JLabel {

    MyLabel(String text, ImageIcon icon){
        super(text,icon,JLabel.CENTER);

        //Set label size (mandatory for label to display as soon as frame has dimensions (otherwise 100%)
        //this.setBounds(25,25,450,450);


        Border border = BorderFactory.createLineBorder(Color.white,3,true);
        this.setBorder(border);


        //Set position of figure inside label box
        this.setVerticalAlignment(JLabel.CENTER);
        // this.setHorizontalAlignment(JLabel.CENTER); // Already set by constructor

        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);
        this.setForeground(Color.white); //Change text color
        this.setFont(new Font("Comic Sans",Font.BOLD,24)); // set text font parameters
        this.setIconTextGap(25); // set icon margin top (can be negative too)

        this.setBackground(new Color(0x2e275d)); //set label color
        this.setOpaque(true); //display background




    }
}
