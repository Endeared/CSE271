import java.util.TreeSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class MockExamThree {

   public static void main(String[] args) {
         int[] arr1 = new int[] {1, 4, 9, 16, 9, 7, 4, 9, 11};
         int[] arr2 = new int[] {11, 11, 7, 9, 16, 4, 1};
         int[] arr3 = new int[] {1, 2, 3, 4, 5};
         
         LinkedList<String> employees = new LinkedList<String>();
         employees.add("John");
         employees.add("Jane");
         employees.add("Richard");
         employees.add("Bob");
         employees.add("Barbara");
         employees.add("Chuck");
         employees.add("Pete");
         
         System.out.println(sameSet(arr1, arr2)); // should be true
         System.out.println(sameSet(arr1, arr3)); // should be false
         System.out.println(sameSet(arr2, arr3)); // should be false
         
         System.out.println();
         System.out.println("=== DOWNSIZE TESTING ===");
         for (String employee : employees) {
            System.out.println(employee);
         }
         
         downsize(employees, 2);
         System.out.println();
         System.out.println("=== DOWNSIZE TESTING: AFTER ===");
         for (String employee : employees) {
            System.out.println(employee);
         }
   }
   
   public static void downsize(LinkedList<String> employeeNames, int n) {
      ListIterator<String> iterator = employeeNames.listIterator();
      
      for (int i = 0; i < employeeNames.size(); i++) {
         iterator.next();
         if (i % n == 0) {
            iterator.remove();
         }
      }
   }
   
   public static boolean sameSet(int[] a, int[] b) {
      TreeSet<Integer> setA = new TreeSet<>();
      TreeSet<Integer> setB = new TreeSet<>();
      
      for (int num : a) {
         setA.add(num);
      }
      
      for (int num : b) {
         setB.add(num);
      }
      
      boolean result = setA.equals(setB);
      return result;
   }

}

// Write a method
// public static void downsize(LinkedList<String> employeeNames, int n)
// that removes every nth employee from a linked list.

// Write a method
// public static boolean sameSet(int[] a, int[] b)
// that checks whether two arrays have the same elements in some order, ignoring
// duplicates. For example, the two arrays
// 1 4 9 16 9 7 4 9 11
// and
// 11 11 7 9 16 4 1
// would be considered identical.