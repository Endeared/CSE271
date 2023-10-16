public class IDCard extends Card
{
   // instance vars
   private String idNumber;

   // constructor
   public IDCard(String n, String id) {  
      super(n);
      idNumber = id;
   }
   
   // accessor
   public String getIdNumber()
   {
      return idNumber;
   }
   
   // misc instance method
   public String format()
   {
      String name = super.format();
      String info = name + ", ID Number: " + idNumber;
      return info;
   }
   
   // mandatory toString and equals methods
   public String toString() {
      return ("IDCard[name=" + super.getName() + "][idNumber=" + idNumber + "]");
   }
   public boolean equals(IDCard c) {
      return c.getName().equals(super.getName()) && c.getIdNumber().equals(idNumber);
   }
}