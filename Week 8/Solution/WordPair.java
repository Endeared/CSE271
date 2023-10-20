/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 10/17/2023
 * WordPair class for testing handling LinkedLists
 * / other collections.
**/


/*
/*
 * This class represents one pair of words. 
 * The relationship between the words is that they have
 *  the same meaning in either in the same language or in a 
 *  different language. The WordPair is intended for use
 *  in a Dictionary.  We will use it to build a linked list.
 * Each element of the LinkedList in a given dictionary
 * is one WordPair object that contains two separate
 * String objects. Thus each pair is a word and its 
 * translation or a synonym. 
 * There are several files to use in testing this class.
 */
import java.util.Comparator;
import java.util.LinkedList;

public class WordPair implements Comparator<WordPair> {

	/**
	 * @param args
	 */
	private String wordA;
	private String wordB;

	public WordPair() {
	}

	/**
	 * Constructor to take a String in word1 = word2 format and separate it into
	 * 2 strings
	 * 
	 * @param arg0
	 */
	public WordPair(String arg0) {
		arg0.trim();
		int equalsIndex = arg0.indexOf("=");
		if (equalsIndex != -1) {
			this.wordA = arg0.substring(0, equalsIndex).trim();
			this.wordB = arg0.substring(equalsIndex + 1).trim();
		}
	}

	/**
	 * Constructor to make a new word pair from the two string parameters
	 * 
	 * @param wordA
	 * @param wordB
	 */
	public WordPair(String wordA, String wordB) {
		this.wordA = wordA;
		this.wordB = wordB;
	}

	/**
	 * @return first word in the pair
	 */
	public String getWordA() {
		return wordA;
	}

	/**
	 * @return second word in the pair
	 */
	public String getWordB() {
		return wordB;
	}

	/**
	 * @param wordA
	 *            new word to replace first in the pair
	 */
	public void setWordA(String wordA) {
		this.wordA = wordA;
	}

	/**
	 * @param wordB
	 *            new word to replace the second wod in the pair
	 */
	public void setWordB(String wordB) {
		this.wordB = wordB;
	}

	/**
	 * @param aWord
	 * @param bWord
	 * @return difference in lexicographical value of the two arguments
	 */

	public int compare(WordPair aWord, WordPair bWord) {
		if (aWord == null || bWord == null)
			return Integer.MIN_VALUE;
		// take advantage of the fact that WordPair members are Strings
		return aWord.getWordA().compareTo(bWord.getWordA());
	}

   // *** ONLY MADE METHOD CHANGES HERE ***
	public boolean equals(WordPair aPair) {
		boolean result = false; // result of comparison of WordPairs

      // check if the words stored in each object are equal, if so, set bool to true
		if (aPair.getWordA().equals(this.wordA) && aPair.getWordB().equals(this.wordB)) {
         result = true;
      }

      // return bool
		return result;
	} // end equals

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString() overrides toString
	 */
	public String toString() {
		return wordA + "=" + wordB;
	}

	// a quick testing method
	public static void main(String[] args) {
		String[] wordList = { "moi=me", "pourquoi=why", "suivre=to follow", "oui=yes" };
		WordPair w1 = new WordPair("avec", "with");
		System.out.println("word w1 using first constructor displays as");
		System.out.print(w1.getWordA());
		System.out.println(" " + w1.getWordB());
		System.out.println("set up a lot of words using second constructor");
		WordPair[] words = new WordPair[10];
		for (int i = 0; i < wordList.length && i < words.length; i++)
			words[i] = new WordPair(wordList[i]);
		// test getters
		System.out.println("test getters to display results of second constructor");
		for (int i = 0; i < wordList.length && i < words.length; i++)
			System.out.println(words[i].getWordA() + " " + words[i].getWordB());
		System.out.println("test setters");
		w1.setWordA(words[1].getWordA());
		w1.setWordB(words[1].getWordB());

		System.out.println(w1.getWordA());
		System.out.println(w1.getWordB());

		LinkedList<WordPair> list1 = new LinkedList<WordPair>();
      
      // creating two new wordpairs
      WordPair w2 = new WordPair("avec", "with");
      WordPair w3 = new WordPair("pourquoi", "why");
      
      // testing if our equals method works
      System.out.println(w1.equals(w2)); // should return false
      System.out.println(w1.equals(w3)); // should return true

	}

}

// output below
 //  ----jGRASP exec: java WordPair
 // Picked up _JAVA_OPTIONS: -Xmx512M
 // word w1 using first constructor displays as
 // avec with
 // set up a lot of words using second constructor
 // test getters to display results of second constructor
 // moi me
 // pourquoi why
 // suivre to follow
 // oui yes
 // test setters
 // pourquoi
 // why
 // false
 // true
 // 
 //  ----jGRASP: operation complete.
