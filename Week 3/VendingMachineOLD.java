public class VendingMachineOLD
{
   // instance vars - we track cans and tokens
   private int cans;
   private int tokens;
   
   /*
   * constructors - two options; first (default) starts 
   * with no cans / tokens, second starts with a specified
   * amount of cans and 0 tokens
   */
   public VendingMachine() {
      this.cans = 0;
      this.tokens = 0;
   }
   
   public VendingMachine(int startingCans) {
      this.cans = startingCans;
      this.tokens = 0;
   }
   
   // option to buy a can if the machine has cans available
   public void buyCan() {
      if (cans > 0) {
        cans -= 1;
        tokens += 1;
      } else {
        System.out.println("No more cans available! Please restock.");
      }
   }
   
   // option to fill the machine with cans
   public void addCans(int cansToAdd) {
      cans += cansToAdd;
   }
   
   // get current can count
   public int getCans() {
      return cans;
   }
   
   // get current token count
   public int getTokens() {
      return tokens;
   }
}
