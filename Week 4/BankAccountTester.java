public class BankAccountTester {

   public static void main(String[] args) {
      BankAccount ba = new BankAccount();
      System.out.println(ba.getAccountNumber());
      // System.out.println(BankAccount.lastAssignedNumber);
      
      BankAccount ba2 = new BankAccount();
      System.out.println(ba2.getAccountNumber());
   }

}