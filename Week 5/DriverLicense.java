public class DriverLicense extends IDCard {

   // instance var
   private int expirationYear;

   // constructor
   public DriverLicense(String n, String id, int expiration) {
      super(n, id);
      expirationYear = expiration;
   }

   // accessor
   public int getExpiration() {
      return expirationYear;
   }
   
   // misc instance method
   public String format()
   {
      String nameAndId = super.format();
      String info = nameAndId + ", Expiration: " + expirationYear;
      return info;
   }
   
   // mandatory toString and equals methods
   public String toString() {
      return ("DriverLicense[name=" + super.getName() + "][idNumber=" + super.getIdNumber() + "][expirationYear=" + expirationYear + "]");
   }
   public boolean equals(DriverLicense c) {
      return c.getName().equals(super.getName()) && c.getIdNumber().equals(super.getIdNumber()) && c.getExpiration() == expirationYear;
   }

}