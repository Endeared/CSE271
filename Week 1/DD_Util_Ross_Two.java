// Ross Hamey

import java.util.*;
import java.io.*;

public class DD_Util_Ross_Two {

   public static void main(String[] args){
       int[] b = randomIntArray(10,100);
       for(int i=0;i<b.length;i++){
         System.out.print(b[i]+",");
       }
       smallest(b, 0);
   }

   public static void pr(String str){
      System.out.print(str);
   }
   public static void prl(Object str){
      System.out.println(str);
   }
    
   /**A method to swap two integers in an array
   @param a, an array of integers
   @param i, an integer representing an index in array a
   @param j, an integer representing an index in array a
   @return none (void)
   */
   public static void swap(int[] a, int i, int j){
      int arrLength = a.length;
      if ((arrLength - 1) < i || (arrLength - 1) < j) {
        System.out.print("One or more indices out of range.");
      } else {
        int valOne = a[i];
        int valTwo = a[j];
        a[i] = valTwo;
        a[j] = valOne;
      }
   }
   
   
      /**
    Creates an array filled with random values.
    @param length the length of the array
    @param n the number of possible random values
    @return an array filled with length numbers between
    0 and n - 1
   */
   public static int[] randomIntArray(int length, int n){
      Random generator = new Random();
      int[] a = new int[length];
      for(int i = 0; i < a.length; i++){
         a[i] = generator.nextInt(n);
      }  
      return a;
   }
   
   /* method to find smallest element in the tail range of
   an array
   @param arr, the int array to iterate through
   @param startIndex, an int value representing the index
   at which to begin the tail range of arr
   @return smallestIndex, an int value representing the index
   of the smallest element in the range from arr[startIndex] to
   arr[arr.length - 1]
   */
   public static int smallest(int[] arr, int startIndex) {
      System.out.println();
      int arrLength = arr.length;
      if (startIndex > arrLength - 1) {
        return -1;
      } else {
        int smallest = arr[startIndex];
        int smallestIndex = startIndex;
        for (int i = startIndex; i < arrLength; i++) {
          int thisVal = arr[i];
          if (thisVal < smallest) {
            smallestIndex = i;
            smallest = arr[i];
          }
        }
        return smallestIndex;
      }
      return -1;
   }
    
    
 
  
  }