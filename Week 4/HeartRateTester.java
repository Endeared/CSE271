/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 9/19/2023
 * This program allows the user to test
 their blueprint Class from the HeartRate Class
 in the same directory as an object.
 *
**/

// vod: https://youtu.be/CiiCvgI0bxI
// (i try to record myself doing assignments
// when possible - two vods since i did this lab
// in two sittings)

public class HeartRateTester {

    // main method
    public static void main(String[] args) {
        // creating our two HeartRate objects and assigning them to a reference variable -
        // one for myself and one for one of my friends
        HeartRate myself = new HeartRate("Ross", "Hamey", 1998, 11, 12, 2023);
        HeartRate friend = new HeartRate("Derek", "Disibio", 1999, 8, 22, 2023);
        
        // calling our object's toString() instance method for each object
        System.out.println("***Testing constructor and toString for each obj***");
        System.out.println(myself.toString());
        System.out.println(friend.toString());
        
        // calling several of our methods from the object (getFirstName, getLastName, birthdateString)
        // for each object and printing out a formatted string of information. i commented out an 
        // alternative way of doing this, but it uses more method calls
        System.out.println("***Testing getters for each obj***");
        System.out.println(myself.getFirstName() + " " + myself.getLastName() + " has birthday " + myself.birthdateString());
        // System.out.println(myself.getFirstName() + " " + myself.getLastName() + " has birthday " + myself.getBirthMonth() 
        //    + "/" + myself.getBirthDay() + "/" + myself.getBirthYear());
        System.out.println("Current year is " + myself.getCurrentYear()); 
        System.out.println(friend.getFirstName() + " " + friend.getLastName() + " has birthday " + friend.birthdateString());
        // System.out.println(friend.getFirstName() + " " + friend.getLastName() + " has birthday " + friend.getBirthMonth() 
        //    + "/" + friend.getBirthDay() + "/" + friend.getBirthYear());
        System.out.println("Current year is " + friend.getCurrentYear()); 
        
        // testing all of our setter methods for each object, then printing out
        // a string using our getter methods to ensure that the object was
        // updated appropriately (for each object);
        System.out.println("***Testing setters for each obj***");
        myself.setFirstName("John");
        myself.setLastName("Doe");
        myself.setBirthYear(1900);
        myself.setBirthMonth(9);
        myself.setBirthDay(19);
        myself.setCurrentYear(2000);
        System.out.println("object myself changed to " + myself.getFirstName() + " " + myself.getLastName() + " "
            + myself.birthdateString() + " current year: " + myself.getCurrentYear());
        friend.setFirstName("Jane");
        friend.setLastName("Doe");
        friend.setBirthYear(1950);
        friend.setBirthMonth(9);
        friend.setBirthDay(19);
        friend.setCurrentYear(2000);
        System.out.println("object friend changed to " + friend.getFirstName() + " " + friend.getLastName() + " "
            + friend.birthdateString() + " current year: " + friend.getCurrentYear());
        
        // testing our calculation methods for each object, and printing out all of the appropriate
        // data formatted accordingly. we use several of our getter methods in addition to our calculation
        // methods
        System.out.println("***Testing calculations for each obj***");
        System.out.println(myself.getFirstName() + " " + myself.getLastName() + " "  + myself.birthdateString()
            + " current year: " + myself.getCurrentYear());
        System.out.println("has age, max heart rate, and target range as follows:");
        System.out.println(myself.age() + ", " + myself.maxRate() + ", " + myself.targetRange()); 
        System.out.println(friend.getFirstName() + " " + friend.getLastName() + " "  + friend.birthdateString()
            + " current year: " + friend.getCurrentYear());
        System.out.println("has age, max heart rate, and target range as follows:");
        System.out.println(friend.age() + ", " + friend.maxRate() + ", " + friend.targetRange()); 
    }

}