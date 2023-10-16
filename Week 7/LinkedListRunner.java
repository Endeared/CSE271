import java.util.*;

public class LinkedListRunner
{

   public static void downsize(LinkedList<String> employeeNames, int n) {
      ListIterator<String> iterator = employeeNames.listIterator();
      int count = 0;
      while(iterator.hasNext()) {
         String name = iterator.next();
         count += 1;
         if (count % n == 0) {
            iterator.remove();
         }
      }
   }
   
   public static void reverse(LinkedList<String> strings) {
      
      LinkedList<String> copyStrings = new LinkedList<String>();
      
      for (int i = strings.size() - 1; i >= 0; i--) {
         copyStrings.add(strings.get(i));
      }
      
      for (int i = 0; i < copyStrings.size(); i++) {
         strings.set(i, copyStrings.get(i));
      }
      
   }

   public static void main(String[] args)
   {
//       LinkedList<String> myList = new LinkedList<String>();
//       myList.add("Veggies");
//       myList.add("Fruits");
//       myList.add("Toys");
//       myList.add("Garden Soil");
//       myList.add("Cards");
//       myList.add("Meat");
//       myList.add("Dairy");
//       myList.add("Candles");
//       myList.add("Fruits");
//       for(int i=0; i<myList.size();i++){
//          System.out.println(myList.get(i));
//       }
//       
//       System.out.println("======Iterator Demo========");
//       ListIterator<String> iterator = myList.listIterator();
//       while(iterator.hasNext()){
//          System.out.println(iterator.next());
//       }
//       
//       System.out.println("======Iterator Demo Reverse========");
//       String vowels = "aeiou";
//       while(iterator.hasPrevious()){
//          String thisString = iterator.previous();
//          System.out.println(thisString);
//          String firstChar = thisString.substring(0, 1).toLowerCase();
//          if (vowels.contains(firstChar)) {
//             iterator.remove();
//          }
//       }
//       
//       System.out.println("======Iterator Forwards Again========");
//       while(iterator.hasNext()){
//          System.out.println(iterator.next());
//       }
//       
//       System.out.println("======Downsize Demo========");
//       LinkedList<String> myList2 = new LinkedList<String>();
//       myList2.add("John");
//       myList2.add("Jane");
//       myList2.add("Bob");
//       myList2.add("Barb");
//       myList2.add("Joe");
//       myList2.add("Jess");
//       myList2.add("Richard");
//       myList2.add("Rita");
//       myList2.add("Fred");
//       myList2.add("Fran");
//       System.out.println("check");
//       
//       downsize(myList2, 2);
//       for(int i=0; i<myList2.size();i++){
//          System.out.println(myList2.get(i));
//       }
//       
//       reverse(myList2);
//       for(int i=0; i<myList2.size();i++){
//          System.out.println(myList2.get(i));
//       }
      
      LinkedList<String> staff = new LinkedList<String>();
      ListIterator<String> iterator2 = staff.listIterator();
      iterator2.add("Tom");
      iterator2.add("Diana");
      iterator2.add("Harry");
      iterator2 = staff.listIterator();
      if (iterator2.next().equals("Tom")) { 
         iterator2.remove();
      }
      while (iterator2.hasNext()) { 
         System.out.println(iterator2.next()); 
      }
      
      
      
   }
 }
 
