public class Door 
{
   // instance vars
   private String state;
   private String name;
   
   // constructor
   public Door(String initName, String initState)
   {
      name = initName;
      state = initState; 
   }
   
   // instance methods
   public String getState(){
      return state;
   }
   
   public void setState(String newState){
      state = newState;
   }
   
   public String getName(){
      return name;
   }
   
   public void setName(String newName){
      name = newName;
   }
   
   public void open()
   {
      state = "open";
   }

   public void close()
   {
      state = "closed"; 
   }
}
