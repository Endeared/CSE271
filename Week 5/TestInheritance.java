import java.util.*;

class TestInheritance {

   public static void main(String[] args) {
      // creating dog objects
      Dog d = new Dog("Toby", "Shepherd-Beagle Mix");
      System.out.println(d.toString());
      Dog d2 = new Dog("Zipper", "Golden Retriever");
      System.out.println(d2.toString());
      
      // testing equality for dog objects
      System.out.println(d2.equals(d));
      d2.setName("Toby");
      d2.setBreed("Shepherd-Beagle Mix");
      System.out.println(d2.equals(d));
      
      // creating cat object
      Cat c = new Cat("Patches", "Maine Coon");
      System.out.println(c.toString());
      
      ArrayList<Object> dogcatList = new ArrayList<Object>();
      dogcatList.add(new Dog("Fred", "GS"));
      dogcatList.add(new Cat("Copper", "AS"));
      dogcatList.add(new String());
   }

}