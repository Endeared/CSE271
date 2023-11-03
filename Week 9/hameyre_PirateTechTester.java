/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 10/24/2023
 * hameyre_PirateTechTester class, to be used for testing
 Employee / Manager / Executive objects for midterm.
 *
**/

// importing utils for use
import java.util.ArrayList;
import java.util.Collections;

public class hameyre_PirateTechTester {

   public static void main(String[] args) {
   
      // creating four ArrayLists to store objects
      ArrayList<hameyre_Employee> employees = new ArrayList<hameyre_Employee>();
      ArrayList<hameyre_Employee> onlyhameyre_Employees = new ArrayList<hameyre_Employee>();
      ArrayList<hameyre_Manager> managers = new ArrayList<hameyre_Manager>();
      ArrayList<hameyre_Executive> executives = new ArrayList<hameyre_Executive>();
   
      // creating hameyre_Employees
      hameyre_Employee emp1 = new hameyre_Employee("John Doe", 35000);
      hameyre_Employee emp2 = new hameyre_Employee("Jane Doe", 40000);
      hameyre_Employee emp3 = new hameyre_Employee("Robert Smith", 45000);
      hameyre_Employee emp4 = new hameyre_Employee("Emma Smith", 50000);
      hameyre_Employee emp5 = new hameyre_Employee("John Doe", 35000);
      
      // creating hameyre_Managers
      hameyre_Manager mngr1 = new hameyre_Manager("Angela Stansbury", 60000, "Finance");
      hameyre_Manager mngr2 = new hameyre_Manager("Jeffrey Dean", 65000, "Information Technology");
      hameyre_Manager mngr3 = new hameyre_Manager("Steve Clemmons", 70000, "Information Technology");
      hameyre_Manager mngr4 = new hameyre_Manager("Stephanie Remsing", 75000, "Human Resources");
      hameyre_Manager mngr5 = new hameyre_Manager("Angela Stansbury", 60000, "Finance");
      
      // creating hameyre_Executives
      hameyre_Executive exec1 = new hameyre_Executive("Joshua Hart", 80000, "Finance");
      hameyre_Executive exec2 = new hameyre_Executive("Bob White", 85000, "Information Technology");
      hameyre_Executive exec3 = new hameyre_Executive("Dale Brown", 90000, "Human Resources");
      hameyre_Executive exec4 = new hameyre_Executive("Ian Hendricks", 95000, "Marketing");
      hameyre_Executive exec5 = new hameyre_Executive("Bob White", 85000, "Information Technology");
      
      // adding our objects to their respective lists using the Collections.addAll method
      Collections.addAll(onlyhameyre_Employees, emp1, emp2, emp3, emp4, emp5);
      Collections.addAll(employees, emp1, emp2, emp3, emp4, emp5, mngr1, mngr2, mngr3, mngr4, mngr5, exec1, exec2, exec3, exec4, exec5);
      Collections.addAll(managers, mngr1, mngr2, mngr3, mngr4, mngr5, exec1, exec2, exec3, exec4, exec5);
      Collections.addAll(executives, exec1, exec2, exec3, exec4, exec5);
      
      // testing hameyre_Employee methods
      System.out.println();
      System.out.println("=== Testing Getters / Setters / Equals For hameyre_Employees ===");
      System.out.println(emp1.getName()); // John Doe
      System.out.println(emp1.getSalary()); // 35000.0
      emp1.setName("Jane Doe");
      System.out.println(emp1.getName()); // Jane Doe
      emp1.setSalary(40000);
      System.out.println(emp1.getSalary()); // 4000.0
      emp1.setName("John Doe");
      emp1.setSalary(35000);
      System.out.println(emp1.equals(emp2)); // false
      System.out.println(emp1.equals(emp5)); // true
      
      // testing hameyre_Manager methods
      System.out.println();
      System.out.println("=== Testing Getters / Setters / Equals For hameyre_Managers ===");
      System.out.println(mngr1.getDepartment()); // Finance
      mngr1.setDepartment("Human Resources");
      System.out.println(mngr1.getDepartment()); // Human Resources
      mngr1.setDepartment("Finance");
      System.out.println(mngr1.equals(mngr2)); // false
      System.out.println(mngr1.equals(mngr5)); // true
      
      // testing hameyre_Executive methods
      System.out.println();
      System.out.println("=== Testing Getters / Equals For hameyre_Executives ===");
      System.out.println(exec1.getName()); // Joshua Hart
      System.out.println(exec1.getSalary()); // 80000.0
      System.out.println(exec1.getDepartment()); // Finance
      System.out.println(exec2.equals(exec3)); // false
      System.out.println(exec2.equals(exec5)); // true
      
      // testing our printVoweledhameyre_Employees method for explicitly hameyre_Employee objects
      System.out.println();
      System.out.println("=== Testing Print Voweled hameyre_Employees For ONLY hameyre_Employees ===");
      printVoweledhameyre_Employees(onlyhameyre_Employees);
      
      // testing our printVoweledhameyre_Employees method for all hameyre_Employee objects / hameyre_Employee subclasses
      System.out.println();
      System.out.println("=== Testing Print Voweled hameyre_Employees For ALL hameyre_Employees ===");
      printVoweledhameyre_Employees(employees);
      
   }
   
   /**
    * printVoweledhameyre_Employees method, which takes in an ArrayList of hameyre_Employee objects
    * and prints out all hameyre_Employees as a String wherein said hameyre_Employees have a name value
    * starting with a vowel (a, e, i, o, or u)
    * @param employees, an ArrayList of hameyre_Employee objects
    * @return none (void)
    */
   public static void printVoweledhameyre_Employees(ArrayList<hameyre_Employee> employees) {
      // storing vowels
      String vowels = "aeiou";
   
      // for employee in employees
      for (hameyre_Employee emp : employees) {
      
         // grab hameyre_Employee as string, get their name by splitting string
         // and grabbing element at first index
         String empToString = emp.toString();
         String name = empToString.split("::")[0];
         
         // grabbing first character of name and setting it to lowercase
         char firstChar = Character.toLowerCase(name.charAt(0));
         
         // checking if vowel is in String
         if (vowels.indexOf(firstChar) != -1) {
            System.out.println(empToString);
         }
      }
   }

}

// printVoweledEmployee calls outputs:

// first call
// === Testing Print Voweled hameyre_Employees For ONLY hameyre_Employees ===
// Emma Smith::50000.0

// second call
// === Testing Print Voweled hameyre_Employees For ALL hameyre_Employees ===
// Emma Smith::50000.0
// Angela Stansbury::60000.0::Finance
// Angela Stansbury::60000.0::Finance
// Ian Hendricks::95000.0::Marketing