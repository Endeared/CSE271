// imports
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

   public static void main(String[] args)
      {
         Map<String, String> gradeMap = new TreeMap<String, String>();
   
         String choice = printMenuAndGetChoice();
         while (!choice.equals("Q"))
         {
            if (choice.equals("A"))
            {
               addStudent(gradeMap);
            }
            if (choice.equals("R"))
            {
               removeStudent(gradeMap);
            }
            if (choice.equals("M"))
            {
               modifiyStudent(gradeMap);
            }
            if (choice.equals("P"))
            {
               printGrades(gradeMap);
            }
            choice = printMenuAndGetChoice();
         }
      }
   
   /**
      Prints a menu for a user to select from, and calls appropriate method based on input
      @param args unused
      @return in.next(), a String representing the user's menu choice / input
   */
   public static String printMenuAndGetChoice()
   {
      System.out.println("A)dd student.");
      System.out.println("R)emove student.");
      System.out.println("M)odify grades.");
      System.out.println("P)rint all grades.");
      System.out.println("Q)uit.");
      System.out.println("Select one: ");
      Scanner in = new Scanner(System.in);
      return in.next();
   }
   
   /**
      Adds a student to a map based on user input
      @param gradeMap the map to add the student tp
   */
   public static void addStudent(Map<String, String> gradeMap)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the name of the student to add: ");
      String name = in.next();
      if (!gradeMap.containsKey(name))
      {
         System.out.println("Enter the new grade: ");
         String grade = in.next();
         gradeMap.put(name, grade);
      }
      else
      {
         System.out.println("That student is already in the roster.");
      }
   }
   
   /**
      Prints all students and their grades from the map
      @param gradeMap the map to print values from
   */
   public static void printGrades(Map<String, String> gradeMap) {
      Set<String> keySet = gradeMap.keySet();
      for (String student : keySet) {
        String grade = gradeMap.get(student);
        System.out.println(student + ": " + grade);
      }
   }
   
   /**
      Removes a student from the map based on user input
      @param gradeMap the map to remove the student from
   */
   public static void removeStudent(Map<String, String> gradeMap)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the name of the student to remove: ");
      String name = in.next();

      if (gradeMap.containsKey(name)) {
         gradeMap.remove(name);
      } else {
         System.out.println("No such student exists!");
      }
   }
   
   /**
      Modifies an entry based on user input.  Prints an error if an invalid student is modified
      @param gradeMap the map to modify
   */
   public static void modifiyStudent(Map<String, String> gradeMap)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the name of the student to modify: ");
      String name = in.next();
      if (gradeMap.containsKey(name))
      {
        System.out.println("Enter the new grade: ");
        String grade = in.next();
        gradeMap.replace(name, grade);
      }
      else
      {
         System.out.println("No such student exists!");
      }
   }
}