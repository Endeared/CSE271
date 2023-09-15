public class Counter
{
   // instance vars
   private int value;
   
   // constructors
   public Counter() {
      value = 0;
   }
   
   public Counter(int startFrom) {
      value = startFrom;
   }
   
   // instance methods
   public void reset() {
      value = 0;
   }
   
   public void count() {
      value = value + 1;
   }
   
   public int getValue() {
      return value;
   }
}
