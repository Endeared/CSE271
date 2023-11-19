/**
 * 
 * This class represents a single Card. The card is a traditional playing card -
 * A, 2, 3, ... K with suits clubs, diamonds, spades, or hearts. Jokers are not
 * represented.
 * 
 * Face values are represented by the numbers 2 through 14 where 11 is a jack,
 * 12 is a queen, 13 is a king, and 14 is an ace. Suits are represented by 1 for
 * spades, 2 for hearts, 3 for clubs, and 4 for diamonds. Ordinal value is such
 * that number cards are worth their face value, picture cards are worth 10 and
 * Ace is worth 11.
 */

public class Card implements CardInterface, Comparable {

	// instance variables
	private int suit;
	private int rank;

	/**
	 * Constructor used to create an object of the Card
    * class. Takes in no arguments.
    * @param args unused
    * @return nothing
    */
	public Card() {
		rank = (int) (Math.random() * 13) + 2;
		suit = (int) (Math.random() * 4) + 1;
	}

	/**
	 * Constructor used to create an object of the Card
    * class. Takes in an Object as an argument.
    * @param other, an Object
	 * @return nothing
    */
	public Card(Object other) {
		if (other != null && other instanceof Card) {
			this.setRank((((Card) other).getRank()));
			this.setSuit(((Card) other).getSuit());
		}

	}

	/**
	 * Constructor used to create an object of the Card
    * class. Takes in two ints.
    * @param suit, an int representing the card suit
	 * @param rank, an int representing the card rank
    * @return nothing
    */
	public Card(int suit, int rank) {
		this.setSuit(suit);
		this.setRank(rank);

	}

	/**
	 * getRank method, which returns the cards rank.
    * @param args unused
    * @return rank, an int value representing the card's rank
    */
	public int getRank() {
		return rank;
	}

	/**
	 * getSuit method, which returns the cards suit.
    * @param args unused
    * @return suit, an int value representing the card's suit.
    */
	public int getSuit() {
		return suit;
	}

	/**
	 * setRank method, which updates the card's rank by taking
    * in an int value.
    * @param rank, an int value representing the rank to update to
    * @return nothing	 
    */
	public void setRank(int rank) {
		if (rank >= TWO && rank <= ACE)
			this.rank = rank;
		else
			throw new InvalidCardException("Attempt to set a card to an invalid rank");
	}

	/**
	 * setSuit method, which updates the card's suit by taking in
    * an int value.
    * @param suit, an int value representing the suit to update to
    * @return nothing	 
    */
	public void setSuit(int suit) {
		if (suit >= SPADES && suit <= DIAMONDS)
			this.suit = suit;
		else
			throw new InvalidCardException("Attempt to set card to an invalid suit");
	}

	/**
	 * sameSuit method, which takes in another Card object and checks
    * if that Card and this Card are of the same suit
    * @param other, a Card object
    * @return true if both Cards are same suit, otherwise false
    */
	public boolean sameSuit(Card other) {
		if (other != null) {
			if (other.getSuit() == this.getSuit())
				return true;
			else
				return false;
		} else
			return false;
	}

	/**
	 * compareTo method, which takes in another object and checks
    * if that object and our Card object are equivalent classes
    * @param other, an Object to compare to
    * @return Integer.MAX_VALUE if the objects are not of the
    * the same class, otherwise returns our current Card's rank
    * minus the other Card's rank
    */
	public int compareTo(Object other) {
		if (other == null || !(other instanceof Card)) {
			return Integer.MAX_VALUE;
		} else {
			return this.rank - ((Card) other).rank;
		}
	}

	/**
	 * getRankAsString method, which checks if our Card's rank value
    * corresponds to a case in a switch statement, and returns the
    * corresponding String if so, otherwise returns the rank as a String.
    * @param args unused
    * @return our Card's rank integer as a String representation
    */
	public String getRankAsString() {
		switch (rank) {
		case TWO:
			return "Two";
		case THREE:
			return "Three";
		case FOUR:
			return "Four";
		case FIVE:
			return "Five";
		case SIX:
			return "Six";
		case SEVEN:
			return "Seven";
		case EIGHT:
			return "Eight";
		case NINE:
			return "Nine";
		case TEN:
			return "Ten";
		case ACE:
			return "Ace";
		case KING:
			return "King";
		case QUEEN:
			return "Queen";
		case JACK:
			return "Jack";
		default:
			return Integer.toString(rank);
		}
	}
   
   /**
	 * getSuitAsString method, which checks our Card's suit against
    * several cases, and returns the corresponding Suit as a string.
    * @param args unused
    * @return our Card's suit as a String representation
    */
	public String getSuitAsString() {
		switch (suit) {
		case CLUBS:
			return "Clubs";
		case DIAMONDS:
			return "Diamonds";
		case HEARTS:
			return "Hearts";
		default:
			return "Spades";

		}
	}

	/**
	 * toString method, which takes our Card's rank and suit
    * values and appends them to a formatted String.
    * @param args unused
    * @return retString, a formatted String representing our Card 	 
    */
	public String toString() {
		String retString = "rank: " + this.getRank() + " suit: " + this.getSuit();
		return retString;
	}

   /**
    * compareTo method, which overrides the default compareTo method,
    * but this method currently only returns 0
    * @param other, a Card object to compare to
    * @return 0
    */
	@Override
	public int compareTo(Card other) {
		// TODO Auto-generated method stub
		return 0;
	}
}
