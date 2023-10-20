/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 10/17/2023
 * ListDemo class for testing our WordPair class.
 *
**/

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.HashSet;

/**
 * This program demonstrates the LinkedList class. It is a modification of the
 * program from Chapter 15 section 2 of BJLO
 */
public class ListDemo {
	// using a generic linked list to store word pairs
	// declaring here for testing purposes
	// static LinkedList<WordPair> wpLinkedList = new LinkedList<WordPair>();

	public static void main(String[] args) {
		// using a generic linked list to store word pairs
		// declaring here for testing purposes
		LinkedList<WordPair> wpLinkedList = new LinkedList<WordPair>();
		/*
		 * Initialize some word pairs to use in testing
		 */
		WordPair pair1 = new WordPair("avec=with");
		WordPair pair2 = new WordPair("moi=I, me");
		WordPair pair3 = new WordPair("si=yes; if; so, such");
		WordPair pair4 = new WordPair("quoi=what");
		WordPair pair5 = new WordPair("devoir=to have to, must; duty, test");
		WordPair pair6 = new WordPair("avec=with");
		WordPair pair7 = new WordPair("oui=yes");
		wpLinkedList.addLast(pair1);
		wpLinkedList.addLast(pair2);
		wpLinkedList.addLast(pair3);
		wpLinkedList.addLast(pair4);
		/*
		 * staff.addLast(pair5); staff.addLast(pair6); staff.addLast(pair7);
		 * staff.addLast(pair7);
		 */

		ListIterator<WordPair> iterator = wpLinkedList.listIterator(); // node
																		// pointer
		// at front
		iterator.next(); // pair1|pair2,pair3,pair4 (node pointer between pair1
							// and pair2)
		iterator.next(); // pair1,pair2|pair3,pair4 (node pointer between pair2
							// and pair3)

		// Add more elements after second element

		iterator.add(pair5); // pair1,pair2,pair5|pair3,pair4
		iterator.add(pair6); // pair1,pair2,pair5,pair6|pair3,pair4

		iterator.next(); // pair1,pair2,pair5,pair6,pair3| pair4

		// Remove last traversed element so pair3 is gone

		iterator.remove(); // pair1,pair2,pair5,pair6|pair4

		// Print all elements

		System.out.println(wpLinkedList.toString());
		System.out.println("Now sort the word list");
		Collections.sort(wpLinkedList, new WordPair());
		System.out.println(wpLinkedList.toString());
		System.out.println("Now make an ArrayList from the LinkedList");
		ArrayList<WordPair> wpArrayList = new ArrayList<WordPair>(wpLinkedList);
		System.out.println(wpArrayList.toString());
		System.out.println("Now add the LinkedList to the ArrayList");
		wpArrayList.addAll(wpLinkedList);
		System.out.println(wpArrayList.toString());
		System.out.println("Now sort the ArrayList");
		Collections.sort(wpArrayList, new WordPair());
		System.out.println(wpArrayList.toString());

		// now add code (can be a method) to determine if two link lists are the
		// same

		// add code to remove duplicated from the ArrayList wpArrayList
      System.out.println("--- duplicate tester ---");
      System.out.println(wpLinkedList.toString()); // printing original list
      wpLinkedList = removeDuplicates(wpLinkedList); // removing duplicates
      System.out.println(wpLinkedList.toString()); // printing new list
      
      LinkedList<WordPair> wpLinkedListTwo = (LinkedList) wpLinkedList.clone(); // cloning our original list
      LinkedList<WordPair> wpLinkedListThree = new LinkedList<WordPair>(); // making a new list and adding some WordPairs to it
      wpLinkedListThree.addLast(pair1);
		wpLinkedListThree.addLast(pair2);
		wpLinkedListThree.addLast(pair3);
		wpLinkedListThree.addLast(pair4);
      
      
      System.out.println(compareLists(wpLinkedList, wpLinkedListTwo)); // prints true
      System.out.println(compareLists(wpLinkedList, wpLinkedListThree)); // prints false
	}
   
   
   // method to remove duplicates
   public static LinkedList<WordPair> removeDuplicates(LinkedList<WordPair> li) {
   
      // admittedly i did this in a very crude manner - i couldnt get a hashset to work, so
      // i ended up creating a new empty arraylist of strings and an empty linkedlist of wordpairs...
      // ...is there a much better way to do this?
      ArrayList<String> keep = new ArrayList<String>();
      LinkedList<WordPair> newList = new LinkedList<WordPair>();
      
      // iterated over our original list, grabbing the word pair as a string
      for (WordPair wp : li) {
         String wordPair = wp.getWordA() + "=" + wp.getWordB();
         // checkinf if our arraylist contains the string. if not, append to arraylist
         if (!keep.contains(wordPair)) {
            keep.add(wordPair);
         }
      }
      
      // iterating over strings in arraylist and adding them as a WordPair to our empty LinkedList
      for (String wp : keep) {
         newList.add(new WordPair(wp));
      }
      
      // returning our new LinkedList
      return newList;
   
   }
   
   // compareLists method, which we use to check congruency of two lists of WordPairs
   public static boolean compareLists(LinkedList<WordPair> listOne, LinkedList<WordPair> listTwo) {
   
      // setting initial bool to false, and creating two empty strings, then sorting our lists
      boolean equal = false;   
      String finalStringOne = "";
      String finalStringTwo = "";
      Collections.sort(listOne, new WordPair());
      Collections.sort(listTwo, new WordPair());
      
      // for each wordpair in the first list, we add it as a string to our string for list one,
      // and then add a spacer at the end of each wordpair
      for (WordPair wp : listOne) {
         finalStringOne += wp.getWordA() + "=" + wp.getWordB() + "][";
      }
      
      // we repeat the same steps above but for list two here
      for (WordPair wp : listTwo) {
         finalStringTwo += wp.getWordA() + "=" + wp.getWordB() + "][";
      }
      
      // thus, if both strings are identical here, the lists are equal
      if (finalStringOne.equals(finalStringTwo)) {
         equal = true;
      }
      
      // return our bool
      return equal;  
   }

}


// output of run below
 //  ----jGRASP exec: java ListDemo
 // Picked up _JAVA_OPTIONS: -Xmx512M
 // [avec=with, moi=I, me, devoir=to have to, must; duty, test, avec=with, quoi=what]
 // Now sort the word list
 // [avec=with, avec=with, devoir=to have to, must; duty, test, moi=I, me, quoi=what]
 // Now make an ArrayList from the LinkedList
 // [avec=with, avec=with, devoir=to have to, must; duty, test, moi=I, me, quoi=what]
 // Now add the LinkedList to the ArrayList
 // [avec=with, avec=with, devoir=to have to, must; duty, test, moi=I, me, quoi=what, avec=with, avec=with, devoir=to have to, must; duty, test, moi=I, me, quoi=what]
 // Now sort the ArrayList
 // [avec=with, avec=with, avec=with, avec=with, devoir=to have to, must; duty, test, devoir=to have to, must; duty, test, moi=I, me, moi=I, me, quoi=what, quoi=what]
 // --- duplicate tester ---
 // [avec=with, avec=with, devoir=to have to, must; duty, test, moi=I, me, quoi=what]
 // [avec=with, devoir=to have to, must; duty, test, moi=I, me, quoi=what]
 // true
 // false
 // 
 //  ----jGRASP: operation complete.
