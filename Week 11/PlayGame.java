/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 12/3/2023
 * PlayGame.java - used for creating our game class and playing the game
 * via the PlayGameTester class.
**/

// imports
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class PlayGame {

   // instance vars
   private LinkedList<Hand> playerHands;
   private DeckList funDeck;
   private int numPlayers;
   private int[] playerScores;

   // constructor, which takes in numPlayers and handSize, two ints
   public PlayGame(int numPlayers, int handSize) throws Exception {
      // assigning instance variables
      this.numPlayers = numPlayers;
      this.playerHands = new LinkedList<Hand>();
      this.playerScores = new int[numPlayers];
      
      // creating a deck and shuffling it, then assignign to instance var
      DeckList deck = new DeckList();
      deck.shuffle();
      this.funDeck = deck;
      
      // throwing exception if player num isnt as expected
      if (numPlayers < 2 || numPlayers > 4) {
         throw new Exception("Error - number of players must be between 2 and 4 (inclusive).");
      // otherwise, iterate over players and create a new hand, and add it to playerHands
      } else {
         for (int i = 0; i < numPlayers; i++) {
            Hand thisHand = new Hand(handSize);
            playerHands.add(thisHand);
         }
      }
      
      // call dealHands
      dealHands();
   }
   
   /**
    * private dealHands method, which simply iterates over all player hands and grabs
    * the hand size, iterating up to that hand size and grabbing a card from the deck,
    * then adding said card to the hand
    * @param args unused
    * @return nothing (void)
    */
   private void dealHands() {
      // iterating over player hands, and adding cards for their current handsize
      // in a nested loop, then sorting by rank
      for (int i = 0; i < playerHands.size(); i++) {
         Hand thisHand = playerHands.get(i);
         for (int j = 0; j < thisHand.getHandSize(); j++) {
            Card currentCard = funDeck.getCard();
            thisHand.addCard(currentCard);
         }
         thisHand.sortHandByRank();
      }
   }
   
   /**
    * getNumPlayers method, which simply returns the # of players
    * @param args unused
    * @return this.numPlayers, the number of players in the game
    */
   public int getNumPlayers() {
      return this.numPlayers;
   }
   
   /**
    * getHand method, which simply returns the hand of said player
    * @param playerNum, an int representing the player
    * @return this.playerHands.get(playerNum), a Hand representing the player
    * hand of player playerNum
    */
   public Hand getHand(int playerNum) {
      return this.playerHands.get(playerNum);
   }
   
   /**
    * showHand method, which simply shows the player hand at a specified
    * player number
    * @param playerNum, an int representing the player
    * @return nothing (void)
    */
   public void showHand(int playerNum) {
      this.playerHands.get(playerNum).showHand();
   }
   
   /**
    * hasFourOfaKind method, which takes in a player number and then returns
    * true or false depending on if the user has four of a kind of one card rank
    * @param playerNum, an int representing the player
    * @return true if player has four of a kind, false if they do not
    */
   public boolean hasFourOfaKind(int playerNum) {
      // sentinel boolean, grabbing playerHand, assigning
      // a rank Array, and creating a HashMap to keep track of rank count
      boolean result = false;
      Hand playerHand = playerHands.get(playerNum);
      int[] rankArray = new int[playerHand.getTotalCards()];
      Map<Integer, Integer> rankMap = new HashMap();
      
      // add cards to array
      for (int i = 0; i < playerHand.getTotalCards(); i++) {
			Card s = playerHand.getCard(i);
         if (s != null) {
            int cardRank = s.getRank();
            rankArray[i] = cardRank;
         }
      }
      
      // for rank in array, check if our HashMap contains the rank - if it
      // does, increment the value of the key by 1
      for (Integer rank : rankArray) {
         if (rankMap.containsKey(rank)) {
            rankMap.put(rank, rankMap.get(rank) + 1);
         // otherwise add our rank to the hashmap with a value of 1
         } else {
            rankMap.put(rank, 1);
         }
      }
      
      // iterate over our hashmap values (occurrences), and look for one where
      // a rank has 4 occurrences
      for (int occurrences : rankMap.values()) {
         if (occurrences == 4) {
            result = true;
            break;
         }
      }
      
      // return result
      return result;
   }
   
   /**
    * hasWantedCard method, which checks if the user has a specified
    * card of a specific rank, and returns a boolean representing if they do
    * (true) or if they do not (false)
    * @param playerNum, an int representing the player
    * @param checkRank, an int representing the card rank to check for
    * @return true if target user has a card of matching rank, otherwise false
    */
   public boolean hasWantedCard(int playerNum, int checkRank) {
      // getting hand and creating array
      Hand playerHand = playerHands.get(playerNum);
      int[] rankArray = new int[playerHand.getTotalCards()];
      
      // adding card ranks to array
      for (int i = 0; i < playerHand.getTotalCards(); i++) {
      	Card s = playerHand.getCard(i);
         if (s != null) {
            int cardRank = s.getRank();
            rankArray[i] = cardRank;
         }
      }
      
      // checking array for rank, return true if found
      for (int i = 0; i < rankArray.length; i++) {
         if (rankArray[i] == checkRank) {
            return true;
         }
      }
      
      // otherwise we return false
      return false;
   }
   
   /**
    * updateScore method, which simply takes in a player number and
    * increments their score
    * @param playerNum, an int representing the player
    * @return nothing (void)
    */
   public void updateScore(int playerNum) {
      playerScores[playerNum] += 1;
   }
   
   /**
    * showScores method, which simply displays the scores of all players
    * @param args unused
    * @return nothing (void)
    */
   public void showScores() {
      for (int i = 0; i < playerScores.length; i++) {
         System.out.println("Player " + i + ": " + playerScores[i] + " points");
      }
   }
   
   /**
    * determineWinner method, which checks users and their scores and determines
    * if their is a single winner (true), or a draw / no winner (false) and returns
    * said boolean to the user
    * @param args unsued
    * @return true if there is a single winner, otherwise false
    */
   public boolean determineWinner() {
      // set default highest score, winning player #, and winner bool to false
      int highestScore = 0;
      int winningPlayer = -1;
      boolean winner = false;
      
      // iterate over playerscores, if one score is higher than highest score we
      // log appropriate info and set highest score
      for (int i = 0; i < playerScores.length; i++) {
         if (playerScores[i] > highestScore) {
            winner = true;
            highestScore = playerScores[i];
            winningPlayer = i;
         // otherwise if scores are equal, we set winner to false (currently a tie)
         // and winningPlayer back to -1
         } else if (playerScores[i] == highestScore) {
            winner = false;
            winningPlayer = -1;
         }
      }
      
      // prompting user with winner / draw / no winner message accordingly and returning winner bool
      if (winner == true) {
         System.out.println("Player " + winningPlayer + " wins with a score of " + highestScore + "!");
         return winner;
      } else if (winner == false && highestScore > 0) {
         System.out.println("There was a draw with a highest score of " + highestScore + ".");
         return winner;
      } else {
         System.out.println("No player had a score over 0, thus there was no winner.");
         return winner;
      }
   }

   public void displayHands(PlayGame game, int players) {

      for (int i = 0; i < players; i++) {
         System.out.println("=== PLAYER " + i + "'S HAND ===");
         game.showHand(i);
         System.out.println();
      }
      
   }
   
   // playNow function to test the game
   public void playNow() throws Exception {
      
      // input, and # of players
      Scanner inp = new Scanner(System.in);
      int players = 0;
      
      // repeatedly prompt user for valid # of players
      while (true) {
         System.out.print("Enter # of players: ");
         players = Integer.parseInt(inp.nextLine());
         if (players >= 2 && players <= 4) {
            break;
         } else {
            System.out.println("Invalid # of players. Pick a number from 2 and 4.");
         }
      }
      
      // start our game and set endGame bool to true
      PlayGame game = new PlayGame(players, 7);
      boolean endGame = false;
      System.out.println();
      
      // while our bool is true, we print the users hands each round
      while (!endGame) {
         displayHands(game, players);
      
         // and we take turns for each player, allowing them to enter a card rank to check for and which player to target
         // their check on
         for (int i = 0; i < players; i++) {
            boolean validTurn = false;
            boolean validInputs = false;
            int cardRank = 0;
            int playerNumber = 0;

            // check if deck has cards and if player has 1 or more cards in hand
            if (game.funDeck.getCardsLeft() > 0 || game.getHand(i).getTotalCards() > 0) {
               validTurn = true;
            } else if (game.funDeck.getCardsLeft() <= 0 && game.getHand(i).getTotalCards() <= 0) {
               System.out.println("Player " + i + " has no cards in their hand and no cards remain in deck, so they cannot take a turn.");
               validTurn = false;
            }

            if (validTurn) {
               // we will repeatedly prompt for these values until valid
               while (!validInputs) {
                  try {
                     System.out.print("Enter a card rank to check for Player " + i + ": ");
                     cardRank = Integer.parseInt(inp.nextLine());
                  // check if current player has card they are fishing for
                     if (game.hasWantedCard(i, cardRank)) {
                        System.out.print("Enter the player # to check for said card (number between 0 and " + (players - 1) + ", not including yourself!): ");
                        playerNumber = Integer.parseInt(inp.nextLine());
                        if (playerNumber >= 0 && playerNumber <= players - 1 && playerNumber != i) {
                           if (cardRank >= 2 && cardRank <= 14) {
                              validInputs = true;
                           }
                        } else {
                           System.out.println("One or more invalid inputs. Please check your values.");
                        }
                     } else {
                        System.out.println("You do not have a card of rank " + cardRank + ".");
                     }
                  } catch (Exception error) {
                     System.out.println("One or more invalid inputs. Please check your values.");
                  }
               }
               

               // check if player has wanted card
               if (game.hasWantedCard(playerNumber, cardRank)) {
                  System.out.println("Player " + i + " has a card of rank " + cardRank + "!");
                  game.updateScore(i);
                  // remove card from opposing players hand amd add it to current players hand
                  Hand playerHand = game.getHand(playerNumber);
                  ArrayList<Integer> cardsIndicesToChange = new ArrayList<>();
                  for (int j = 0; j < playerHand.getTotalCards(); j++) {
                     Card currentCard = playerHand.getCard(j);
                     if (currentCard != null && currentCard.getRank() == cardRank) {
                        cardsIndicesToChange.add(j);
                     }
                  }

                  for (int j = cardsIndicesToChange.size() - 1; j >= 0; j--) {
                     Card c = playerHand.removeCard(cardsIndicesToChange.get(j));
                     game.getHand(i).addCard(c);
                  }
               } else {
                  System.out.println("Player " + playerNumber + " does not have a card of rank " + cardRank + ".");

                  // player does not have card, so current player draws from deck and adds it to their hand
                  // if deck has cards
                  boolean hasCards = game.funDeck.getCardsLeft() > 0;
                  if (!hasCards) {
                     System.out.println("Deck is empty, so no cards can be drawn.");
                     break;
                  } else {
                     Card drawnCard = game.funDeck.getCard();
                     System.out.println("Player " + i + " draws a " + drawnCard.getRankAsString() + " of " + drawnCard.getSuitAsString() + " from the deck.");
                     game.getHand(i).addCard(drawnCard);
                  }
               }

               // sort hand by rank
               game.getHand(i).sortHandByRank();

               // check if player has four of a kind
               if (game.hasFourOfaKind(i)) {
                  System.out.println("Player " + i + " has four of a kind!");
                  game.updateScore(i);

                  // remove four of a kind from hand
                  Hand playerHand = game.getHand(i);
                  ArrayList<Integer> cardsIndicesToChange = new ArrayList<>();
                  for (int j = 0; j < playerHand.getTotalCards(); j++) {
                     Card currentCard = playerHand.getCard(j);
                     if (currentCard.getRank() == cardRank) {
                        cardsIndicesToChange.add(j);
                     }
                  }

                  for (int j = cardsIndicesToChange.size() - 1; j >= 0; j--) {
                     Card c = playerHand.removeCard(cardsIndicesToChange.get(j));
                  }
               }
            }

            System.out.println();
            
         }

         // check if any player has 2 points
         for (int i = 0; i < players; i++) {
            if (game.playerScores[i] == 2) {
               endGame = true;
               break;
            }
         }

         // check if deck has cards and if all players are out of cards
         if (game.funDeck.getCardsLeft() == 0) {
            for (int i = 0; i < players; i++) {
               if (game.getHand(i).getTotalCards() > 0) {
                  endGame = false;
                  break;
               } else {
                  endGame = true;
               }
            }
         }
         
         if (endGame == true) {
            break;
         }
      }

      game.showScores();
      game.determineWinner();
   }
   
}