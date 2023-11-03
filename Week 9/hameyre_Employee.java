/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 10/24/2023
 * hameyre_Employee class, which allows a user
 to construct an object of said class.
 *
**/

public class hameyre_Employee {

   // private instance vars
   private String name;
   private double salary;
   
   // constructor - takes in name and salary and
   // sets instance vars to said values
   public hameyre_Employee(String n, double sal) {
      this.name = n;
      this.salary = sal;
   }
   
   /**
    * setName method, which takes in a String and
    * sets our object's name variable equal to said String
    * @param n, a String to set name to
    * @return none (void)
    */
   public void setName(String n) {
      this.name = n;
   }
   
   /**
    * getName method, which returns our object's name value
    * @return this.name, a String representing a name
    */
   public String getName() {
      return this.name;
   }
   
   /**
    * setName method, which takes in a double and
    * sets our object's salary variable equal to said double
    * @param sal, a double to set salary to
    * @return none (void)
    */
   public void setSalary(double sal) {
      this.salary = sal;
   }
   
   /**
    * getSalary method, which returns our object's salary value
    * @return this.salary, a double representing salary
    */   
   public double getSalary() {
      return this.salary;
   }
   
   /**
    * toString method, which returns our object's data / instance
    * variables as a cleanly formatted String
    * @return String in the format of name::salary
    */  
   public String toString() {
      return this.name + "::" + this.salary;
   }
   
   /**
    * equals method, which takes in another hameyre_Employee object and compares
    * the toString result of both our current object and the other hameyre_Employee
    * object for equality
    * @param emp, an hameyre_Employee object
    * @return true / false, boolean representing whether the toString of both
    * objects is equal or not
    */
   public boolean equals(hameyre_Employee emp) {
      return toString().equals(emp.toString());
   }

}