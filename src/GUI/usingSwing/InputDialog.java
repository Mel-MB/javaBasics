package GUI.usingSwing;

import javax.swing.*;

public class InputDialog {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, InputDialog.getMessage(name,age));
    }

    private static String getMessage(String name, int age){
        switch ((1 <= age && age < 18 ) ? 0 :
                (18 <= age) ? 1 : 2){
            case 0:
                return "Sorry "+name+" You are a minor.\n Good bye!";
            case 1:
                return "Come on in "+name+".";
            default:
                return "This is not a valid age. \n Good bye";
        }
    }
}
