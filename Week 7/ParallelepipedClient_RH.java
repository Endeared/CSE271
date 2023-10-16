/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 10/10/2023
 * ParallelepipedClient_RH class, which we use for testing
 our Parallelepiped and Rectangle classes.
 *
**/

// no vod again - worked on this while out of town

public class ParallelepipedClient_RH {
   
   public static void main(String[] args) {
   
      // creating two rectangle objects by passing in width, height
      Rectangle_RH rectangleOne = new Rectangle_RH(5, 10);
      Rectangle_RH rectangleTwo = new Rectangle_RH(3, 5);
      
      // checking our getters
      System.out.println(rectangleOne.getWidth()); // prints 5.0
      System.out.println(rectangleOne.getHeight()); // prints 10.0
      
      // checking setters + getters
      rectangleOne.setWidth(10);
      rectangleOne.setHeight(20);
      System.out.println(rectangleOne.getWidth()); // prints 10.0
      System.out.println(rectangleOne.getHeight()); // prints 20.0
      
      // checking our worker methods - for rectangleOne, 10 + 10 + 20 + 20 = 60
      // for rectangleOne, 10 * 20 = 200
      System.out.println(rectangleOne.perimeter()); // prints 60.0
      System.out.println(rectangleOne.area()); // prints 200.0
      
      // creating two parallelepiped objects by passing in width, height, length
      Parallelepiped_RH boxOne = new Parallelepiped_RH(5, 10, 15);
      Parallelepiped_RH boxTwo = new Parallelepiped_RH(3, 5, 10);
      
      // checking getters for boxOne
      System.out.println(boxOne.getWidth()); // prints 5.0
      System.out.println(boxOne.getHeight()); // prints 10.0
      System.out.println(boxOne.getLength()); // prints 15.0
      
      // checking getters and setters for boxOne
      boxOne.setWidth(2);
      boxOne.setHeight(4);
      boxOne.setLength(6);
      System.out.println(boxOne.getWidth()); // prints 2.0
      System.out.println(boxOne.getHeight()); // prints 4.0
      System.out.println(boxOne.getLength()); // prints 6.0
      
      // for boxOne - 2.0 x 4.0 = 8.0
      // (8.0 x 2.0) + (6.0 x 4.0 x 2.0) + (6.0 x 2.0 x 2.0) = 88.0
      // 6.0 x 4.0 x 2.0 = 48.0
      System.out.println(boxOne.baseArea()); // prints 8.0
      System.out.println(boxOne.area()); // prints 88.0
      System.out.println(boxOne.volume()); // prints 48.0
      
   }

}