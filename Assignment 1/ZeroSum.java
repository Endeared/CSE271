/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 9/4/2023
 * This program determines the zero sum status of
 two arrays. The arrays of integers are read from
 two text files.
 *
**/

// vod: https://youtu.be/njse7VP-Ztg
// (i try to record classwork / other stuff i work on
// for my own future reference)

// our imports for grabbing inputs / reading files / throwing errors
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ZeroSum {

  public static void main(String[] args) throws IOException {
    // grabbing file names from user
    Scanner input = new Scanner(System.in);
    pr("Enter the first file to compare: ");
    String fileNameOne = input.next();
    pr("Enter the second file to compare: ");
    String fileNameTwo = input.next();
    
    try {
      // try reading file contents, displaying contents in our
      // newly constructed arrays, then printing zero sum status
      // of two arrays
      int[] fileOneNums = readFileInt(fileNameOne);
      int[] fileTwoNums = readFileInt(fileNameTwo);
      
      prl("Comparing these two arrays for zero sum:");
      displayList(fileOneNums, 5);
      displayList(fileTwoNums, 5);
      
      String zeroSumStatus = String.valueOf(isZeroSum(fileOneNums, fileTwoNums));
      pr("The zero sum status of the two arrays is: " + zeroSumStatus);
    } catch (IOException error) {
      // otherwise, throw IOException error
      throw error;
    }
  }
  
  /*
  * pr, reusable method that takes in a string input and prints it to
  * a single line
  * @param input, a String value to be printed
  * @return none (void)
  */
  public static void pr(String input) {
    System.out.print(input);
  }
  
  /*
  * prl, a reusable method that takes in a string input and prints
  * it to its own line
  * @param input, a String value to be printed
  * @return none (void)
  */
  public static void prl(String input) {
    System.out.println(input);
  }

  /*
  * readFileInt, a method that takes in a fileName and tries to
  * open and locate that file within the same directory
  * @param fileName, a String value represnting the file name to
  * search for
  * @return arr, an integer array representing the integer contents
  * of the file
  */
  public static int[] readFileInt(String fileName) throws IOException {
    try {
      // trying to open file, grab length based on our first val, then
      // create a new array based on length and populate it with remaining
      // vals
      Scanner thisFile = new Scanner(new File(fileName));
      int length = thisFile.nextInt();
      int[] arr = new int[length];
      
      for(int i = 0; i < arr.length; i++) {
        arr[i] = thisFile.nextInt();
      }
      
      // return populated array
      return arr;
    } catch (IOException error) {
      // otherwise, catch and throw error
      throw error;
    }
  }
  
  /*
  * displayList, a method to take in an array of integers and
  * an integer number representing the number of values to display
  * from our integer array
  * @param listOne, an integer array of values that we want to print
  * @param n, an integer value representing the number of values to print
  * @return none (void)
  */
  public static void displayList(int[] listOne, int n) {
    // displaying contents of array in clean format
    for(int i = 0; i < n; i++) {
      if (i == (n - 1)) {
        pr(listOne[i] + "");
      } else {
        pr(listOne[i] + ", ");
      }
    }
    prl("");
  }
  
  /*
  * isZeroSum, a method that takes in two arrays of integers and
  * determines if the two arrays satisfy the zero sum rule (meaning
  * the two arrays have an element with matching absolute values)
  * @param listOne, an integer array to check
  * @param listTwo, an integer array to checxk
  * @return zeroSum, a boolean value representing whether the two
  * arrays satisfy the zero sum rule or not
  */
  public static boolean isZeroSum(int[] listOne, int[] listTwo) {
    // grabbing lengths and declaring our bool to track
    int lengthOne = listOne.length;
    int lengthTwo = listTwo.length;
    boolean zeroSum = false;
    
    // iterating through arrays with nested loops, and checking
    // if any value pairs have a sum of zero
    for (int i = 0; i < lengthOne; i++) {
      int valueOne = listOne[i];
      for (int j = 0; j < lengthTwo; j++) {
        int valueTwo = listTwo[j];
        int sum = valueOne + valueTwo;
        if (sum == 0) {
          // if we find a sum of zero, we set our bool to true
          // and return it
          zeroSum = true;
          return zeroSum;
        }
      }
    }
    
    // otherwise, return false
    return zeroSum;
  }
}

/* first test (nums1 & nums2):
Enter the first file to compare: nums1.txt
Enter the second file to compare: nums2.txt
Comparing these two arrays for zero sum:
2, 3, 1, 7, -2
2, 3, 1, 7, -9
The zero sum status of the two arrays is: true
*/

/* second test (nums2 & nums3):
Enter the first file to compare: nums2.txt
Enter the second file to compare: nums3.txt
Comparing these two arrays for zero sum:
2, 3, 1, 7, -9
6, 7, 5, 3, 4
The zero sum status of the two arrays is: false
*/

/* third test (nums1 & nums3):
Enter the first file to compare: nums1.txt
Enter the second file to compare: nums3.txt
Comparing these two arrays for zero sum:
2, 3, 1, 7, -2
6, 7, 5, 3, 4
The zero sum status of the two arrays is: false
*/