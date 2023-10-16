/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 10/8/2023
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

// imports
import java.util.ArrayList;

public class DieTest {

   // our main method, where we do all of our testing
   public static void main(String[] args) {
   
      // creating an array list and populating it with even values from 2 through 20
      ArrayList<Integer> testValues = new ArrayList<Integer>();
      for (int i = 2; i <= 20; i += 2) {
         testValues.add(i);
      }
   
      // creating five different die using four constructors - myDie
      // and myDie2 are identical to one another
      Die myDie = new Die(20, 10);
      Die myDie2 = new Die(20, 10);
      Die myDie3 = new Die(6);
      Die myDie4 = new Die(testValues);
      Die myDie5 = new Die();
      
      // testing our methods in a valid manner
      System.out.println(myDie4.toString()); // prints 10 2 4 6 8 10 12 14 16 18 20
      System.out.println(myDie5.toString()); // prints 1 1
      System.out.println(myDie3.getQuantityOfSides()); // prints 6
      System.out.println(myDie.getValueAt(5)); // prints 15
      System.out.println(myDie4.getCurrentValue()); // prints 2
      myDie4.rollDie(); // prints nothing - selects random value in list of values in myDie4
      System.out.println(myDie4.getCurrentValue()); // prints new random value
      myDie4.setFacing(5); // prints nothing - but allows us to set our face without error
      
      myDie.getValueAt(25); // invalid, tries to get val outside of range - prints error
      myDie4.setFacing(50); // invalid, tries to set face outside of range - prints error
      
      System.out.println(myDie.compareDieValue(myDie2)); // true
      System.out.println(myDie.compareQuantityOfSides(myDie2)); // true
      System.out.println(myDie.compareDice(myDie2)); // true
      System.out.println(myDie.compareTo(myDie2)); // true
      
      System.out.println(myDie.compareDieValue(myDie4)); // false - myDie face = 10, myDie4 face = 2
      System.out.println(myDie.compareQuantityOfSides(myDie3)); // false - myDie sides = 21, myDie3 sides = 6
      System.out.println(myDie.compareDice(myDie4)); // false - myDie sides and face =/= myDie4 sides and face
      System.out.println(myDie.compareTo(myDie3)); // false - myDie sides, face, and vals =/= myDie4 sides, face, and vals
   }

}