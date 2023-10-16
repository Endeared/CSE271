/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 10/10/2023
 * Parallelepiped_RH class, which we use for creating a
 box extending from our Rectangle class.
 *
**/

// no vod again - worked on this while out of town

public class Parallelepiped_RH extends Rectangle_RH {

   // instance var unique to box
   private double length;
   
   // empty constructor
   public Parallelepiped_RH() {
      super();
      this.length = 0;
   }
   
   // constructor if user passes in all 3 dimensions
   public Parallelepiped_RH(double w, double h, double l) {
      super(w, h);
      this.length = l;
   }
   
   // setter for length
   public void setLength(double l) {
      this.length = l;
   }
   
   // getter for length
   public double getLength() {
      return length;
   }
   
   // worker method to calculate base area of our rectangle
   public double baseArea() {
      return super.area();
   }
   
   // worker method to calculate surface area of our box
   public double area() {
      // getting total surface area of base, width, and height by
      // calling our superclass methods and multiplying correctly
      double baseArea = super.area() * 2;
      double widthArea = super.getWidth() * length * 2;
      double heightArea = super.getHeight() * length * 2;
      // calculating total area, then returning it
      double totalArea = baseArea + widthArea + heightArea;
      return totalArea;
   }
   
   // worker method to calculate volume of our box
   public double volume() {
      // getting width and height from our superclass, multiplying
      // them and length then returning result
      return(super.getWidth() * super.getHeight() * length);
   }
   
}

// results below from running tester file

// ----jGRASP exec: java ParallelepipedClient_RH
// Picked up _JAVA_OPTIONS: -Xmx512M
// 5.0
// 10.0
// 10.0
// 20.0
// 60.0
// 200.0
// 5.0
// 10.0
// 15.0
// 2.0
// 4.0
// 6.0
// 8.0
// 88.0
// 48.0
// 
// ----jGRASP: operation complete.