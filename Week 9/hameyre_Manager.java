/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 10/24/2023
 * hameyre_Manager class, which allows a user
 to construct an object of said class.
 *
**/

public class hameyre_Manager extends hameyre_Employee {

   // instance var
   private String department;
   
   // constructor, which takes in a name, salary, and department
   // and passes the first two to our superclass constructor, then
   // assigns department to our department var
   public hameyre_Manager(String n, double sal, String dep) {
      super(n, sal);
      this.department = dep;
   }
   
   /**
    * setDepartment method, which takes in a String representing
    * a department name and sets our department var equal to said String
    * @param dep, a String representing a department name
    * @return none (void)
    */
   public void setDepartment(String dep) {
      this.department = dep;
   }
   
   /**
    * getDepartment method, which returns a String representing
    * our object's department name
    * @return this.department;
    */
   public String getDepartment() {
      return this.department;
   }
   
   /**
    * toString method, which returns our object's data as a cleanly
    * formatted string
    * @return String in the format of name::salary::department
    */
   public String toString() {
      return super.toString() + "::" + this.department;
   }
   
   /**
    * equals method, which takes in another hameyre_Manager object and checks
    * our current hameyre_Manager object and other hameyre_Manager object for equality
    * as Strings
    * @param mn, a hameyre_Manager object
    * @return true / false, a boolean representing whether the two objects
    * are equal as Strings
    */
   public boolean equals(hameyre_Manager mn) {
      return toString().equals(mn.toString());
   }

}