public class VendingMachine 
{
   //Instance variables
   private int numCans;
   private int tokens;

   //Constructor
   public VendingMachine(){
   
   }
   
   public VendingMachine(int cans, int tokens){
      this.numCans = cans;
      this.tokens = tokens;
   }
   //Instance methods
   public void fillUp(int cans) 
   {
      numCans = numCans + cans;
   }

   public void insertToken() 
   {
      if (numCans > 0)
      {
         numCans = numCans - 1;
         tokens = tokens + 1;
      }
   }

   public int getCanCount() 
   {
      return numCans;
   }

   public int getTokenCount() 
   {
      return tokens;
   }
}
