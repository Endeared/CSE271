public class StringTester{
   public static void main(String[] args){
      String a = "MIAMI";//stored at location 450
      String b = "MIAMI";//stored at location 450
      String c = new String("MIAMI");//stored at location 480. new keywords creats a new object in a new memory location.
      if(a.equals(c)){
         System.out.println("Equal");
       }
       else{
          System.out.println("Not equal");

       }
   }
}