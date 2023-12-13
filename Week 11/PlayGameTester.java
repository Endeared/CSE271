/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 12/3/2023
 * PlayGameTester.java - used for creating our game class and
 * then calling said class's playNow method to simulate a game
 * of Go Fish.
**/

public class PlayGameTester {

   public static void main(String[] args) throws Exception {
   
      PlayGame game = new PlayGame(2, 7);
      game.playNow();
   
   }

}