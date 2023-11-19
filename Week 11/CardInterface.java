/**
 * @author wernerla An interface for a playing card
 * 
 */
public interface CardInterface {
	// Define the suit
	public static final int SPADES = 1;
	public static final int HEARTS = 2;
	public static final int CLUBS = 3;
	public static final int DIAMONDS = 4;
	// define the card rank
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int ACE = 14;

	/**
	 * abstract getRank method, which should
    * return the implementing Object's rank.
    * @param args unused
    * @return int 
    */
	public int getRank();

	/**
	 * abstract getSuit method, which should
    * return the implementing Object's suit.
    * @param args unused
    * @return int
    */
	public int getSuit();

	/**
	 * abstract setRank method, which should take in
    * an int and set the implementing Object's rank to that int
    * @param rank, an int value representing the new rank
    * @return nothing
    */
	public void setRank(int rank);

	/**
	 * abstract setSuit method, which should take in
    * an int and set the implementing Object's suit to that int
    * @param suit, an int value representing the new suit
    * @return nothing
    */
	public void setSuit(int suit);

	/**
	 * abstract sameSuit method, which takes in an object of
    * the Card class and should check if it has the same
    * suit as our current Object
    * @param other, a Card object
    * @return boolean
    */
	public boolean sameSuit(Card other);

	/**
	 * abstract compareTo method, which takes in an object of
    * the Card class and should check if it is equivalent
    * to our current Object
    * @param other, a Card object
    * @return int 
    */
	public int compareTo(Card other);

	/**
	 * abstract compareTo method, which instead takes in an
    * object of any kind and should check if it is equivalent
    * to our current Object
    * @param other, an Object
    * @return int 
    */
	public int compareTo(Object other);

	/**
	 * abstract getRankAsString method, which should return
    * our Object's rank as a String.
    * @param args unused
    * @return a String representation of the rank 
    */
	public String getRankAsString();

	/**
	 * abstract getSuitAsString method, which should return
    * our Object's suit as a String.
    * @param args unused
    * @return a String representation of the suit 
    */
	public String getSuitAsString();

	/**
	 * abstract toString class that overrides the default toString
    * method, and returns our Object as a String representation
    * @param args unused
    * @return String representing our object	 
    */
   @Override
	public String toString();

}
