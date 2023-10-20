import java.util.*;

public class SetRunner
{
   public static void main(String[] args)
   {
//       HashSet<String> myHashSet = new HashSet<String>();
//       myHashSet.add("aaa"); //001
//       myHashSet.add("bbb");//003
//       myHashSet.add("crc");///002
//       myHashSet.add("ddd");
//       myHashSet.add("eee");
//       myHashSet.add("fff");
//       myHashSet.add("g9g");
//       myHashSet.add("aaa");
//       myHashSet.add("bbb");
//       myHashSet.add("crc");
//       myHashSet.add("ddd");
//       myHashSet.add("eee");
//       myHashSet.add("fff");
//       myHashSet.add("g5g");
//     
//       for (String s : myHashSet)
//       {
//          System.out.println(s + ":" + s.hashCode());
//       }
//       System.out.println("===Tree Set Output======");
//       TreeSet<String> myTreeSet = new TreeSet<String>();
//       myTreeSet.add("aaa"); 
//       myTreeSet.add("bbb");
//       myTreeSet.add("crc");
//       myTreeSet.add("ddd");
//       myTreeSet.add("eee");
//       myTreeSet.add("fff");
//       myTreeSet.add("g9g");
//       myTreeSet.add("aaa");
//       myTreeSet.add("bbb");
//       myTreeSet.add("ccc");
//       myTreeSet.add("ddd");
//       myTreeSet.add("eee");
//       myTreeSet.add("fff");
//       myTreeSet.add("g5g");
//       
//       for (String s : myTreeSet)
//       {
//          System.out.println(s);
//       }
      
      System.out.println("--- Hash Set ---");
      HashSet<Dog> myDogSet = new HashSet<Dog>();
      myDogSet.add(new Dog("Elvis", "Yorkshire Terrier"));
      myDogSet.add(new Dog("Toby", "Shepherd-Beagle Mix"));
      myDogSet.add(new Dog("Scooter", "Golden Retriever"));
      myDogSet.add(new Dog("Zipper", "Golden Retriever"));
      myDogSet.add(new Dog("Tiku", "Pitbull"));

      for (Dog dog : myDogSet) {
         System.out.println(dog);
      }
      
      System.out.println("--- Tree Set ---");
      TreeSet<Dog> myDogTreeSet = new TreeSet<Dog>();
      myDogTreeSet.add(new Dog("Elvis", "Yorkshire Terrier"));
      myDogTreeSet.add(new Dog("Toby", "Shepherd-Beagle Mix"));
      myDogTreeSet.add(new Dog("Scooter", "Golden Retriever"));
      myDogTreeSet.add(new Dog("Zipper", "Golden Retriever"));
      myDogTreeSet.add(new Dog("Tiku", "Pitbull"));

      for (Dog dog : myDogTreeSet) {
         System.out.println(dog);
      }

  }
}
