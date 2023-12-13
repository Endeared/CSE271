/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 11/30/2023
 * CalculationTest class, which is a JUnit
 testing file used to test the methods in our Calculation
 class.
 *
**/

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class CalculationTest  {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** findMax test one with a simple array. **/
   @Test 
   public void findMaxTest() {
      Calculation calc = new Calculation();
      int[] array = new int[] {1, 2, 3, 4, 5};
      Assert.assertEquals(5, calc.findMax(array)); 
   }
   
   /** findMax test two with a more complex array. **/
   @Test
   public void findMaxTestTwo() {
      Calculation calc = new Calculation();
      int[] array = new int[] {322, 4, 26, 723, 999};
      Assert.assertEquals(999, calc.findMax(array)); 
   } 
   
   /** cube test one - more complex cube. **/
   @Test
   public void cubeTest() {
      Calculation calc = new Calculation();
      Assert.assertEquals(729, calc.cube(9)); 
   }
   
   /** cube test two - simple cube. **/
   @Test
   public void cubeTestTwo() {
      Calculation calc = new Calculation();
      Assert.assertEquals(8, calc.cube(2)); 
   }
   
   /** reverse test with a simple string. **/
   @Test
   public void reverseTest() {
      Calculation calc = new Calculation();
      Assert.assertEquals("!dlroW olleH", calc.reverse("Hello World!")); 
   }
   
   /** reverse test with a more complex string. **/
   @Test
   public void reverseTestTwo() {
      Calculation calc = new Calculation();
      Assert.assertEquals(".god yzal eht revo spmuj xof nworb kciuq ehT", calc.reverse("The quick brown fox jumps over the lazy dog.")); 
   }
   
}

