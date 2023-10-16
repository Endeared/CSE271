public class BankAccount {

   private double balance;
   private int accountNumber;
   private static int lastAssignedNumber = 1000;

   public BankAccount() {
      lastAssignedNumber += 1;
      accountNumber = lastAssignedNumber;
   }
   
   public int getAccountNumber() {
      return accountNumber;
   }
}