public class CardTester {

   public static void main(String[] args) {
   
      Card myCard = new Card("Ross");
      System.out.println(myCard.toString());
      Card myCardCopy = new Card("Ross");
      System.out.println(myCardCopy.equals(myCard));
      
      IDCard myIdCard = new IDCard("Ross", "123ABC");
      System.out.println(myIdCard.toString());
      IDCard myIdCardCopy = new IDCard("Ross", "123ABC");
      System.out.println(myIdCardCopy.equals(myIdCard));
      
      CallingCard myCallingCard = new CallingCard("Ross", "123456", 7890);
      System.out.println(myCallingCard.toString());
      CallingCard myCallingCardCopy = new CallingCard("Ross", "123456", 7890);
      System.out.println(myCallingCardCopy.equals(myCallingCard));
      
      DriverLicense myDriverLicense = new DriverLicense("Ross", "AB123456", 2024);
      System.out.println(myDriverLicense.toString());
      DriverLicense myDriverLicenseCopy = new DriverLicense("Ross", "XYZ7890", 2024);
      System.out.println(myDriverLicenseCopy.equals(myDriverLicense));
      
   
   }

}