import java.util.*;
import java.io.*;

public class DD_Util{

   public static void main(String[] args){
       int a[] = randomIntArray(10,50);
       System.out.print("Before sorting:" );

       for(int i=0;i<a.length;i++){
         System.out.print(a[i]+",");
       }
       System.out.println();
      //  swap(a,1,3);
//        System.out.print("After swapping:" );
//        for(int i=0;i<a.length;i++){
//          System.out.print(a[i]+",");
//        }
//        smallest(a,0);
       //System.out.print("The index of smallest element: " + smallest(a,0));
       sort(a); 
       System.out.print("After sorting:" );
       for(int i=0;i<a.length;i++){
          System.out.print(a[i]+",");
        }

          
    }
   public static void sort(int[] a){
      for(int i=0;i<a.length;i++){
         int minPos = smallest(a,i);
         swap(a,minPos,i);
      }
   
   } 
   public static int smallest(int[] arr, int startIndex) {
      //System.out.println();
      int arrLength = arr.length;
      if (startIndex > arrLength - 1) {
        System.out.println("Index out of range.");
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
        //System.out.println("Smallest value is " + smallest + " at index " + smallestIndex + " (in a range from " + startIndex + " to " + (arrLength - 1) + ").");
        return smallestIndex;
      }
      return -1;
   }
    
   public static int[] randomIntArray(int length, int n){
      Random generator = new Random();
      //int num = min + (int)Math.random();
      int[] a = new int[length];
      for(int i=0; i < a.length; i++){
         a[i] = generator.nextInt(n);
      }  
      return a;
   }
   public static void swap(int[] a, int i, int j){
     int swap1 = a[j];
     a[j] = a[i];
     a[i] = swap1;
   }
}