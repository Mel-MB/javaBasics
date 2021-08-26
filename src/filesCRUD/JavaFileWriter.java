package filesCRUD;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFileWriter {

    public static void main(String[] args) {

        try {
            File txtFile = new File("src/filesCRUD/poem.txt");
            if (txtFile.createNewFile()) {
                System.out.println("File created: " + txtFile.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter writer = new FileWriter(txtFile);
            writer.write("Roses are red \nViolets are blue \n");
            writer.append("\n(Sorry, I'll be better next time)");
            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}