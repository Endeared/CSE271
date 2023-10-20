/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 10/8/2023
 * DieTowerTest class, which allows the user to
 test our DiceTower class.
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

public class DieTowerTest {

   // our main method, where we do all of our testing
   public static void main(String[] args) {
      
      // creating our dicetower objects
      DiceTower towerOne = new DiceTower();
      DiceTower towerTwo = new DiceTower();
      
      // creating an array list and populating it with even values from 2 through 20
      ArrayList<Integer> testValues = new ArrayList<Integer>();
      for (int i = 2; i <= 20; i += 2) {
         testValues.add(i);
      }
   
      // creating five different die using four constructors - dieOne
      // and dieTwo are identical to eachother
      Die dieOne = new Die(20, 10);
      Die dieTwo = new Die(20, 10);
      Die dieThree = new Die(6);
      Die dieFour = new Die(testValues);
      Die dieFive = new Die(3);
      
      // adding our die to two different towers
      towerOne.addDie(dieOne);
      towerOne.addDie(dieThree);
      towerTwo.addDie(dieOne);
      towerTwo.addDie(dieFive);
      
      System.out.println(towerOne.toString()); // prints DiceTower::20 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30:6 1 2 3 4 5 6
      System.out.println(towerTwo.toString()); // prints DiceTower::20 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30:3 1 2 3
      
      System.out.println(towerOne.getDiceQuantity()); // prints 2
      System.out.println(towerOne.getTotal()); // prints 11
      System.out.println(towerOne.getDie(1)); // prints 6 1 2 3 4 5 6
      System.out.println(towerOne.getDie(50)); // impossible - prints No die exists in that position, then returns null
      towerOne.getCurrentValues(); // prints [10, 1] and returns array
      towerOne.roll(); // rolling dice
      System.out.println(towerOne.getTotal()); // returns another val - could be 11 or some other num
      towerOne.swapDice(0, 1); // successfully swapped, no msg
      towerOne.swapDice(532, 2134); // couldnt swap, prints Could not swap dice at those positions. 
      System.out.println(towerOne.compareTo(towerTwo)); // returns false - towers arent the same
      
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