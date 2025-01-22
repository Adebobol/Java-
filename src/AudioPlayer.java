import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

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

        try ( AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

           System.out.println("No problems detected.");
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file.");
        }catch(IOException e){
            System.out.println("Something went wrong.");

        } catch (UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported.");
        } catch (LineUnavailableException e){
            System.out.println("Unable to access audio resource.");

        }
    }
}
