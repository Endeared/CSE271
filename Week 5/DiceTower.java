/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 10/18/2023
 * DiceTower class, which allows the user to
 create a DiceTower using various constructors
 and perform several methods relating to the Die.
 *
**/

// PART ONE:
// vod as usual: https://youtu.be/scE416fdefA
// (i try to record myself doing assignments
// when possible)

// PART TWO:
// no vod - out of town this weekend

// imports
import java.util.ArrayList;

public class DiceTower {

   // our only instance var
   private ArrayList<Die> dice = new ArrayList<Die>();
   
   // only constructor - does nothing since we initialize an
   // empty ArrayList as our instance var
   public DiceTower() {
   }
   
   /**
    * addDie method - takes in a Die object and checks if
    * that Die already exists in the tower, if it does we
    * don't add it to the tower, otherwise we add it
    * @param newDie, a Die object to try and add to the tower
    * @return none (void)
    */
   public void addDie(Die newDie) {
   
      // set bool to true, and iterate through DiceTower
      // to check if Die exists
      boolean validDie = true;
      for (int i = 0; i < dice.size(); i++) {
         Die thisDie = dice.get(i);
         if (newDie.compareTo(thisDie) == true) {
            validDie = false;
         }
      }
      
      // add or ignore Die depending on bool
      if (validDie == true) {
         dice.add(newDie);
      } else {
         System.out.println("Could not add die. Identical die already exists in tower!");
      }
   }

   /**
    * emptyDiceTower method, which just emptys our DiceTower
    * object
    * @return none (void)
    */
   public void emptyDiceTower() {
      // iterate over DiceTower and remove Die objects
      while (dice.size() > 0) {
         dice.remove(0);
      }
   }
   
   /**
    * toString method, which returns our DiceTower and the child
    * Die objects within it in a clean format
    * @return finalStr, a String representing our DiceTower and the
    * Die objects stored within it
    */
   public String toString() {
   
      // creating base string, then building our string by iterating
      // over our ArrayList of Die objects
      String finalStr = "DiceTower::";
      for (int i = 0; i < dice.size(); i++) {
         finalStr += dice.get(i) + ":";
      }
      finalStr = finalStr.substring(0, finalStr.length() - 1);
      
      return finalStr;
   }
   
   /**
    * getDiceQuantity, which counts the number of Die objects
    * inside the DiceTower
    * @return dice.size(), int value representing number of Die
    * objects stored inside DiceTower
    */
   public int getDiceQuantity() {
      return dice.size();
   }
   
   /**
    * getTotal, which iterates over Die objects in the tower
    * and counts the sum of all current values of said Die 
    * objects, then returns it
    * @return sum, an int value representing the sum of all
    * current facing values in the Die objects
    */
   public int getTotal() {
   
      // create initial sum count, then add to sum by iterating
      // over each Die object and grabbing the current value
      int sum = 0;
      for (int i = 0; i < dice.size(); i++) {
         Die thisDie = dice.get(i);
         sum += thisDie.getCurrentValue();
      }
      
      return sum;
   }
   
   /**
    * getDie method, which takes in an integer representing
    * an index position in an ArrayList, and returns the Die
    * at that index (if it exists)
    * @param diePosition, an int representing the index to check
    * @return thisDie, a Die object existing at that int OR null
    * (if no Die exists)
    */
   public Die getDie(int diePosition) {
      try {
         // try to get Die at the given position, then return it
         Die thisDie = dice.get(diePosition);
         return thisDie;
      } catch (Exception error) {
         // otherwise, return null and provide an error prompt
         System.out.println("No die exists in that position.");
         return null;
      }
   }
   
   /**
    * getCurrentValues method, which iterates over every Die in
    * a DiceTower and returns the current facing values of each
    * Die as an ArrayList (and prints it as a string)
    * @return currentValues, an ArrayList of integers representing
    * the current facing values of each Die
    */
   public ArrayList<Integer> getCurrentValues() {
      
      // create empty ArrayList and base string
      ArrayList<Integer> currentValues = new ArrayList<Integer>();
      String arrayStr = "[";
      
      // iterate over DiceTower and get Die object at each index,
      // add that Die to our ArrayList, and add Die data to our string
      for (int i = 0; i < dice.size(); i++) {
         Die thisDie = dice.get(i);
         currentValues.add(thisDie.getCurrentValue());
         if (i != (dice.size() - 1)) {
            arrayStr += thisDie.getCurrentValue() + ", ";
         } else {
            arrayStr += thisDie.getCurrentValue() + "]";
         }
      }
      
      // print out our finished String and return ArrayList
      System.out.println(arrayStr);
      return currentValues;
   }
   
   /**
    * roll method, which rolls each Die in a DiceTower
    * @return none (void)
    */
   public void roll() {
      // iterate over each Die in our DieTower, and then
      // roll that Die
      for (int i = 0; i < dice.size(); i++) {
         Die thisDie = dice.get(i);
         thisDie.rollDie();
      }
   }
   
   /**
    * swapDice method, which takes in two ints representing
    * indices in a DiceTower, and tries to swap the Die objects
    * at each index (if they exist)
    * @param one, an int representing first index to swap
    * @param two, an int representing second index to swap
    * @return none (void)
    */
   public void swapDice(int one, int two) {
      try {
         // try getting the Die at each index and swapping them
         Die dieOne = dice.get(one);
         Die dieTwo = dice.get(two);
         dice.set(one, dieTwo);
         dice.set(two, dieOne);
      } catch (Exception error) {
         // otherwise print an error
         System.out.println("Could not swap dice at those positions.");
      }
   }
   
   /**
    * compareTo method, which takes in a DiceTower object and
    * compares it to our existing DiceTower to ensure that
    * the two objects are identical
    * @param dt, a DiceTower object
    * @return true if both DiceTower objects are identical,
    * otherwise false
    */
   public boolean compareTo(DiceTower dt) {
      // if our DiceTower ArrayList size is the same size as
      // the number of Die objects in our other DiceTower object,
      // we iterate over all Die objects and compare them
      if (dice.size() == dt.getDiceQuantity()) {
         for (int i = 0; i < dice.size(); i++) {
            Die dieOne = dice.get(i);
            Die dieTwo = dt.getDie(i);
            if (dieOne.compareTo(dieTwo) == false) {
               // if two Die do not match, we return false
               return false;
            }
         }
      } else {
         // if our sizes are different, we return false
         return false;
      }
      // if we haven't returned false by now, we can then return true
      return true;
   }
}

// reflection answers

// 1) Describe your efforts.
// A) In contrast to the Die class, this time around I started by
// writing all of the methods and instance variables BEFORE testing
// them, and then ensured that my expected outputs match my actual ouputs.

// 2) What was most enjoyable?
// A) I enjoyed learning to reference and use objects of a certain
// class that were being stored within another class (in our case,
// our Die objects within our DiceTower).

// 3) What was most difficult?
// A) I think the hardest part was just keeping track of our accessor
// methods and using them to access another DiceTower or Die property,
// rather than trying to call the properties directly with dot notation.

// 4) How would you like to extend what you have created?
// A) I think the next step would be to create a simple game using
// the two classes we have made, and it looks like that will be done
// in part three of the lab.