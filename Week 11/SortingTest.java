import java.util.Random;

public class SortingTest {

   public static void main(String[] args){
   
      int numOfItems = 20000;
      int rangeOfItems = 1000;
   
      int array[] = randomIntArray(numOfItems, rangeOfItems);
      System.out.println();
      
      System.out.println("Sorting with bubble sort...");
      long start = System.currentTimeMillis();
      bubbleSort(array); 
      long stop = System.currentTimeMillis();
      long bubbleSortTime = stop - start;
      System.out.println("BUBBLE SORT: " + (bubbleSortTime / 1000) + "s @ " + numOfItems + " items.");
      System.out.println();
      
       System.out.println("Sorting with selection sort...");
       start = System.currentTimeMillis();
       sort(array); 
       stop = System.currentTimeMillis();
       long selectionSortTime = stop - start;
       System.out.println("SELECTION SORT: " + (selectionSortTime / 1000) + "s @ " + numOfItems + " items.");
       System.out.println();
       
       if (bubbleSortTime > selectionSortTime) {
          float multiplier = bubbleSortTime / selectionSortTime;
          System.out.println("Selection sort was " + multiplier + "x faster.");
       } else {
          float multiplier = selectionSortTime / bubbleSortTime;
          System.out.println("Bubble sort was " + multiplier + "x faster.");
       }
       System.out.println("Selection sort time in ms: " + selectionSortTime + "ms");
      System.out.println("Bubble sort time in ms: " + bubbleSortTime + "ms");
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
   
   public static void sort(int[] a){
      for(int i=0;i<a.length;i++){
         int minPos = smallest(a,i);
         swap(a,minPos,i);
      }
   }
   
   public static void bubbleSort(int[] a) {
      for (int i = 0; i < a.length - 1; i++) {
         for (int j = 0; j < a.length - i - 1; j++) {
            if (a[j] > a[j + 1]) {
               int temp = a[j];
               a[j] = a[j + 1];
               a[j + 1] = temp;
            }
         }
      }
   }
   
}