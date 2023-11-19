/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 11/19/2023
 * hamey_ClassActivity10 Class, which has 6 different methods (for 3 different
 * uses), with each method pair containing a non-recursive and recursive solution
 * for the problem (respectively).
**/

public class hamey_ClassActivity10 {

   // main method, to test our other methods
   public static void main(String[] args) {
      // testing power methods
      System.out.println("=== TESTING POWER METHODS ===");
      System.out.println(power(8, -1)); // prints 1
      System.out.println(powerRecursive(2, 3)); // prints 8
      System.out.println();
      
      // testing factorial methods
      System.out.println("=== TESTING FACTORIAL METHODS ===");
      System.out.println(factorial(5)); // prints 120
      System.out.println(factorialRecursive(20)); // prints 2432902008176640000
      System.out.println();
      
      // testing writeVertical methods
      System.out.println("=== TESTING WRITEVERTICAL METHODS ===");
      writeVertical(1234); // prints 1 2 3 4, each on new line
      writeVerticalRecursive(5678); // prints 5 6 7 8, each on new line
   }
   
   /**
    * power method, which takes in a number and a power, and returns
    * the result of that number to the power.
    * @param x, an int representing the number
    * @param n, an int representing the power
    * @return result, an int representing the result of x to the nth power 
    */
   public static int power(int x, int n) {
      // setting result to 1
      int result = 1;
   
      // if our power is greater than 0, we loop up until our index is <= our power
      // - 1, each time multiplying our result by x
      if (n > 0) {
         for (int i = 0; i <= n - 1; i++) {
            result = result * x;
         }
         // return result after loop finishes
         return result;
      }
      
      // otherwise, we just return the result of 1, since anything to the
      // 0th power is 1, and our function assumes the provided int is positive
      return result;
   }
   
   /**
    * recursive power method, which takes in a number and a power, and returns
    * the result of that number to the power.
    * @param x, an int representing the number
    * @param n, an int representing the power
    * @return result, an int representing the result of x to the nth power 
    */
   public static int powerRecursive(int x, int n) {
      // setting result to 1
      int result = 1;
      
      // if our power is greater than 0, we find our result by calling our
      // powerRecursive method recursively, supplying the same x but supplying
      // the power - 1, then returning that times x as a result 
      if (n > 0) {
         result = x * powerRecursive(x, n - 1);
         return result;     
      }
     
      // otherwise, we just return the result of 1, since anything to the
      // 0th power is 1, and our function assumes the provided int is positive
      return result;
   }
   
   /**
    * factorial method, which takes in an int representing a base
    * to find the factorial of, and returns a long value representing
    * the result of that base's factorial
    * @param base, an int representing the number to take the factorial of
    * @return total, a long value representing the base's factorial value,
    * or return 1 if the base is 1
    */
   public static long factorial(int base) {
      // setting total to 1 - i opted to use a long value since factorials
      // can stack up very quickly (i.e factorial of 20 is too long for int)
      long total = 1;
      
      // if the base is 1, we just return total since the factorial of 1 is 1
      if (base == 1) {
         return total;
      // otherwise, iterate over all nums from 1 to our base, multiplying our total
      // by said nums
      } else {
         for (int i = 1; i <= base; i++) {
            total *= i;
         }
         // then return that total
         return total;
      }
   }
   
   /**
    * recursive factorial method, which takes in an int representing a base
    * to find the factorial of, and returns a long value representing
    * the result of that base's factorial
    * @param base, an int representing the number to take the factorial of
    * @return total, a long value representing the base's factorial value, or
    * return 1 if the base is 1
    */
   public static long factorialRecursive(int base) {
      // if our base is 1 (or less), we just return our base
      if (base <= 1) {
         return 1;
      // otherwise, we find our new base by subtracting 1 from our
      // base, then getting the resulting factorial by recursively
      // calling our method with the new base provided, and multiplying
      // the returned value by our base
      } else {
         int newBase = base - 1;
         long result = base * factorialRecursive(newBase);
         // then we return said value
         return result;
      }
   }
   
   /**
    * writeVertical method, which takes in an int number containing x amount
    * of digits, and prints out those digits in order 1 by 1 on a new line each
    * time
    * @param num, the number to print out the digits of
    * @return nothing (void)
    */
   public static void writeVertical(int num) {
      // converting our num to a String
      String numString = String.valueOf(num);
      
      // if the length of the String is <= 1, we just print out the String
      if (numString.length() <= 1) {
         System.out.println(numString);
      // otherwise, we iterate over the String and print each character
      } else {
         for (int i = 0; i < numString.length(); i++) {
            System.out.println(numString.charAt(i));
         }
      }
   }
   
   /**
    * recursive writeVertical method, which takes in an int number containing x amount
    * of digits, and prints out those digits in order 1 by 1 on a new line each
    * time
    * @param num, the number to print out the digits of
    * @return nothing (void)
    */
   public static void writeVerticalRecursive(int num) {
      // converting our num to a String
      String numString = String.valueOf(num);
      
      // if the length of the String is <= 1, we just print out the String
      if (numString.length() <= 1) {
         System.out.println(numString);
      // otherwise, we take the last character off the String, convert our new String to
      // a number, then pass that number into our method recursively, and lastly print out
      // the final character in our existing String
      } else {
         int newNum = Integer.parseInt(numString.substring(0, numString.length() - 1));
         writeVerticalRecursive(newNum);
         System.out.println(numString.charAt(numString.length() - 1));
      }
   }

}

// run example below

//  ----jGRASP exec: java hamey_ClassActivity10
// Picked up _JAVA_OPTIONS: -Xmx512M
// === TESTING POWER METHODS ===
// 0
// 8
// 
// === TESTING FACTORIAL METHODS ===
// 120
// 2432902008176640000
// 
// === TESTING WRITEVERTICAL METHODS ===
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 
//  ----jGRASP: operation complete.
