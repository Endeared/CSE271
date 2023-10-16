/*
cse271 - week 4
in class activity / object building
Ross Hamey
9/19/2023
*/

public class SodaCan {

    // instance variables
    private int volume;
    private String canColor;
    private String canMaterial;
    private String drinkType;
    private String canState;
    
    
    // constructors - one without args and one with args
    public SodaCan() {
        this.volume = 12;
        this.canColor = "red";
        this.canMaterial = "aluminum";
        this.drinkType = "coca cola";
        this.canState = "unopened";
    }
    
    public SodaCan(int volume, String color, String material, String type, String state) {
        this.volume = volume;
        this.canColor = color;
        this.canMaterial = material;
        this.drinkType = type;
        this.canState = state;
    }   
    
    
    // instance methods - get and set for each instance variable
    public int getVolume() {
        return volume;
    }
    
    public void setVolume(int volume) {
        volume = volume;
    }
    
    public String getColor() {
        return canColor;
    }
    
    public void setColor(String color) {
        canColor = color;
    }
    
    public String getMaterial() {
        return canMaterial;
    }
    
    public void setMaterial(String material) {
        canMaterial = material;
    }
    
    public String getType() {
        return drinkType;
    }
    
    public void setType(String type) {
        drinkType = type;
    }
    
    public String getState() {
        return canState;
    }
    
    public void setState(String state) {
        canState = state;
    }
}