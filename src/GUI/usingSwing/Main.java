package GUI.usingSwing;

import dataTypes.FormattedLocalTime;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Label = GUI display area for text String, Icon, or both
        MyLabel congratsLabel = new MyLabel("You're rockin' it ! Ready for take off ?", new ImageIcon("src/GUI/usingSwing/medias/science_rocks.png"));

        // Button = Classical buttons with action hooks
        JButton button = new JButton();
        button.setBounds(300,1000,200,100);
        button.addActionListener(e -> System.out.println("Button clicked at " + FormattedLocalTime.getTime()));
        button.setText("Click me !");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.lightGray);

        // JPanel = GUI container component
        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.BLACK);
        blackPanel.setBounds(0,0,450,350);

        JPanel whitePanel = new JPanel();
        whitePanel.setBackground(Color.white);
        whitePanel.setBounds(350,0,250,350);


        //JFrame = GUI window to add components to
        MyFrame frame = new MyFrame();

        blackPanel.add(congratsLabel);
        frame.add(blackPanel);
        frame.add(whitePanel);
        frame.add(button);

        //frame.pack(); //adjust frame content size according to window size

    }
}
