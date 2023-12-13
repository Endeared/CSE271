import java.util.ArrayList;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;

public class NameGuesser
{
   private ArrayList<String> lastNames = new ArrayList<String>();
   private TreeSet<String> tree = new TreeSet<String>();


   public void readNames() throws IOException, MalformedURLException
      {
         // Read the last names
         // URL url = new URL("http://www.census.gov/genealogy/names/dist.all.last");
         URL url = new URL("https://1000randomnames.com/");
         Scanner in = new Scanner(url.openStream());
       
         while (in.hasNext())
         {
            // Read the last name
            String lastName = in.next();
            System.out.println(lastName);
            lastNames.add(lastName);
            
            // Ignore the statistical information
            // in.nextDouble();
            // in.nextDouble();
            // in.nextInt();
         }
         in.close();
         
         // Sort the names
         for (String s : lastNames) {
            tree.add(s);
         }
         
         Iterator iterator = tree.iterator();
         System.out.println("=== SORTED DATA ===");
         while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
            System.out.println();
         }
         
      }
      public static void main(String[] args) throws Exception{
         NameGuesser a = new NameGuesser();
         a.readNames();
      }
}