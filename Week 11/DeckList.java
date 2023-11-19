import java.util.LinkedList;
import java.util.Random;

public class DeckList extends Card {
	public static final int DECKSIZE = 52;
	private LinkedList<Card> deck;
	private int cardsDealt = 0;

	/**
	 * DeckList constructor / method, which constructs a new LinkedList
    * containing Card objects and initializes it to our deck instance
    * variable. Then, it calls the initializeDeck method and sets the
    * cardsDealt to 0.
	 */
	public DeckList() {
		deck = new LinkedList<Card>();
		this.initializeDeck();
		this.cardsDealt = 0;
	}

   /**
	 * initializeDeck method, which iterates over all possible combinations
    * of Card suits / ranks, and creates a new Card object for each
    * possible combination and adds it to our deck LinkedList
    * @param args unused
    * @return nothing	 
    */
	private void initializeDeck() {
		for (int suit = Card.SPADES; suit <= Card.DIAMONDS; suit++) {
			for (int rank = Card.TWO; rank <= Card.ACE; rank++) {
				Card e = new Card(suit, rank);
				deck.addLast(e);

			}
		}
	}

	/**
	 * reset method, which resets the cardsDealt to 0 and re-initializes
    * the deck
    * @param args unused
    * @return nothing
    */
	@SuppressWarnings("unused")
	public void reset() {
		cardsDealt = 0;
		this.initializeDeck();
	}

	/**
	 * getCardsLeft method, which returns the number of cards left
    * (not dealt) in the deck
    * @param args unused
    * @return int representing the # of cards left in deck (deck size - # of cards dealt) 
    */
	public int getCardsLeft() {
		return this.DECKSIZE - cardsDealt;
	}

	/**
	 * getCardsDealt method, which returns the number of cards dealt
    * @param args unused
    * @return int representing the # of cards dealt
    */
	public int getCardsDealt() {
		return cardsDealt;
	}

	/**
	 * getCard method, which deals a Card if the deck is not empty
    * @param args unused
    * @return deal, a Card object that is dealt if the deck is not empty,
    * otherwise return null
    */
	public Card getCard() {
		if (this.getCardsLeft() <= 0 || this.deck.isEmpty()) {
			return null;
		}
		this.cardsDealt++;
		Card deal = (Card) deck.getFirst();
		deck.removeFirst();
		return deal;
	}

	/**
	 * peek method, which returns the first Card in the Deck
    * if the Deck is not empty
    * @param args unused
    * @return null if Deck is empty, otherwise return the
    * first Card in the deck
    */
	public Card peek() {
		if (this.deck.isEmpty())
			return null;// no card to see
		else {
			return new Card(deck.getFirst());// use copy constructor
		}
	}

	/**
	 * shuffled method, which iterates over the size of the deck and
    * swaps two Cards at two random positions in the Deck
    * @param args unused
    * @return nothing
    */
	public void shuffle() {
		Random random = new Random(System.nanoTime());
		for (int i = 0; i < deck.size(); i++) {
			int pos1 = random.nextInt(deck.size());

			// swap two Cards in deck
			// get and remove a random card
			Card temp1 = (Card) this.deck.get(pos1);
			this.deck.remove(pos1);
			// get and remove another random card
			int pos2 = random.nextInt(deck.size());
			// make sure you are not swapping the same two
			while (pos2 == pos1)
				pos2 = random.nextInt(deck.size());
			Card temp2 = (Card) this.deck.get(pos2);
			this.deck.remove(pos2);
			// replace pos2 card with pos1 card
			deck.add(pos2, temp1);
			// replace pos1 card with pos2 card
			deck.add(pos1, temp2);
		}
	}

   /**
	 * showDeck method, which iterates over the length of
    * our Deck and prints the existing Card at each
    * index as a String. if our index + 1 is divisible by 5
    * with a remainder of 0, we print a new line.
    * @param args unused
    * @return nothing	 
    */
	public void showDeck() {
		for (int i = 0; i < deck.size(); i++) {
			System.out.print(this.deck.get(i) + ", ");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
   
   /**
	 * showDeck method, which takes in a number of cards to
    * show per line, iterates over the length of our Deck,
    * and prints each card as a String. if our current index
    * is divisible by our input with a remainder of 0, we print
    * a new line
    * @param numPerLine, an int value representing the number of
    * Cards to print per line
    * @return nothing
    */
	public void showDeck(int numPerLine) {
		for (int i = 0; i < deck.size(); i++) {
			System.out.print(this.deck.get(i) + ", ");
			if ((i + 1) % numPerLine == 0 && i != 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	/**
	 * toString method, which returns our DeckList as a String representation
    * including the deck and all cards dealt
	 * @param args unused
    * @return String representing DeckList
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DeckList [deck=" + deck + ", cardsDealt=" + cardsDealt + "]";
	}

}
