"In both cases—reading a file and writing a file—you must use a try-catch block

All of them are Java classes used to write text to files

Classes        :   When to use it?
FileWriter :  For small text files.
BufferedWriter :  For large amounts of text and big files
PrintWriter :  For creating structured logs and reports.
FileOutputStream :  For binary files (images, audio, video).

if you write file path the stuffs store in the file or forlder that you its file path but if don't do that
the stuffs store in the file that you just created

***************************************************************************************************************

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String store = "This code absolutely was written by me";

        try(FileWriter fileWriter = new FileWriter("MyFile.txt")) {
            fileWriter.write(store);
        } catch (FileNotFoundException e){
            System.out.println("Your file path is wrong");
        } catch (IOException e){
            System.out.println("Your issue is " + e.getMessage());
        }

    }
}
