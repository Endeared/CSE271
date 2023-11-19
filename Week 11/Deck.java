import java.util.*;


/**
 * Represents a deck of cards
 * Has two shuffle methods
 * 
 *
 */
public class Deck{
  
  public static final int DECKSIZE = 52;
  private Card[] deck;
  private int cardsDealt = 0;
  
  public Deck() {
    this.initializeDeck();
    cardsDealt=0;
  }
  
  /**
	 * reset method, which simply resets our cardsDealt instance
    * variable to 0.
    * @param args unused
    * @return nothing 
    */
  private void reset() {
    cardsDealt = 0;
  }
  
  /**
	 * getCardsLeft method, which returns the number of cards left
    * in the deck.
    * @param args unused
    * @return an int value representing the number of cards left
    * in the deck (deck length - # of cards dealt)
    */
  public int getCardsLeft() {
    return deck.length - cardsDealt;
  }
  
  /**
	 * getCardsDealt method, which returns the number of cards
    * already dealt.
    * @param args unused
    * @return cardsDealt, an int representing the # of cards dealt	 
    */
  public int getCardsDealt() {
    return cardsDealt;
  }
  
  /**
	 * dealCard method, which deals the next existing card in the
    * deck, assuming we are not out of cards
    * @param args unused
    * @return null if no cards left, otherwise returns Card at next
    * occupied index in the deck 
    */
  public Card dealCard() {
    if ( getCardsLeft() <= 0 ) {
      return null;
    }
    return deck[cardsDealt++];
  }
  
  /**
   * initializeDeck method, which creates a new deck as an array of
   * Card objects, and iterates over all possible combinations of
   * suits / ranks to create a new Card object of said combination,
   * then append it to the deck
   * @param args unused
   * @return nothing 
   */
  private void initializeDeck() {
    deck = new Card[DECKSIZE];
    int pos = 0;
    
    for( int suit = Card.SPADES; suit <= Card.DIAMONDS; suit++ ) {
      for( int rank = 2; rank <= Card.ACE; rank++ ) {
        deck[pos++] = new Card( suit, rank );
      }
    }
  }
  
  /**
	 * randomShuffle method, which grabs a card at a random position
    * in the deck and appends it to a new deck, then repeats that 
    * action x times (where x is the length of the deck)
    * @param args unused
    * @return nothing
    */
  public void randomShuffle() {
    Card[] other = deck;
    deck = new Card[deck.length];
    Random random = new Random(System.nanoTime());
    
    for( int i = 0; i < deck.length; i++ ) {
      int pos = random.nextInt(DECKSIZE);
      while( other[pos] == null ) {
        pos = random.nextInt(DECKSIZE);
      }
      deck[i] = other[pos];
      other[pos] = null;
    }
    reset();
  }
  
  /**
	 * randomShuffleSwap method, which iterates over the
    * length of the deck and swaps two Card objects at
    * random positions in the deck
    * @param args unused
    * @return nothing
    */
  public void randomShuffleSwap() {
    
    Random random = new Random(System.nanoTime());
    
    for( int i = 0; i < deck.length; i++ ) {
      int pos = random.nextInt(DECKSIZE);
      Card holder = new Card(deck[i]);
      deck[i] = deck[pos];
      deck[pos] = holder;
    }
    reset();
  }
  
  /**
	 * toString method, which iterates over the length of the
    * deck and concatenates the Card object to a String, then
    * returns the final string
    * @param args unused
    * @return retString, a String representation of the deck	 
    */
  public String toString(){
    String retString="";
    
    for (int i = 0; i<deck.length;i++){
      retString = retString + deck[i]+"\n";
      
      
    }
    return retString;
  }
}
