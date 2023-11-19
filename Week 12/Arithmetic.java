public class Arithmetic
{
   public static void main(String[] args) {
      System.out.println(gcd(135, 20)); // should print 5
      System.out.println(gcd(80, 20)); // should print 20
      System.out.println(gcd(144, 8)); // should print 8
      System.out.println(gcd(144, 26)); // should print 2
      
      System.out.println(gcd(120, 12)); // should return 12
      System.out.println(gcd(420, 24)); // should return 12
   }

   public static int gcd(int a, int b)
   {
      if ((a == 0) || (b == 0))
      {
         return a + b;
      }
      if (a < b) 
      {
         b = b % a;
      }
      else
      {
         a = a % b;
     }
     return gcd(a, b);
   }
}