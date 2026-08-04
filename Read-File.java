BufferedReader + FileReader  : Plain text files (.txt, .csv, .json)  :  Reads data line-by-line as text; efficient because it buffers memory.
FileInputStream	Binary files  :  (.jpg, .mp3, .pdf, .zip)  :  Reads raw bytes directly without trying to convert them into characters.
RandomAccessFile  :  Large files or database record	Uses a pointer :
        (seek()) to jump directly to any location in a file to read or write without starting from the beginning.


FileNotFoundException
 1- The file path or file name is misspelled.    2- The file does not exist on disk.
3- The path points to a directory (folder) instead of a file.   4- Opening a file for reading without read permissions.

IOException
1- Reading from or writing to a corrupted file.    2- A network or storage connection drops during transfer.
3- Disk space is full while trying to write.     4- Trying to read from a stream/reader that has already been closed.


You must always include the exact file name and extension (test.txt) at the end of the file path for both reading and writing files.

        When reading, Java needs the exact name so it knows which file to open.

        When writing, Java needs the exact name so it knows what to name the file it creates or overwrites.

 ******************************************************************************************************************

        import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Best Tech\\OneDrive\\Desktop\\test.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){

            String eachLine;
            while ((eachLine = bufferedReader.readLine()) != null) {
                System.out.println(eachLine);
            }

        }catch (FileNotFoundException e){
            System.out.println("Your file path is wrong");
        }catch (IOException e){
            System.out.println("Your issue is " + e.getMessage());
        }

    }
}