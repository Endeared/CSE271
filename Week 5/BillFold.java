public class BillFold {

   private Card card1;
   private Card card2;
   
   public void addCard(Card c) {
      if (card1 == null) {
         card1 = c;
      } else if (card2 == null) {
         card2 = c;
      }
   }
   
   public String formatCards() {
      String info = "";
      if (card1 != null) {
         info += card1.format();
         if (card2 != null) {
            info += " | ";
            info += card2.format();
         }
      }
      return info;
   }

}