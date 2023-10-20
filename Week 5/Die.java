/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 10/18/2023
 * Die class, which allows the user to
 create a Die using various constructors
 and perform several methods relating to the Die.
 *
**/

// PART ONE:
// vod as usual: https://youtu.be/scE416fdefA
// (i try to record myself doing assignments
// when possible)

// PART TWO:
// no vod - out of town this weekend

// our imports
import java.util.ArrayList;
import java.util.Random;

public class Die {

   // instance vars - we need to store # of sides, currentFacing
   // value, and all side values
   private int sides;
   private int currentFacing;
   private ArrayList<Integer> sideValues = new ArrayList<Integer>();
   
   /**
    * Die constructor - takes no arguments, sets sides to 1, adds
    * 1 to sideValues, and sets currentFacing to 1
    */
   public Die() {
      this.sides = 1;
      sideValues.add(1);
      this.currentFacing = 1;
   }
   
   /**
    * Die constructor - takes one int argument
    * @param sides, an int value representing the # of sides for the
    * die to have
    */
   public Die(int sides) {
      this.sides = sides;
      for (int i = 1; i <= sides; i++) {
         sideValues.add(i);
      }
      this.currentFacing = 1;
   }
   
   /**
    * Die constructor - takes two int arguments
    * @param sides, an int value representing the # of sides for the
    * die to have
    * @param min, an int value representing the minimum side value
    */
   public Die(int sides, int min) {
      this.sides = sides;
      for (int i = min; i < min + sides; i++) {
         sideValues.add(i);
      }
      this.currentFacing = min;
   }
   
   /**
    * Die constructor - takes in ArrayList as argument
    * @param valuesArray, an ArrayList of integers representing the
    * number of sides and value of sides to add to the die
    */
   public Die(ArrayList<Integer> valuesArray) {
      this.sides = valuesArray.size();
      for (int i = 0; i < valuesArray.size(); i++) {
         int thisValue = valuesArray.get(i);
         sideValues.add(thisValue);
      }
      this.currentFacing = valuesArray.get(0);
   }
   
   /**
    * toString method - overloading our default toString Object
    * method to return our Die in a clean format
    * @return returnString, a String representing our Die
    */
   public String toString() {
      String returnString = "" + sides;
      for (int i = 0; i < sideValues.size(); i++) {
         returnString += " " + sideValues.get(i);
      }
      return returnString;
   }
   
   /**
    * getQuantityOfSides accessor method, which returns number of
    * sides a Die object has
    * @return sides, an int value representing the number of sides on die
    */
   public int getQuantityOfSides() {
      return sides;
   }
   
   /**
    * getValueAt accessor method, which returns value of side at
    * a specific side on the die
    * @param sideLocation, int value representing side to check
    * @return thisVal, value at side if side exists, otherwise print
    * out message and return -1 (side does not exist)
    */
   public int getValueAt(int sideLocation) {
      try {
         int thisVal = sideValues.get(sideLocation);
         return thisVal;
      } catch (IndexOutOfBoundsException error) {
         System.out.println("Error - that side doesn't exist!");
         return -1;
      }
   }
   
   /**
    * getCurrentValue accessor method, which returns the value of
    * the current face of the die
    * @return currentFacing, int value representing the value on
    * the current die face
    */
   public int getCurrentValue() {
      return currentFacing;
   }
   
   /**
    * rollDie method, which selects a random index from 0 to our
    * size of sideValues ArrayList, then grabs the value at that
    * index, sets the current face to that val, and returns it to user
    * @return arrayVal, an int value representing the value of
    * the current die face after rolling the die
    */
   public int rollDie() {
      Random rng = new Random();
      int randomIndex = rng.nextInt(sideValues.size());
      int arrayVal = sideValues.get(randomIndex);
      this.currentFacing = arrayVal;
      return arrayVal;
   }
   
   /**
    * setFacing mutator method, which takes in a target side location
    * and tries to set the current die face to that side
    * @param sideLocation, an int value representing the index to set
    * the value at said index to the currentFacing side
    * @return none (void)
    */
   public void setFacing(int sideLocation) {
      try {
         this.currentFacing = sideValues.get(sideLocation);
      } catch (IndexOutOfBoundsException error) {
         System.out.println("Error - that side doesn't exist!");
      }
   }
   
   /**
    * compareDieValue method, which takes in a Die object
    * and sees if the current face value of that Die object
    * matches our current face value
    * @param d, a Die object
    * @return true if values match, otherwise false
    */
   public boolean compareDieValue(Die d) {
      return (d.getCurrentValue() == currentFacing);
   }
   
   /**
    * compareQuantity method, which takes in a Die object and
    * sees if the number of sides of that Die Object matches
    * the number of sides on our Die object
    * @param d, a Die object
    * @return true if number of sides match, otherwise false
    */
   public boolean compareQuantityOfSides(Die d) {
      return (d.getQuantityOfSides() == sides);
   }
   
   /**
    * compareDice method, which takes in a Die object and sees
    * if the number of sides and value of said sides match the
    * number of sides and value of said sides on our Die object
    * @param d, a Die object
    * @return true if sides and values match, otherwise false
    */
   public boolean compareDice(Die d) {
      return this.sideValues.equals(d.sideValues);
   }
   
   /**
    * compareTo method, which taes in a Die object and sees if all
    * instance variables of that Die object match (sides, side values,
    * current side value) the same instance variables of our Die object
    * @param d, a Die object
    * @return true if sides, values, and current face match, otherwise false
    */
   public boolean compareTo(Die d) {
      return (d.toString().equals(this.toString()) && d.getCurrentValue() == currentFacing);
   }
}