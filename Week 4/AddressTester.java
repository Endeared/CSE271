public class AddressTester {

   public static void main(String[] args) {

       Class referenceVariable = new Instance
       Address thisAddress = new Address(5781, "West Elkton Road", "Somerville", "Ohio", "45064");
       thisAddress.print();
       
       Address newAddress = new Address(5787, "West Elkton Road", "Somerville", "Ohio", "45064");
       System.out.println(thisAddress.comesBefore(newAddress));
   }
  
}



