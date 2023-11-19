/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 11/16/2023
 * hamey_Ross_Helper class, which is used to test our sorting
 * and searching methods.
**/

// all of our imports
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;


public class hamey_Ross_Helper {
   
   // global variable to keep track of merge comparisons - admittedly the recursion in the
   // merge sort was hurting my head and couldn't think of a better way to do this, albeit
   // super crude and bad
   public static int mergeComparisons = 0;

   public static void main(String[] args) throws FileNotFoundException {
   
      // making arraylist of options / initializing scanner for input, choice, and valid bool
      ArrayList<String> options = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5"));
      Scanner userInput = new Scanner(System.in);
      String choice = "";
      boolean valid = false;
      
      // repeatedly prompt user to select from menu until their choice is valid. if it is
      // invalid, prompt them to select again
      while (!valid) {
         System.out.println("Choose from the following options:");
         System.out.println();
         System.out.println("1. Linear Search");
         System.out.println("2. Binary Search");
         System.out.println("3. Selection Sort");
         System.out.println("4. Insertion Sort");
         System.out.println("5. Merge Sort");
         System.out.println();
         System.out.print("Enter your choice: ");
         choice = userInput.next();
         
         if (options.contains(choice)) {
            break;
         } else {
            System.out.println("Invalid input. Please enter a valid input (1, 2, 3, 4, or 5).");
         }
      }
      
      // prompt the user with their selection depending on their choice
      if (choice.equals("1")) {
         System.out.println("You selected Linear Search.");
      } else if (choice.equals("2")) {
         System.out.println("You selected Binary Search.");
      } else if (choice.equals("3")) {
         System.out.println("You selected Selection Sort.");
      } else if (choice.equals("4")) {
         System.out.println("You selected Insertion Sort.");
      } else if (choice.equals("5")) {
         System.out.println("You selected Merge Sort.");
      }

      // try grabbing and opening file name from user - if we successfully break out,
      // then the filename / path is valid
      String fileName = "";
      while (!valid) {
         try {
            System.out.print("Enter the input filename: ");
            fileName = userInput.next();
            File inputFileTemp = new File(fileName);
            Scanner fileReaderTemp = new Scanner(inputFileTemp);
            fileReaderTemp.close();
            break;
         } catch (Exception error) {
            System.out.println("Could not open / locate that file. Please try again.");
         }
      }
      
      // so we re-assign the file and scanner here since we already know the filename
      // is valid
      File inputFile = new File(fileName);
      Scanner fileReader = new Scanner(inputFile);
      
      // then we create an ArrayList of each string in the file
      ArrayList<String> words = new ArrayList<String>();
      while (fileReader.hasNext()) {
         words.add(fileReader.next());
      }
      
      // here is our main calling routine. for the search options (1 and 2), we grab
      // the word to search for then call our searching methods accordingly. for our
      // sort options (3, 4, 5), we call our sorting methods, but in the case of out
      // merge sort we do a little bit extra work outside of the method, since we end
      // up calling it recursively
      if (choice.equals("1")) {
         String searchWord = getSearchString(userInput, fileName);
         linearSearch(words, searchWord, fileName);
      } else if (choice.equals("2")) {
         String searchWord = getSearchString(userInput, fileName);
         binarySearch(words, searchWord, fileName);
      } else if (choice.equals("3")) {
         selectionSort(words, fileName);
      } else if (choice.equals("4")) {
         insertionSort(words, fileName);
      } else if (choice.equals("5")) {
         // prompt user, start clock timer
         System.out.println("Performing Merge Sort on " + fileName + ". Please wait...");
         long start = System.currentTimeMillis();
         words = mergeSort(words, fileName);
         // end timer after merge sort finishes
         long stop = System.currentTimeMillis();
         long time = stop - start;
         
         // try writing data to our ouput and input_sorted files, making sure to close
         try {
            PrintWriter writer = new PrintWriter("output.txt");
            writer.println("Merge Sort requested");
            writer.println("Input file is " + fileName);
            writer.println("Number of comparisons made: " + mergeComparisons);
            writer.println("Time taken: " + time + "ms, or " + time / 1000 + "s");
            writer.close();
            
            PrintWriter sorted = new PrintWriter("input_sorted.txt");
            for (String item : words) {
               sorted.println(item);
            }
            sorted.close();
            
            System.out.println("Sorting complete. Please consult output.txt for details.");
         // otherwise, prompt user with an error
         } catch (Exception error) {
            System.out.println("Could not write to output.txt.");
         }
         // and reset our global comparison var
         mergeComparisons = 0;
      }
   
   }
   
