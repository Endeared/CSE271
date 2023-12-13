import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.NoSuchElementException;
import javax.sound.sampled.*;

public class Zoo 
{
  public static void main(String[] args) throws Exception
  {
    String[] SOUND_FILENAME={ "wolf8.wav","lion_roar.wav","snakehit2.wav","cat_big_x.wav","cat_y.wav","alligator3.wav"};
    for(int i=0; i< SOUND_FILENAME.length; i++){
          try {         
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(SOUND_FILENAME[i])));
            clip.start();
            Thread.sleep(1000);
      } catch (Exception e) {
            System.out.println(e);
      }
      
      Thread.sleep(300);
    }
  }
  public static void print(String str){
    System.out.println(str);
  }
  
  public static void print(int num){
    System.out.println(num);
  }
}