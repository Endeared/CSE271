/* A recursive example, although this is not 
 * typically a problem that should be solved via recursion.
 */
 

public class Recursion {
 
 public static void main(String[] args) {
   printTriangle(3);
 }
 public static void printTriangle(int len){
     System.out.println("Called printTriangle("+len+")");
     if(len==0)
      return;
     printTriangle(len-1);
     for(int i=0;i<len;i++){
         System.out.print("[]");
     }
     System.out.println();
 }

}
//printTriangle(3)--
//  printTriangle(2)---
//   printTriangle(1)----
//    printTriangle(0)-----Return
//    