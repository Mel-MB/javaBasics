package GUI.usingSwing;

import javax.swing.*;
import java.awt.*;

public class FrameComponent extends JFrame {

    FrameComponent(){
        // Frame object creation

        // Set Frame properties
        this.setTitle("JFrame title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Default is HIDE_ON_CLOSE
        //this.setResizable(false); //Prevent frame resize
        this.setSize(800,1200);


        ImageIcon image = new ImageIcon("src/GUI/usingSwing/medias/logo.png");
        this.setIconImage(image.getImage());

        this.getContentPane().setBackground(new Color(0xadadad)); //Set background color
        this.setOpacity(1);

        // Display
        this.setVisible(true); //Make frame visible
    }
}
