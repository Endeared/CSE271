public class CarTester {
    public static void main(String[] args){
         Car car = new Car(50);
         car.addGas(20);
         car.drive(100);
         System.out.println(car.getGasLevel());
    }
 }