/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 10/10/2023
 * Rectangle_RH class, which we use for creating a
 simple Rectangle object.
 *
**/

// no vod again - worked on this while out of town

public class Rectangle_RH {
   
   // instace vars for width / height
   private double width;
   private double height;
   
   // empty constructor
   public Rectangle_RH() {
      this.width = 0;
      this.height = 0;
   }
   
   // constructor if user provides width and height
   public Rectangle_RH(double w, double h) {
      this.width = w;
      this.height = h;
   }
   
   // setter for width
   public void setWidth(double w) {
      this.width = w;
   }
   
   // setter for height
   public void setHeight(double h) {
      this.height = h;
   }
   
   // getter for width
   public double getWidth() {
      return width;
   }
   
   // getter for height
   public double getHeight() {
      return height;
   }
   
   // worker method to calculate perimeter and return it
   public double perimeter() {
      double perimeter = (height * 2) + (width * 2);
      return perimeter;
   }
   
   // worker method to calculate area and return it
   public double area() {
      double area = height * width;
      return area;
   }
   
}