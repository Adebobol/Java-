import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioPlayer {
    public static void main(String[] args) {
        // ?How to play audio with java


        String filepath = "C:\\Users\\OXYMO\\Java Tut\\main\\src\\audio\\13 Break Or Make Me - (SongsLover.com).wav";

        File file = new File(filepath);
        Scanner scanner = new Scanner(System.in);

        try ( AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);


            String response = "";
            while(!response.equals("Q")){
                System.out.println("P = PLay");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");

                System.out.print("Enter your choice: ");
                response = scanner.next().toUpperCase();

                switch(response){
                    case "P":
                        clip.start();
                        break;
                    case "S":
                        clip.stop();
                    case "R":
                        clip.setMicrosecondPosition(0);
                        break;
                    case "Q":
                        clip.close();
                        break;
                    default:
                        System.out.println("Invalid response.");

                }
            }

           System.out.println("No problems detected.");
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file.");
        }catch(IOException e){
            System.out.println("Something went wrong.");

        } catch (UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported.");
        } catch (LineUnavailableException e){
            System.out.println("Unable to access audio resource.");

        } finally {
            System.out.println("Bye!!");
        }

        scanner.close();
    }
}
