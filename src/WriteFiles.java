import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) {
        // How to write file using Java
        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for strctured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g images, audio files)

        // 
        String filePath = "C:\\Users\\OXYMO\\Desktop\\java.txt";
        String data = """
                Java Engineer.
                Really want to learn more about building big applications.
                I need a path even if it's not  aclear one.
                """;
    
        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write(data);
            System.out.println("File has been written.");
        } catch(FileNotFoundException e) {
            System.out.println("Could not find file location.");
        } catch(IOException e) {
            System.out.println("Could not write file.");
        }
    }
}