   /**
      getSearchString method, which prompts the user for a String to search for
      and returns it
      @param userInput, a Scanner object to grab input from
      @param fileName, a String representing the name of the file / path of file to be used
      @return searchWord, a String representing the String to search for in the file 
    */
   public static String getSearchString(Scanner userInput, String fileName) {
      System.out.print("Enter the search string: ");
      String searchWord = userInput.next();
      System.out.println("Searching for " + searchWord + " in " + fileName + "...");
      return searchWord;
   }
   
   /**
      mergeSort method, which takes in an ArrayList of words and a file name and sorts said
      ArrayList in place, then prints results to two new files
      @param words, an ArrayList of Strings to search through
      @param fileName, the fileName containing our words
      @return finalArr, an ArrayList of Strings representing our sorted ArrayList
    */
   public static ArrayList<String> mergeSort(ArrayList<String> words, String fileName) {
      // NOTE: admittedly, this method and the helper merge method stumped me, so i had to look
      // online to get guidance / figure out how to go about performing a merge sort on an ArrayList
      // of Strings. i wanted to avoid recursion but couldn't think of a way to do it otherwise, which
      // makes for two very messy methods using a global variable
      
      // if our words ArrayList has a size of 1 or less, we return it
      if (words.size() <= 1) {
         return words;
      }
      
      // otherwise, we initialize two ArrayLists that we will split our values into
      ArrayList<String> left = new ArrayList<String>();
      ArrayList<String> right = new ArrayList<String>();
      
      // ...and here we iterate over our words ArrayList, adding our strings at odd indices to
      // the left array, and strings at even indices to the right array 
      for (int i = 0; i < words.size(); i++) {
         if (i % 2 != 0) {
            left.add(words.get(i));
         } else {
            right.add(words.get(i));
         }
      }
      
      // then, we recursively call our mergeSort method until the split arrays are of length
      // 1 or less
      left = mergeSort(left, fileName);
      right = mergeSort(right, fileName);
      
      // and finally, we merge our two arrays by calling the merge helper function, then return
      // the final array
      ArrayList<String> finalArr = merge(left, right);
      return finalArr;
   }
   
   /**
      merge method, which helps our mergeSort method by handling the merging of two
      ArrayLists into a single ArrayList that gets returned
      @param left, an ArrayList of String objects to merge
      @param right, a second ArrayList of String objects to merge
      @return retArr, a sorted ArrayList representing a combination of left and right
    */
   public static ArrayList<String> merge(ArrayList<String> left, ArrayList<String> right) {
      // NOTE: admittedly, this method and the main mergeSort method stumped me, so i had to look
      // online to get guidance / figure out how to go about performing a merge sort on an ArrayList
      // of Strings. i wanted to avoid recursion but couldn't think of a way to do it otherwise, which
      // makes for two very messy methods using a global variable
      
      // creating new ArrayList of Strings to return at the end
      ArrayList<String> retArr = new ArrayList<String>();
      
      // while there are still values in our two left and right ArrayLists, we compare values at
      // the 0th index of each ArrayList, and add the smaller of the two values to our retArr
      while (!left.isEmpty() && !right.isEmpty()) {
         if (left.get(0).compareTo(right.get(0)) < 0) {
            mergeComparisons += 1;
            retArr.add(left.get(0));
            left.remove(0);
         } else {
            mergeComparisons += 1;
            retArr.add(right.get(0));
            right.remove(0);
         }
      }
      
      // if we still have values left in either our left or right arraylist, they are already sorted
      // and we simply add them back to our retArray
      while (!left.isEmpty()) {
         retArr.add(left.get(0));
         left.remove(0);
      }
      while (!right.isEmpty()) {
         retArr.add(right.get(0));
         right.remove(0);
      }
      
      // lastly, we return our retArr (which is now a sorted combination of our left and right
      // input ArrayLists)
      return retArr;
   }
   
