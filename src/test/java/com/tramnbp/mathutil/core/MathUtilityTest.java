/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tramnbp.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ACER
 */
public class MathUtilityTest {
    
    //TEST CASE TEMPLATE/STRUCTURE
    //ID | DESCRIPTION | STEPS/PROCEDURES | EXPECTED RESULT | STATUS (PASS OR FAILED)
    
    //Test case #1: Verify the getFactorial() function with n = 0
    //Steps/Procedures:
    //      1.Given n = 0
    //      2.Call/invoke getFactorial(int n)
    //Expected result
    //      The method getFactorial(n = 0) must return 1
    //          as the result of 0! == 1
    //Status: PASSED | FAILED ĐOÁN XEM KHI CHẠY APP/HÀM/METHOD
    
    
    
   @Test // dính dáng đến THUẬT NGỮ FRAMEWORK
   public void verifyFactorialGivenRightArgument0ReturnOk() {
        assertEquals(1, MathUtility.getFactorial(0));
   }
   
   //Test case #2
  @Test // dính dáng đến THUẬT NGỮ FRAMEWORK
   public void verifyFactorialGivenRightArgument1ReturnOk() {
        assertEquals(1, MathUtility.getFactorial(1));
   }
   //Test case #3
  @Test // dính dáng đến THUẬT NGỮ FRAMEWORK
   public void verifyFactorialGivenRightArgument6ReturnOk() {
        assertEquals(720, MathUtility.getFactorial(6));
   }
   
}