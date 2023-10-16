/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 9/28/2023
 * This class allows the user to create Telephone
 objects containing an area code / exchange / number,
 and call various methods to get information about
 the Telephone instance.
 *
**/

// again - no vod for this assignment since it was more or less
// just following along / copying / reviewing oop principles

public class Telephone
{
    // instance vars
    private String areaCode;
    private String exchange;
    private String number;
 
  
    // constructor
    Telephone (String areaCode, String exchange, String number)
    {
       this.areaCode = areaCode;
       this.exchange = exchange;
       this.number = number;
    }
    
    // overloaded toString method to return object in a
    // cleanly formatted string
    public String toString ()
    {
      return String.format("(%s) %s-%s", this.areaCode, this.exchange, this.number);
    }
    
    // accessor method to get area code
    public String getAreaCode() {
      return areaCode;
    }
    
    public static void main(String[] args) 
    {
      // creating telephone object and printing it out
      // using our overloaded toString method
      Telephone t = new Telephone("123", "345", "1234");
      System.out.println(t);
    }
}

// first execution (toString not overloaded)
// ----jGRASP exec: java Telephone
// Picked up _JAVA_OPTIONS: -Xmx512M
// Telephone@5a07e868
// ----jGRASP: operation complete.


// second execution (toString overloaded)
//  ----jGRASP exec: java Telephone
// Picked up _JAVA_OPTIONS: -Xmx512M
// (123) 345-1234
// 
//  ----jGRASP: operation complete.