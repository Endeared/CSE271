import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * 
 * @author wernerla
 * 
 *         This class represents a hand for a card game
 * @param <T>
 * 
 */

@SuppressWarnings("rawtypes")
public class Hand extends Card implements Comparable {

	private LinkedList<Card> hand;
	private int handSize; // size of the hand for a specific game

   /**
    * Hand method / constructor, which creates an Object of class Hand
    * by taking in an int to set the handSize to, then initializing our
    * hand variable to a LinkedList of Card objects
    * @param numCards, an int representing the number of cards in a hand
    * @return nothing
	 */
	public Hand(int numCards) {
		this.handSize = numCards;
		hand = new LinkedList<Card>();
	}
   
   
   /**
    * removeCard method, which returns a Card from the hand and removes
    * it
    * @param whichOne, an int value representing which card to remove
    * @return Card object representing card in hand at the specified index
    * @throws InvalidCardReference
    */
	public Card removeCard(int whichOne) throws InvalidCardReference {
		Card temp = null;
		if (this.hand.size() > 0 && whichOne < this.hand.size()) {
			temp = this.hand.get(whichOne);
			hand.remove(whichOne);
		} else
			throw new InvalidCardReference();
		return new Card(temp.getSuit(), temp.getRank());
	}

   /**
    * addCard method, which takes in a Card object and adds
    * it to the hand
    * @param wonCard, a Card object to add to hand
    * @return true if card could be added, otherwise false
    */
	public boolean addCard(Card wonCard) {

		if (wonCard != null) {
			// if (!this.isFull()) {
			Card temp = new Card(wonCard.getSuit(), wonCard.getRank());
			hand.add(temp);
			// this.totalCards++;
			return true;
			// }
		}
		return false;
	}

	/**
	 * showHand method, which prints the user's hand as a String representation
    * @param args unused
    * @return nothing
	 */
	public void showHand() {
		for (int i = 0; i < this.hand.size(); i++) {
			Card s = hand.get(i);
			System.out.println(s.getRankAsString() + " of " + s.getSuitAsString());
		}
	}

	/**
	 * getCard method, which takes in an index in the hand to get the card from
    * and returns a Card at the given index if successful
    * @param i, an int representing the index to grab the card from
    * @return Card at given index, otherwise null if not possible
	 */
	public Card getCard(int i) {
		Card s;
		try {
			s = hand.get(i);
			return new Card(s.getSuit(), s.getRank());
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();

			e.getMessage();
			return null;
		}
		// return null;
	}

	/**
	 * isEmpty method, which checks if the hand is empty or not
    * @param args unused
    * @return true if hand is empty, otherwise false
	 */
	public boolean isEmpty() {
		if (hand.size() == 0)
			return true;
		else
			return false;
	}

	/**
	 * isFull method, which takes checks if the hand is full or not
    * @param args unused
    * @return true if hand is full, otherwise false
	 */
	public boolean isFull() {
		if (hand.size() == this.handSize)
			return true;
		else
			return false;
	}

	/**
	 * getTotalCards method, which returns the number of cards in the hand
    * @param args unused
    * @return int representing # of cards in hand
	 */
	public int getTotalCards() {
		return this.hand.size();
	}

	/**
	 * getHandSize method, which returns the size of the hand set
    * @param args unused
    * @return int representing the handSize instance variable
	 */
	public int getHandSize() {
		return handSize;
	}

	/**
	 * setHandSize method, which takes in an int and sets the handSize
    * instance variable to that int
    * @param handSize, an int value to set the handSize to
    * @return nothing
	 */
	public void setHandSize(int handSize) {
		this.handSize = handSize;
	}

	/**
	 * getHand method, which returns the hand LinkedList
    * @param args unused
    * @return hand, our LinkedList of Card objects
	 */
	public LinkedList<Card> getHand() {
		return hand;
	}

