import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;

public class CountWords {

   public static void main(String[] args) {
      if (args.length < 1) {
         System.out.println("Please specify a filename as an argument.");
         return;
      }

      try {
         File file = new File(args[0]);
         Scanner in = new Scanner(file);

         TreeSet<String> uniqueWords = new TreeSet<String>();

         while (in.hasNext()) {
            String word = in.next();
            uniqueWords.add(word);
         }

         for (String word : uniqueWords) {
            System.out.println(word);
         }

         System.out.println("Total unique words: " + uniqueWords.size());
      } catch (Exception error) {
         System.out.println(error);
      }
   }
 }