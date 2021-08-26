package filesCRUD;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class JavaFile {

    public static void main(String[] args) throws IOException {

        // file = An abstract representation of file and directory pathname

        File file = new File("src/filesCRUD/secret_message.txt");

        if(file.exists()) {
            // Get file's infos
            System.out.println("That file exists! 😈");
            System.out.println("relative file path: " + file.getPath());
            System.out.println("absolute file path: " + file.getAbsolutePath());

            // read file content
            System.out.println();
            System.out.println("File content: ");
            FileReader reader = new FileReader(file);
            int data = reader.read();

            while(data != -1) {
                System.out.print((char)data);
                //Go on to the next char
                data = reader.read();
            }

            reader.close();

            // Delete file
            file.delete();
        }
        else {
            System.out.println("That file doesn't exist :(");
        }
    }
}