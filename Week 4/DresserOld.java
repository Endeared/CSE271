/*
cse271 - week 4
in class activity / object building
Ross Hamey
9/19/2023
*/

public class DresserOld {

    // instance variables
    private int numOfDrawers;
    private int numOfCabinets;
    private int numOfShelves;
    private String color;
    private String material;
    private String stateOfDrawers;
    
    
    // constructors - one without args and one with args
    public Dresser() {
        this.color = "brown";
        this.material = "wood";
        this.stateOfDrawers = "closed";
    }
    
    public Dresser(int drawers, int cabinets, int shelves, String color, String material, String state) {
        this.numOfDrawers = drawers;
        this.numOfCabinets = cabinets;
        this.numOfShelves = shelves;
        this.color = color;
        this.material = material;
        this.stateOfDrawers = state;
    }
    
    
    // instance methods - get and set for each instance variable
    public int getDrawers() {
        return numOfDrawers;
    }
    
    public void setDrawers(int drawers) {
        numOfDrawers = drawers;
    }
    
    public int getCabinets() {
        return numOfCabinets;
    }
    
    public void setCabinets(int cabinets) {
        numOfCabinets = cabinets;
    }
    
    public int getShelves() {
        return numOfShelves;
    }
    
    public void setShelves(int shelves) {
        numOfShelves = shelves;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        color = color;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        material = material;
    }
    
    public String getDrawerState() {
        return stateOfDrawers;
    }
    
    public void setDrawerState(String state) {
        stateOfDrawers = state;
    }
}