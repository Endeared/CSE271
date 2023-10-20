// ArrayList import
import java.util.ArrayList;

public class PersonTester_RH {

   public static void main(String[] args) {
   
      // creating our arraylists for our objects
      ArrayList<Person_RH> people = new ArrayList<Person_RH>();
      ArrayList<Student_RH> students = new ArrayList<Student_RH>();
      ArrayList<Instructor_RH> instructors = new ArrayList<Instructor_RH>();
      
      // adding Person objects
      people.add(new Person_RH("Gina", "1996"));
      people.add(new Person_RH("Evan", "1990"));
      people.add(new Person_RH("Landen", "2007"));
      people.add(new Person_RH("Simon", "1992"));
      people.add(new Person_RH("Joshua", "1994"));
      
      
      // adding Student objects
      students.add(new Student_RH("Ross", "1998", "Biology"));
      students.add(new Student_RH("Hannah", "1999", "English"));
      students.add(new Student_RH("Derek", "1999", "Information Technology"));
      students.add(new Student_RH("Morgan", "2000", "Computer Science"));
      students.add(new Student_RH("Dylan", "1996", "Finance"));
      
      // adding Instructor objects
      instructors.add(new Instructor_RH("Benjamin", "1970", 80000));
      instructors.add(new Instructor_RH("Brian", "1970", 105000));
      instructors.add(new Instructor_RH("Brooke", "1970", 65000));
      instructors.add(new Instructor_RH("Mark", "1970", 75000));
      instructors.add(new Instructor_RH("Tom", "1970", 50000));
      
      // simple nested for loop - first iteration prints all objects in our
      // people ArrayList using their toString() methods, second iteration prints
      // all objects in students ArrayList, and third iteration prints all objects
      // in instructors ArrayList
      for (int i = 0; i < 3; i++) {
         if (i == 0) {
            System.out.println();
            System.out.println("=== Printing People ===");
            for (int j = 0; j < people.size(); j++) {
               System.out.println(people.get(j).toString());
            }
         } else if (i == 1) {
            System.out.println();
            System.out.println("=== Printing Students ===");
            for (int j = 0; j < people.size(); j++) {
               System.out.println(students.get(j).toString());
            }
         } else {
            System.out.println();
            System.out.println("=== Printing Instructors ===");
            for (int j = 0; j < people.size(); j++) {
               System.out.println(instructors.get(j).toString());
            }
         }
      }
      
      // testing our highSalaryInstructor method by supplying a salary to check and
      // an ArrayList of Instructor objects to check - prints 4
      System.out.println();
      System.out.println("# of Instructors with salary OVER 70000");
      System.out.println(highSalaryInstructor(70000, instructors));
      
      System.out.println();
      System.out.println(people.get(0).talk()); // testing our Talkable interface - prints true
      System.out.println(students.get(0).talk()); // testing our Talkable interface - prints true
      System.out.println(instructors.get(0).talk()); // testing our Talkable interface - prints true
   
   }
   
   /**
    * highSalaryInstructor method, which takes in a double value to check and an ArrayList
    * of Instructor objects to reference for salaries
    * @param check, a double value representing the minimum salary to check for
    * @param instructors, an ArrayList of Instructor objects to pull salaries from
    * @return count, an int value representing the number of Instructor objects with a salary
    * greater than check;
    */
   public static int highSalaryInstructor(double check, ArrayList<Instructor_RH> instructors) {
      // count var
      int count = 0;
      
      // iterate over ArrayList, compare salaries and increment count if necessary
      for (int i = 0; i < instructors.size(); i++) {
         double thisInstructorSalary = instructors.get(i).getSalary();
         if (thisInstructorSalary > check) {
            count += 1;
         }
      }
      
      // return count
      return count;
   }

}