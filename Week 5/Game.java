/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 10/18/2023
 * Game class, which plays a simple game
 via rolling several Dice in a DiceTower and
 determines a winner based on the sum of said Dice.
 *
**/

// no vod

// arraylist import
import java.util.ArrayList;

public class Game {
   
   public static void main(String[] args) {
   
      // creating DiceTower
      DiceTower dt = new DiceTower();
      // adding dice to our DiceTower, printing out DiceTower as string to make
      // sure dice were added correctly
      addDice(dt);      
      System.out.println(dt.toString()); // DiceTower::5 2 4 6 8 10:4 3 5 7 9:13 1 2 3 4 5 6 7 8 9 10 11 12 13
      System.out.println(); // new line for formatting
      
      // setting each players wins to 0
      int playerOneWins = 0;
      int playerTwoWins = 0;
      
      // repeat 3 times
      for(int i = 0; i < 3; i++) {
         // rolling dice, then calculating player one sum using die 0 and 2
         // (even die and die 1-13)
         dt.roll();
         int playerOneSum = rollDice("Player 1", dt.getDie(0), dt.getDie(2));
         
         // rolling again, then calculating player two sum using die 1 and 2
         // (odd die and die 1-13)
         dt.roll();
         int playerTwoSum = rollDice("Player 2", dt.getDie(1), dt.getDie(2));
         
         // determining winner of round and incrementing their win count +
         // printing appropriate message
         if (playerOneSum > playerTwoSum) {
            playerOneWins += 1;
            System.out.println("Player one wins the round!");
            System.out.println();
         } else if (playerTwoSum > playerOneSum) {
            playerTwoWins += 1;
            System.out.println("Player two wins the round!");
            System.out.println();
         } else {
            System.out.println("The round is a tie!");
            System.out.println();
         }
      }
      
      // determine a winner
      winner(playerOneWins, playerTwoWins);
      
   }
   
   /**
    * addDice method, which takes in a DiceTower object and then
    * adds three different Die to it - one with even values 2-10
    * one with odd values 3-9, and one with all values 1-13.
    * @param dt, a DiceTower object to add Dice to
    * @return none (void)
    */
   public static void addDice(DiceTower dt) {
   
      // creating ArrayList, adding values to the list through for loop,
      // then creating Die object from that ArrayList & clearing the list
      // after
      ArrayList<Integer> testValues = new ArrayList<Integer>();
      for (int i = 2; i <= 10; i += 2) {
         testValues.add(i);
      }
      Die firstDie = new Die(testValues);
      testValues.clear();
      
      // again, adding values to list, create Die object with list, then
      // clear list
      for (int i = 3; i <= 9; i += 2) {
         testValues.add(i);
      }
      Die secondDie = new Die(testValues);
      testValues.clear();
      
      // again, adding values to list, create Die object with list, then
      // clear list
      for (int i = 1; i <= 13; i++) {
         testValues.add(i);
      }
      Die thirdDie = new Die(testValues);
      testValues.clear();
   
      // adding all three Die to our DiceTower
      dt.addDie(firstDie);
      dt.addDie(secondDie);
      dt.addDie(thirdDie);
   }
   
   /**
    * rollDice method, which takes in a player name, and then two Die objects
    * and calculates the sum of current facing values on the Die objects, then
    * calls the printRoll method and supplies the player name, first die value,
    * second die value, and sum, then returns the sum
    * @param player, a String representing the player's name
    * @param one, a Die object representing the first die
    * @param two, a Die object representing the second die
    * @return sum, an int value representing the sum of the current facing value
    * on each Die
    */
   public static int rollDice(String player, Die one, Die two) {
      int valOne = one.getCurrentValue();
      int valTwo = two.getCurrentValue();
      int sum = valOne + valTwo;
      printRoll(player, valOne, valTwo, sum);
      return sum;
   }
   
   /**
    * printRoll method, which takes in a player name, two values, a sum, and then
    * prints a message in a clean format showing the player name and each die value,
    * as well as their sum for the roll
    * @param player, a String representing the player's name
    * @param valOne, an int value representing the current face of their first Die
    * @param valTwo, an int value representing the current face of their second Die
    * @param sum, an int value representing the sum of valOne and valTwo
    @ return none (void)
    */
   public static void printRoll(String player, int valOne, int valTwo, int sum) {
      System.out.println("[" + player + "] Die one: " + valOne + ", Die two: " + valTwo + ", Sum: " + sum);
   }
   
   /**
    * winner method, which takes in a # of wins for player one, and a # of wins for
    * player two, and prints a game-ending message accordingly
    * @param winsOne, an int value representing player one's wins
    * @param winsTwo, an int value represneting player two's wins
    * @return none (void)
    */
   public static void winner(int winsOne, int winsTwo) {
      // if p1 wins > p2 wins (p1 is the winner)
      if (winsOne > winsTwo) {
         System.out.println("Player one wins the game at a score of " + winsOne + " - " + winsTwo + "!");
      // elif p2 wins > p1 wins (p2 is the winner)
      } else if (winsTwo > winsOne) {
         System.out.println("Player two wins the game at a score of " + winsTwo + " - " + winsOne + "!");
      // otherwise, p1 wins = p2 wins, so the game is a tie
      } else {
         System.out.println("The game is a tie with a score of " + winsOne + " - " + winsTwo + "!");
      }
   }
}


// sample run below
 //  ----jGRASP exec: java Game
 // Picked up _JAVA_OPTIONS: -Xmx512M
 // DiceTower::5 2 4 6 8 10:4 3 5 7 9:13 1 2 3 4 5 6 7 8 9 10 11 12 13
 // 
 // [Player 1] Die one: 8, Die two: 13, Sum: 21
 // [Player 2] Die one: 9, Die two: 1, Sum: 10
 // Player one wins the round!
 // 
 // [Player 1] Die one: 6, Die two: 10, Sum: 16
 // [Player 2] Die one: 3, Die two: 8, Sum: 11
 // Player one wins the round!
 // 
 // [Player 1] Die one: 8, Die two: 5, Sum: 13
 // [Player 2] Die one: 9, Die two: 4, Sum: 13
 // The round is a tie!
 // 
 // Player one wins the game at a score of 2 - 0!
 // 
 //  ----jGRASP: operation complete.