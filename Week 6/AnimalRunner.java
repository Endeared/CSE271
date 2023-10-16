/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 10/5/2023
 * In class activity to practice interfaces (no recording).
 *
**/

// util import for our arraylist
import java.util.*;

public class AnimalRunner
{
   public static void main(String[] args)
   {
      // creating ArrayList of Speakable objects, adding our Dog and Cat
      // objects to said ArrayList (both implement Speakable)
      ArrayList<Speakable> dogcatList = new ArrayList<Speakable>();
      dogcatList.add(new Dog("Fred"));
      dogcatList.add(new Cat("Wanda"));
      
      // looping through list of Speakable objects, calling speak() method
      // for said objects
      for (Speakable obj : dogcatList)
      {
         obj.speak();
      }
   }
}

// running the file as is will produce the following output:
//  ----jGRASP exec: java AnimalRunner
// Picked up _JAVA_OPTIONS: -Xmx512M
// Woof! Woof!
// Meow! Meow!
// 
//  ----jGRASP: operation complete.

// QUESTIONS / ANSWERS
// 3.1 - Is this possible? Can we add a Cat Object to an ArrayList of Dog?
// No - our Cat object is not from class Dog, so it cannot be naturally added to an ArrayList of class Dog.
// 
// 4.1 - What is the output for the program?
// [Dog:  Fred]
// 
// 4.2 - What is the reason for the form of the output?
// We are calling our overrided toString method in our Dog object.
// 
// 5.1 - Our experiment to add Cat objects to an ArrayList of Dog objects failed. What should we do now?
// We can extend our Cat / Dog classes from a single abstract superclass containing a speak method, or we can use an 
// interface to implement in our Dog / Cat classes. We will then create our ArrayList using the interface and 
// iterate over objects of that class in the ArrayList.
// 
// 8.1 - Does this work? (After implementing our Speakable interface)
// Yes - we can now easily call the speak() method on our objects in the for loop.