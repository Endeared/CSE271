public class DoorTester {
    public static void main(String[] args){
         Door door1 = new Door("front", "closed");
         System.out.println("Name is: " + door1.getName());
         System.out.println("State is: " + door1.getState());
         door1.setState("open");
         System.out.println("New state is: " + door1.getState());
    }
 }