package Dresser;

public class Dresser {

  private int shelves;
  private int cabnets;
  private int drawers;
  private String material;
  private String color;
  private String state;


 public Dresser(int shelves, int cabnets, int drawers, String material, String color, String state){
    this.shelves = shelves;
    this.cabnets = cabnets;
    this.drawers = drawers;
    this.material = material;
    this.color = color;
    this.state = state;
  }

  
/**
 * @return shelves 
 */
  public int getShelves(){

    return shelves;

  }


  /**
   * 
   * @param shelves
   */
  public void setShelves(int shelves){
    this.shelves = shelves;
  }

  /**
   * 
   * @return
   */
  public int getCabnets(){

    return cabnets;

  }

  public void setCabnets(int cabnets){
    this.cabnets = cabnets;
 
  }
  
  public int getDrawers(){

    return drawers;

  }

  public void setDrawers(int drawers){
    this.drawers = drawers;
 
  }

  public String getMaterial(){

    return material;

  }

  public void setMaterial(String material){
    this.material = material;
 
  }


  public String getColor(){

    return color;

  }

  public void setColor(String color){
    this.color = color;
 
  }
  public String getState(){
    return state;
  }
    public String setState(){
    return state;
  }

  public void setShelveState(String state){
    this.state = state;
  }

  // public void setShelveState(String state){
  //   this.state = state;
  // }
  //   public String getCabnetState(){
  //   return state;
  // }

  // public void setCabnetState(String state){
  //   this.state = state;
  // }
  //   public String getDrawerState(){
  //   return state;
  // }

  // public void setDrawerState(String state){
  //   this.state = state;
  // }

}
