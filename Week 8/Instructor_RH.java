// extending our class from Person
public class Instructor_RH extends Person_RH {

   // instance variable
   private double salary;
   
   // constructor - takes in a name, birth year, and salary in order
   public Instructor_RH(String name, String year, double sal) {
      super(name, year);
      this.salary = sal;
   }
   
   // setter method for salary
   public void setSalary(double sal) {
      this.salary = sal;
   }
   
   // getter method for salary
   public double getSalary() {
      return this.salary;
   }
   
   // toString method, which grabs the name and birth year of our superclass instance
   // variables using the getName() and getBirthYear() methods, respectively, then
   // returns those properties along with the salary as a single String in a clean format
   public String toString() {
      return(super.getName() + "::" + super.getBirthYear() + "::" + this.salary);
   }
   
   // equals method, which takes in another Instructor object, grabs the toString value
   // of each object, and checks if said String values are equal
   public boolean equals(Instructor_RH instructor) {
      String firstInstructor = toString();
      String secondInstructor = instructor.toString();
      return(firstInstructor.equals(secondInstructor));
   }

}