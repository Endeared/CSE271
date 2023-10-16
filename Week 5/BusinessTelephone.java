/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 9/28/2023
 * This class extends our Telephone
 class and allows the user to create BusinessTelephone
 objects with an area code / exchange / number / extension.
 *
**/

// again - no vod for this assignment since it was more or less
// just following along / copying / reviewing oop principles

public class BusinessTelephone extends Telephone 
{
   // instance var
   private String extension;
    
   // constructor
   BusinessTelephone (String areaCode, String exchange, String number, String extension)
   {       
       super(areaCode, exchange, number);
       this.extension = extension;
   }
   
   // toString, overloads default toString and returns information in easy
   // to read format
   public String toString ()
   {
       String superString = super.toString();
       superString += "-" + this.extension;
       return superString;
   }
   
   // call method, which references the getAreaCode method from Telephone superclass
   public void call ()
   {
       System.out.println("Calling area code " + super.getAreaCode());
   }
 
   public static void main(String[] args) 
   {
       // creating our objects and testing prints / call method
       BusinessTelephone bt = new BusinessTelephone("513", "785", "3135", "123");
       System.out.println(bt);
      
       Telephone t1 = new BusinessTelephone("513", "785", "3135", "123");
       System.out.println(t1);
       bt.call();
       
       // commented out this line below so file runs fine
       // BusinessTelephone bt2 = new Telephone("785", "3135", "123");

   }
}

// first execution (toString not overloaded)
// ----jGRASP exec: java BusinessTelephone
// Picked up _JAVA_OPTIONS: -Xmx512M
// (513) 785-3135
// (513) 785-3135
// 
// ----jGRASP: operation complete.

// second execution (toString overloaded)
// ----jGRASP exec: java BusinessTelephone
// Picked up _JAVA_OPTIONS: -Xmx512M
// (513) 785-3135
// (513) 785-3135
// 
// ----jGRASP: operation complete.

// third execution (trying to get areaCode without accessor)
// Picked up _JAVA_OPTIONS: -Xmx512M
// BusinessTelephone.java:21: error: areaCode has private access in Telephone
//        System.out.println("Calling area code " + super.areaCode);
//                                                       ^
// 1 error

// fourth execution - we add a getAreaCode method to telephone
// class and call this accessor method
// Picked up _JAVA_OPTIONS: -Xmx512M
// (513) 785-3135-123
// (513) 785-3135-123
// Calling area code 513
// 
//  ----jGRASP: operation complete.

// fifth execution - trying to create a BusinessTelephone instance
// by calling the Telephone class - does not work
// Picked up _JAVA_OPTIONS: -Xmx512M
// BusinessTelephone.java:35: error: incompatible types: Telephone cannot be converted to BusinessTelephone
//        BusinessTelephone bt2 = new Telephone("785", "3135", "123");
//                                ^
// 1 error