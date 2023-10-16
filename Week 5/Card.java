public class Card
{
   // instance var
   private String name;

   // constructors
   public Card()
   {
      name = "";
   }
   public Card(String n)
   {
      name = n;
   }

   // accessor
   public String getName()
   {
      return name;
   }

   // other instance methods
   public boolean isExpired()
   {
      return false;
   }
   public String format()
   {
      return "Card holder: " + name;
   }
   
   // mandatory toString and equals methods
   public String toString() {
      return ("Card[name=" + name + "]");
   }
   public boolean equals(Card c) {
      return c.getName().equals(name);
   }
   
   
}