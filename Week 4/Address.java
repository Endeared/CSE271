/*
cse271 - week 4
in class activity / object building
Ross Hamey
9/19/2023
*/

public class Address {

   // instance variables
   private int houseNumber;
   private String streetName;
   private String cityName;
   private String stateName;
   private String postalCode;
   private int apartmentNumber;
   
   
 
   // constructors - one without args and one with args
   public Address(int houseNum, String street, String city, String state, String code) {
      this.houseNumber = houseNum;
      this.streetName = street;
      this.cityName = city;
      this.stateName = state;
      this.postalCode = code;
   }
   
   public Address(int houseNum, String street, String city, String state, String code, int apartmentNum) {
      this.houseNumber = houseNum;
      this.streetName = street;
      this.cityName = city;
      this.stateName = state;
      this.postalCode = code;
      this.apartmentNumber = apartmentNum;
   }  
   
   
   // print method to print out our instance variables in a standard format
   public void print() {
      if (apartmentNumber == 0) { 
         System.out.println(houseNumber + " " + streetName);
         System.out.println(cityName + ", " + stateName + " " + postalCode);
      } else {
         System.out.println(houseNumber + " " + streetName + " apt. " + apartmentNumber);
         System.out.println(cityName + ", " + stateName + " " + postalCode);
      }
   }
   
   // comes before - admittedly i was confused about this, since we are using
   // a string to track the postal code - i thought the goal was to check if
   // one zip code was less than the other - instead here i just see if the
   // zip codes are equal, and if not then we assume the provided code came
   // before our stored code
   public boolean comesBefore(Address other) {
      boolean isBefore = true;
      if ((other.postalCode).equals(this.postalCode)) {
         isBefore = false;
      }
      return isBefore;
   }
   
   // getters and setters
   public void setHouseNum(int num) {
      houseNumber = num;
   }
   public int getHouseNum() {
      return houseNumber;
   }
   
   public void setStreet(String street) {
      streetName = street;
   }
   public String getStreet() {
      return streetName;
   }
   
   public void setCity(String city) {
      cityName = city;
   }
   public String getCity() {
      return cityName;
   }
   
   public void setState(String state) {
      stateName = state;
   }
   public String getState() {
      return stateName;
   }
   
   public void setPostal(String postal) {
      postalCode = postal;
   }
   public String getPostal() {
      return postalCode;
   }
   
   public void setApartment(int num) {
      apartmentNumber = num;
   }
   public int getApartment() {
      return apartmentNumber;
   }
   
   
   
}