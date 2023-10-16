/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 10/5/2023
 * In class activity to practice interfaces (no recording).
 *
**/

public class Cat implements Speakable
{
   // instance var
   private String name;

   // constructor
   public Cat(String name)
   {
      this.name = name;
   }

   // speak method
   public void speak()
   {
     System.out.println("Meow! Meow!");
   }

   // overrided toString method
   public String toString()
   {
      return "Cat:  " + name;
   }
}