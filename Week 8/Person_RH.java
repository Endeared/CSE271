// our class implements the Talkable interface
public class Person_RH implements Talkable {

   // instance vars
   private String name;
   private String birthYear;
   
   // constructor for our Person class
   public Person_RH(String n, String year) {
      this.name = n;
      this.birthYear = year;
   }
   
   // talk method, implemented / designed from our Talkable interface
   public boolean talk() {
      // simply returns true, meaning our Person can talk
      return true;
   }
   
   // setter method for name
   public void setName(String n) {
      this.name = n;
   }
   
   // getter method for name
   public String getName() {
      return this.name;
   }
   
   // setter method for birthYear
   public void setBirthYear(String y) {
      this.birthYear = y;
   }
   
   // getter method for birthYear
   public String getBirthYear() {
      return this.birthYear;
   }
   
   // toString method, which grabs the name and birth year of our superclass instance
   // variables using the getName() and getBirthYear() methods, respectively, then
   // returns those properties as a single String in a clean format
   public String toString() {
      return(this.name + "::" + this.birthYear);
   }
   
   // equals method, which takes in another Person object, grabs the toString value
   // of each object, and checks if said String values are equal
   public boolean equals(Person_RH person) {
      String firstPerson = toString();
      String secondPerson = person.toString();
      return (firstPerson.equals(secondPerson));
   }

}