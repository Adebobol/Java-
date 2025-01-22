import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args) {
        // ?How to read a file using (s popular options)

        // BufferedReader + FileReader: Best for reading text files line-by-line.
        // FileInputStream: Best for binary files (e.g images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file.

        String filePath = "C:\\Users\\OXYMO\\Desktop\\java.txt";

        

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // reader.read();
            System.out.println("File exists in location.");
        } catch (FileNotFoundException e){
            System.out.println("File to be read can't be found.");

        } catch(IOException e) {
            System.out.println("Something went wrong.");

        }
    }
}
