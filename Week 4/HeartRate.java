/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 9/19/2023
 * This Class file allows the user to
 call it from the same directory and instantiate
 an object using the following code.
 *
**/

// vod: https://youtu.be/CiiCvgI0bxI
// (i try to record myself doing assignments
// when possible - two vods since i did this lab
// in two sittings)


public class HeartRate {

    // our instance variables - we need a full name and
    // birthdate and current year
    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private int currentYear;
    
    
    // our only defined constructor - takes in every possible argument for the instance vars
    public HeartRate(String first, String last, int year, int month, int day, int current) {
        this.firstName = first;
        this.lastName = last;
        this.birthYear = year;
        this.birthMonth = month;
        this.birthDay = day;
        this.currentYear = current;
    }
    
    
    // our instance methods below this point ----------------------
    
    /**
     * toString method, our overloaded method for the object which
     * will reference our instance variables / call our birthdateString()
     * instance helper method to return a neat string format of our obj
     * @return final_string, a String value showing our obj data
     */
    public String toString() {
        String final_string = "HeartRate";
        final_string += "[name = " + firstName + " " + lastName + "]";
        final_string += "[birthday = " + birthdateString() + "]";
        final_string += "[current year: " + currentYear + "]";
        return final_string;
    }
    
    /**
     * age method, which takes objects current year minus birth year
     * and returns the resulting int
     * @return the objects currentYear - birthYear instance vars
     */
    public int age() {
        return (currentYear - birthYear);
    }
    
    /**
     * maxRate method, which calls our age() method and subtracts the
     * returned value from 220, and then returns that resulting value
     * to the user
     * @return 220 - age(), which represents the max heart rate for
     * a given age
     */
    public int maxRate() {
        return (220 - age());
    }
    
    /**
     * targetRange method, which calculates the target healthy heart rate
     * range for a given age and returns it in a formatted string
     * @return finalString, a string prompt showing the user's target heart
     * range for their age
     */
    public String targetRange() {
        // getting our max rate, then defining lower / higher bounds and
        // casting them into an int after rounding
        int maxRate = maxRate();
        double lower = maxRate * 0.50;
        double higher = maxRate * 0.85;
        int lowerRounded = (int) Math.round(lower);
        int higherRounded = (int) Math.round(higher);
        
        // formatting our results into a string and returning it to user
        String finalString = "The target heart rate range is " + lowerRounded + " to " + higherRounded + ".";
        return finalString;
    }
    
    /**
     * birthdateString helper method, which returns a formatted string of
     * the users birthdate
     * @return a String value representing the user's birthdate from their
     * birthMonth / birthDay / birthYear instance vars
     */
    public String birthdateString() {
        return (birthMonth + "/" + birthDay + "/" + birthYear);
    }
    
    /**
     * getFirstName, which returns the object's firstName instance var value
     * @return firstName, a string of the objects firstName value
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * setFirstName, which sets the object's firstName variable to a provided value
     * @param name, a String value
     * @return none (void)
     */
    public void setFirstName(String name) {
        firstName = name;
    }
    
    /**
     * getLastName, which returns the object's lastName instance var value
     * @return lastName, a string of the object's lastName value
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * setLastName, which sets the object's lastName variable to a provided value
     * @param name, a String value
     * @return none (void)
     */
    public void setLastName(String name) {
        lastName = name;
    }
    
    /**
     * getBirthYear, which returns the object's birthYear instance var value
     * @return birthYear, an int of the object's birthYear value
     */
    public int getBirthYear() {
        return birthYear;
    }
    
    /**
     * setBirthYear, which sets the object's birthYear variable to a provided value
     * @param year, an int value representing year to set
     * @return none (void)
     */
    public void setBirthYear(int year) {
        birthYear = year;
    }
    
    /**
     * getBirthMonth, which returns the object's birthMonth instance var value
     * @return birthMonth, an int of the object's birthMonth value
     */
    public int getBirthMonth() {
        return birthMonth;
    }
    
    /**
     * setBirthMonth, which sets the object's birthMonth variable to a provided value
     * @param month, an int value representing month to set
     * @return none (void)
     */
    public void setBirthMonth(int month) {
        birthMonth = month;
    }
    
    /**
     * getBirthDay, which returns the object's birthDay instance var value
     * @return birthDay, an int of the object's birthDay value
     */
    public int getBirthDay() {
        return birthDay;
    }
    
    /**
     * setBirthDay, which sets the object's birthDay variable to a provided value
     * @param day, an int value representing day to set
     * @return none (void)
     */
    public void setBirthDay(int day) {
        birthDay = day;
    }
    
    /**
     * getCurrentYear, which returns the object's currentYear instance var value
     * @return currentYear, an int representing the object's currentYear variable value
     */
    public int getCurrentYear() {
        return currentYear;
    }
    
    /**
     * setCurrentYear, which sets the object's currentYear variable to provided value
     * @param year, an int value representing the year to set to
     * @return none (void)
     */
    public void setCurrentYear(int year) {
        currentYear = year;
    }  
}