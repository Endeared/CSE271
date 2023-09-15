public class VendingMachine 
{
   private int numCans;
   private int tokens;

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