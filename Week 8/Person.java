public class Person implements Comparable<Person>
{
   private String firstName;
   private String lastName;
   
   public Person(String firstName, String lastName)
   {
      this.firstName = firstName;
      this.lastName = lastName;
   }
   
   public String getFirstName() { return firstName; }
  
   public String getLastName() { return lastName; }
  
   public String toString()
   {
       return "Name: " + firstName + " " + lastName;
   }
   
   public int compareTo(Person p) {
      String p1 = this.firstName + this.lastName;
      String p2 = p.getFirstName() + p.getLastName();
      return p1.compareTo(p2);
   }
}