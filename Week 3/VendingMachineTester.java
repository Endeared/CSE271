public class VendingMachineTester {

    public static void main(String[] args){
        VendingMachine machine = new VendingMachine(10, 0, 0);
        System.out.println("Machine currently has: " + machine.getNumberOfCans() + " cans.");
        System.out.println("Machine currently has: " + machine.getMoney() + " money.");
        
        machine.sellItem();
        System.out.println("Machine currently has: " + machine.getNumberOfCans() + " cans.");
        System.out.println("Machine currently has: " + machine.getMoney() + " money.");
        
        machine.restock();
        System.out.println("Machine currently has: " + machine.getNumberOfCans() + " cans.");
        System.out.println("Machine currently has: " + machine.getMoney() + " money.");
        
        machine.changeNumberOfCans(5);
        System.out.println("Machine currently has: " + machine.getNumberOfCans() + " cans.");
        System.out.println("Machine currently has: " + machine.getMoney() + " money.");
        
        machine.sellItem();
        System.out.println("Machine currently has: " + machine.getNumberOfCans() + " cans.");
        System.out.println("Machine currently has: " + machine.getMoney() + " money.");
    }
    
}