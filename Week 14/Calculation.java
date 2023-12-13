/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 11/30/2023
 * Calculation class, which contains several methods for
 some simple manipulations (i.e reversing a string, cubing
 a number, etc.).
 *
**/

public class Calculation {

   /**
    * findMax method, which takes in an array of integers and
    * iterates over the array to find the max int in the array
    * @param arr, an array of integers
    * @return max, the highest value integer in arr
    */
   public static int findMax(int arr[]){
      int max=arr[0];
      for(int i=1;i<arr.length;i++){
         if(max<arr[i])
         max=arr[i];
      }
      return max;
   }
   
   /**
    * cube method, which takes in an integer and returns
    * the cubed value of that integer
    * @param num, an integer to cube
    * @return cubed, the cubed value of num
    */
   public static int cube(int num) {
      int cubed = num * num * num;
      return cubed;
   }
   
   /**
    * reverse method, which takes in a String and returns
    * that String as reversed text
    * @param word, a String to reverse
    * @return reversed, a reversed-text representation of word
    */
   public static String reverse (String word) {
      String reversed = "";
      char thisChar;
      
      for (int i = word.length() - 1; i >= 0; i--) {
         thisChar = word.charAt(i);
         reversed += thisChar;
      }
      
      return reversed;
   }
}
