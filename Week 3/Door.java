public class Door 
{
   // instance vars
   private static String state;
   private static String name;
   
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
   
   public static String getDetails() {
      return state + ":" + name;
   }
}