   /**
      insertionSort method, which takes in an ArrayList of words and a file name and sorts said
      ArrayList in place, then prints results to two new files
      @param words, an ArrayList of Strings to search through
      @param fileName, the fileName containing our words
      @return nothing (void)
    */
   public static void insertionSort(ArrayList<String> words, String fileName) {
      // prompting user, initializing variables
      System.out.println("Performing Insertion Sort on " + fileName + ". Please wait...");
      int comparisons = 0;
      int swaps = 0;
      long start = System.currentTimeMillis();

      // iterating over our words with an index starting at 1 and a nested index always
      // starting at i - 1. we then iterate until our nested index is equal to 0, each
      // time comparing our word at our index of i to our word at our index of j, and
      // swapping accordingly
      for (int i = 1; i < words.size(); i++) {
         String word = words.get(i);
         int j = i - 1;
         
         while (j >= 0 && word.compareTo(words.get(j)) < 0) {
            comparisons += 1;
            words.set(j + 1, words.get(j));
            swaps += 1;
            j--;
         }
         // we complete our swap here
         swaps += 1;
         words.set(j + 1, word);
      }
      
      // ending timer + calculating ms     
      long stop = System.currentTimeMillis();
      long time = stop - start;
      
      // printing our run details to our output file, as well as printing our sorted
      // list to our input_sorted file and prompting user accordingly
      try {
         PrintWriter writer = new PrintWriter("output.txt");
         writer.println("Insertion Sort requested");
         writer.println("Input file is " + fileName);
         writer.println("Number of comparisons made: " + comparisons);
         writer.println("Number of swaps made: " + swaps);
         writer.println("Time taken: " + time + "ms, or " + time / 1000 + "s");
         writer.close();
         
         PrintWriter sorted = new PrintWriter("input_sorted.txt");
         for (String item : words) {
            sorted.println(item);
         }
         sorted.close();
         
         System.out.println("Sorting complete. Please consult output.txt for details.");
      } catch (Exception error) {
         System.out.println("Could not write to output.txt.");
      }
   }
   
   /**
      selectionSort method, which takes in an ArrayList of words and a file name and sorts said
      ArrayList in place, then prints results to two new files
      @param words, an ArrayList of Strings to search through
      @param fileName, the fileName containing our words
      @return nothing (void)
    */
   public static void selectionSort(ArrayList<String> words, String fileName) {
      // prompting user, settings comparisons / swaps to 0 and starting timer
      System.out.println("Performing Selection Sort on " + fileName + ". Please wait...");
      int comparisons = 0;
      int swaps = 0;
      long start = System.currentTimeMillis();
      
      // iterating over our array with nested for loops, incrementing comparisons accordingly.
      // we compare our word at our nested index and our min, and if our word at our nested
      // index occurs before the word at our min lexicographically, our min becomes our nested index
      for (int i = 0; i < words.size(); i++) {
         int min = i;
         
         for (int j = i + 1; j < words.size(); j++) {
            comparisons += 1;
            if (words.get(j).compareTo(words.get(min)) < 0) {
               min = j;
            }
         }
         // then, we swap words at our index of i and min
         swaps += 1;
         String temp = words.get(i);
         words.set(i, words.get(min));
         words.set(min, temp);
      }
      
      // after we have gone over every word, we stop our timer and calculate ms
      long stop = System.currentTimeMillis();
      long time = stop - start;
      
      // printing our results to our output file, as well as the sorted list
      // to our input_sorted file and prompting the user accordingly
      try {
         PrintWriter writer = new PrintWriter("output.txt");
         writer.println("Selection Sort requested");
         writer.println("Input file is " + fileName);
         writer.println("Number of comparisons made: " + comparisons);
         writer.println("Number of swaps made: " + swaps);
         writer.println("Time taken: " + time + "ms, or " + time / 1000 + "s");
         writer.close();
         
         PrintWriter sorted = new PrintWriter("input_sorted.txt");
         for (String item : words) {
            sorted.println(item);
         }
         sorted.close();
         
         System.out.println("Sorting complete. Please consult output.txt for details.");
      } catch (Exception error) {
         System.out.println("Could not write to output.txt.");
      }
   }
   
