import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class SoundPlayer {

    public void playSound(String filePath) {
        try {
            // Open an audio input stream.
            File soundFile = new File(filePath);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

            // Get a sound clip resource.
            Clip clip = AudioSystem.getClip();

            // Open audio clip and load samples from the audio input stream.
            clip.open(audioIn);

            // Start playing the audio clip
            clip.start();

            // Optional: keep the application running till the sound has finished playing
            while (!clip.isRunning())
                Thread.sleep(10);
            while (clip.isRunning())
                Thread.sleep(10);

            clip.close(); // Close the clip once the playback is over
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SoundPlayer().playSound("/explore.wav");
    }

    public static void playWavLoop(String filePath) {
        try {
            // Open an audio input stream.
            URL audioFile = SoundPlayer.class.getResource("/explore.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
    
            // Get a sound clip resource.
            Clip clip = AudioSystem.getClip();
    
            // Open audio clip and load samples from the audio input stream.
            clip.open(audioStream);
            
            // Start playing the audio clip in a continuous loop.
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}