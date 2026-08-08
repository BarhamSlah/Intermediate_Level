UnsupportedAudioFileException: Occurs when the audio format (e.g., .mp3) is not supported
by standard Java Sound APIwhich natively expects formats like .wav.

        LineUnavailableException: Occurs when the system audio device or speaker
cannot be opened because it is busy, disconnected, or locked by another process

***************************************************************************************

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Best Tech\\IdeaProjects\\Practice\\src\\Barham.wav";
        File file = new File(filePath);

        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file) ;
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("P : play \nQ : quit \nR : reset \nS : stop");
            System.out.print("Write your choice ");
            String choice = scanner.nextLine();

            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            while (!choice.equalsIgnoreCase("Q")) {

                if (choice.equalsIgnoreCase("P")) {
                    clip.start();
                } else if (choice.equalsIgnoreCase("S")) {
                    clip.stop();
                } else if (choice.equalsIgnoreCase("Q")) {
                    clip.close();
                } else if (choice.equalsIgnoreCase("R")) {
                    clip.setMicrosecondPosition(0);
                } else {
                    System.out.println("Invalid choice");
                }
            }

        } catch (FileNotFoundException e){
            System.out.println("a");
        } catch(IOException e) {
            System.out.println("Something went wrong");
        } catch(UnsupportedAudioFileException e){
            System.out.println("This audio is not supported");
        } catch (LineUnavailableException e){
            System.out.println("unable to access audio");
        } finally {
            System.out.println("Bye for now 🙋");
        }

    }
}