   /**
      binarySearch method, which takes in an ArrayList of Strings, a String word to search for,
      and a String representing the name of a file, and searches for said word in the file
      @param words, an ArrayList of Strings to search through
      @param searchWord, the String word to search for in our ArrayList
      @param fileName, the fileName containing our words
      @return nothing (void)
    */
   public static void binarySearch(ArrayList<String> words, String searchWord, String fileName) {
      // prompting user, sorting our words, initializing variables for later use
      System.out.println("Binary search works on sorted data. I will need to sort the data first. Please wait...");
      Collections.sort(words);
      int comparisons = 0;
      long start = System.currentTimeMillis();
      int low = 0;
      int high = words.size() - 1;
      int mid = Integer.MAX_VALUE;
      boolean found = false;
      
      // so long as our low is less than or equal to our high, we must get the midpoint
      // of our remaining ArrayList portion to check, and modify our partition depending
      // on if our midpoint word occurs before or after our search word lexicographically.
      // we repeat this until our midpoint word is equal to our search word
      while (low <= high) {
         mid = (low + high) / 2;
         if (words.get(mid).equals(searchWord)) {
            found = true;
            break;
         } else if (words.get(mid).compareTo(searchWord) < 0) {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
         comparisons += 1;
      }
      
      // stopping timer + calculating ms
      long stop = System.currentTimeMillis();
      long time = stop - start;
      
      // prompting user depending on whether we found our word or not
      if (found == true) {
         System.out.println("String " + searchWord + " found in " + fileName + ". For more details, consult output.txt & input_sorted.txt.");
      } else {
         System.out.println("Could not find String " + searchWord + " in " + fileName + ". For more details, consult output.txt");
      }
      
      // printing results to our output file
      try {
         PrintWriter writer = new PrintWriter("output.txt");
         writer.println("Binary Search requested");
         writer.println("Input file is " + fileName);
         writer.println("Number of comparisons made: " + comparisons);
         writer.println("Time taken: " + time + "ms, or " + time / 1000 + "s");
         writer.close();
      } catch (Exception error) {
         System.out.println("Could not write to output.txt.");
      }
   }
   
   /**
      linearSearch method, which takes in an ArrayList of Strings, a String word to search for,
      and a String representing the name of a file, and searches for said word in the file
      @param words, an ArrayList of Strings to search through
      @param searchWord, the String word to search for in our ArrayList
      @param fileName, the fileName containing our words
      @return nothing (void)
    */
   public static void linearSearch(ArrayList<String> words, String searchWord, String fileName) {
      // prompting user, initializing comparisons and start time and found boolean
      System.out.println("Linear search can work on unsorted data. No sorting required!");
      int comparisons = 0;
      long start = System.currentTimeMillis();
      boolean found = false;
      
      // iterate over our words, incrementing comparisons and checking if our word
      // is equal to the search word
      for (int i = 0; i < words.size(); i++) {
         comparisons += 1;
         String thisWord = words.get(i);
         if (thisWord.equals(searchWord)) {
            found = true;
            break;
         }
      }
      
      // after our loop ends or we find our word (and break out), we end our timer
      // and calculate time in mis
      long stop = System.currentTimeMillis();
      long time = stop - start;
      
      // then, depending on if our word was found or not, we prompt the user
      if (found == true) {
         System.out.println("String " + searchWord + " found in " + fileName + ". For more details, consult output.txt");
      } else {
         System.out.println("Could not find String " + searchWord + " in " + fileName + ". For more details, consult output.txt");
      }
      
      // lastly, we write the appropriate data to our output.txt file
      try {
         PrintWriter writer = new PrintWriter("output.txt");
         writer.println("Linear Search requested");
         writer.println("Input file is " + fileName);
         writer.println("Number of comparisons made: " + comparisons);
         writer.println("Time taken: " + time + "ms, or " + time / 1000 + "s");
         writer.close();
      } catch (Exception error) {
         System.out.println("Could not write to output.txt.");
      }
   }

}