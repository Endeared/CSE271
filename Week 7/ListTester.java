import java.util.*;

public class ListTester {

   public static void main(String[] args) {
   
      LinkedList<String> myList = new LinkedList<String>();
      myList.add("aaa");
      myList.add("bbb");
      myList.add("ccc");
      myList.add("ddd");
      myList.add("eee");
      myList.add("fff");
      myList.add("ggg");
      myList.add("hhh");
      myList.add("iii");
   
      for (int i = 0; i < myList.size(); i++) {
         System.out.println(myList.get(i));
      }
      
      System.out.println("ITERATOR DEMO");
      ListIterator<String> iterator = myList.listIterator();
      while (iterator.hasNext()) {
         System.out.println(iterator.next());
      }
      
      while(iterator.hasPrevious()) {
         System.out.println(iterator.previous());
      }
      
   }


}