// extending our Student class from our Person class
public class Student_RH extends Person_RH {
   
   // instance variable
   private String major;
   
   // our constructor - we take in a name, year, and major in order
   // as strings, then pass our name / year to our superclass constructor
   // and assign the major String to our major var
   public Student_RH(String name, String year, String maj) {
      super(name, year);
      this.major = maj;
   }
   
   // setter for major
   public void setMajor(String maj) {
      this.major = maj;
   }
   
   // getter for major
   public String getMajor() {
      return this.major;
   }
   
   // toString method, which grabs the name and birth year of our superclass instance
   // variables using the getName() and getBirthYear() methods, respectively, then
   // returns those properties along with the major as a single String in a clean format
   public String toString() {
      return(super.getName() + "::" + super.getBirthYear() + "::" + this.major);
   }
   
   // equals method, which takes in another Student object, grabs the toString value
   // of each object, and checks if said String values are equal
   public boolean equals(Student_RH student) {
      String firstStudent = toString();
      String secondStudent = student.toString();
      return(firstStudent.equals(secondStudent));
   }

}