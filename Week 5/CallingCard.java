public class CallingCard extends Card {

   // instance vars
   private String cardNumber;
   private int pin;

   // constructor
   public CallingCard(String n, String num, int p) {
      super(n);
      cardNumber = num;
      pin = p;
   }

   // accessors
   public String getCardNumber() {
      return cardNumber;
   }
   public int getPin() {
      return pin;
   }
   
   // misc instance method
   public String format()
   {
      String name = super.format();
      String info = name + ", Card Number: " + cardNumber + ", PIN: " + pin;
      return info;
   }
   
   // mandatory toString and equals methods
   public String toString() {
      return ("CallingCard[name=" + super.getName() + "][cardNumber=" + cardNumber + "][pin=" + pin + "]");
   }
   public boolean equals(CallingCard c) {
      return c.getName().equals(super.getName()) && c.getCardNumber().equals(cardNumber) && c.getPin() == pin;
   }

}