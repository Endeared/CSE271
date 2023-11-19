public class hamey_ClassActivity10 {

   public static void main(String[] args) {
      System.out.println(power(8, 0));
      System.out.println(powerRecursive(2, 3));
   }
   
   public static int power(int x, int n) {
      int result = 1;
   
      if (n != 0) {
         for (int i = 0; i <= n - 1; i++) {
            result = result * x;
         }
         return result;
      }
      
      return result;
   }
   
   public static int powerRecursive(int x, int n) {
      int result = 1;
      
      if (n != 0) {
         result = x * powerRecursive(x, n - 1);
         return result;     
      }
     
      return result;
   }

}