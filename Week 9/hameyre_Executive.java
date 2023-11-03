/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 10/24/2023
 * hameyre_Executive class, which allows a user
 to construct an object of said class.
 *
**/

public class hameyre_Executive extends hameyre_Manager {

   // constructor, which takes in a name, salary, and department
   // and passes all arguments to our superclass constructor
   public hameyre_Executive(String n, double sal, String dep) {
      super(n, sal, dep);
   }
   
   /**
    * toString method, which returns our object's data / instance
    * variables as a cleanly formatted String
    * @return String in the format of name::salary::department
    */
   public String toString() {
      return super.toString();
   }
   
   /**
    * equals method, which takes in another hameyre_Executive object and
    * checks our current hameyre_Executive object and the other hameyre_Executive object
    * for equality using their respective toString calls
    * @param exec, an hameyre_Executive object
    * @return true / false, boolean representing whether the two
    * hameyre_Executive objects are equal as Strings
    */
   public boolean equals(hameyre_Executive exec) {
      return toString().equals(exec.toString());
   }

}