	/**
	 * sortHandBySuit method, which iterates over our hand repeatedly until sorted,
    * and sorts all of the Cards by comparing suits of Cards and removing / adding
    * pairs
    * @param args unused
    * @return nothing
	 */
	public void sortHandBySuit() {
		boolean sorted = false;
		// first sort by suit, not paying attention the the rank of the card
		while (sorted == false) {
			sorted = true;// flag to check if any cards were swapped
			for (int i = 0; i < this.hand.size() - 1; i++) {
				if (hand.get(i).getSuit() > hand.get(i + 1).getSuit()) {
					// swap cards
					sorted = false;// we aren't done sorting
					Card hold1 = hand.remove(i);
					Card hold2 = hand.remove(i);
					hand.add(i, hold2);
					hand.add((i + 1), hold1);
				}
			}
		} // end while
		// now sort within the suit
		sorted = false;
		// System.out.println("sort by suit phase 1, suit only, no rank within
		// suit");
		// this.showHand();
		System.out.println();
		while (sorted == false) {
			sorted = true;
			int pos = 0;
			for (int suit = SPADES; suit <= DIAMONDS; suit++) {
				int count = countSuit(suit); //counts number in the hand of suit
				Card[] temp = new Card[count];//make a small array of one suit
				for (int i = pos, c = 0; c < count; i++, c++) {
					temp[c] = hand.get(i);					
				}
				if (count >= 2)
					bubbleSort(temp);// no need to sort unless there are two or more of the same suit
				//put the sorted elements back into the hand in order
				for (int i = pos, c = 0; c < count; i++, c++) {
					hand.set(i, temp[c]);
				}
				pos += count;//update position in the linked list where another suit starts
			} // end for
		} // end while
	}

   /**
    * bubbleSort method, which takes in an Array of Comparable objects, and
    * sorts them using a bubble sort algorithm in place
    * @param data, an Array of Comparable objects
    * @return nothing
    */
	@SuppressWarnings("unchecked")
	public static void bubbleSort(Comparable[] data) {
		int position, scan;

		for (position = 0; position < data.length - 1; position++) {
			for (scan = 0; scan < data.length - 1; scan++) {
				// System.out.println(" in sort " + data[scan] + " " + data[scan
				// + 1]);
				if (data[scan].compareTo(data[scan + 1]) > 0)
					swap(data, scan, scan + 1);
			}
		}
	}

   /**
    * swap method, which takes in an Array of Comparable objects, and two indices, and
    * swaps the two objects at their respective indices in place
    * @param data, an Array of Comparable objects
    * @param index1, an int representing first index to swap
    * @param index2, an int representing second index to swap
    * @return nothing
    */
	private static void swap(Comparable[] data, int index1, int index2) {
		Comparable temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}
	
	/**
    * countSuit method, which counds the # of cards of a specific suit
    * that exist in the hand
    * @param suit, an int value representing the suit to check for
    * @return count, an int value representing the # of cards of specific
    * suit that exist in the hand
	 */
	private int countSuit(int suit) {
		int count = 0;
		for (int i = 0; i < this.hand.size(); i++) {
			if (hand.get(i).getSuit() == suit)
				count++;
		}
		return count;
	}

	/**
    * sortHandByRank method, which simply using the Collections
    * framework to sort our hand
    * @param args unused
    * @return nothing
	 */
	@SuppressWarnings("unchecked")
	public void sortHandByRank() {
		// brute force way to convert the list to an array of card objects
		/*
		Card[] temp = new Card[hand.size()];
		int count = hand.size();
		for (int c = 0; c < count; c++)
			temp[c] = hand.get(c);
		*/
		//Arrays.sort works well but you have to put the 
		//sorted array back into the list
		/*
		Arrays.sort(temp);
		for (int i = 0; i < this.hand.size(); i++) {
			hand.set(i, temp[i]);
		}
		*/
		// use the toArray method in the LinkedList class
		// not yet working correctly here but the Arrays.sort method is very efficient
		//Card[] newArray = (Card[]) hand.toArray();
		//String array[] = list.toArray(new String[6]);
		
		// Collections sorting works here too.
		Collections.sort(hand);
	}

	/**
    * toString method, which returns our hand in a cleanly
    * formatted String representation
    * @param args unused
    * @return result, a String representing the hand
	 */
	public String toString() {
		String result = "";
		int i = 0;
		while (i < hand.size()) {
			if (hand.get(i) != null) {
				result += hand.get(i).toString() + "\n";
				i++;
			}
		}
		return result;
	}

}
