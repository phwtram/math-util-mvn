/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tramnbp.mathutil.core.test;

import com.tramnbp.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ACER
 */
public class MathUtilityTest {
    
    //TEST CASE TEMPLATE/STRUCTURE
    //ID | DESCRIPTION | STEPS/PROCEDURES | EXPECTED RESULT | STATUS (PASS OR
    //FAILED)
    
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
//3 TEST CASE TRÊN KO ĐẸP BỐC MÙI, BAD SMELLS VÌ CHỈ KHÁC NHAU PHẦN DATA
//TRONG NGHỀ KIỂM THỬ CÓ 1 KĨ THUẬT ĐÓ LÀ TÁCH HẲN DATA KIỂM THỬ RA
//1 CHỖ , CHO DỄ NHÌN, DỄ QLI ĐC DATA THIẾU ĐỦ HAY KO

//SAU ĐÓ ĐƯA BỘ DATA NÀY VÀO TRONG CÂU LỆNH SO SÁNH ASSERT()
//QUA CÁC THAM SỐ (PARAMETER)
//TỨC LÀ ASSERTEUALS (EXPECTED,ACTUAL) LÀ 2 THAM SỐ
//ỨNG VỚI BỘ DATA ĐC TÁCH RA
//                      120     5!
//                      720     6!
//                      24      4!
//                      6       3!
//                      2       2!
//      .....
//          MẢNG [5][2] {0,1} {1,1} {2,2} {3,6} {5,120}
//CODE NHÌN GỌN, PHÁT HIỆN ĐC THIẾU ĐỦ TEST DATA, TEST CASE
//KĨ THUẬT TÁCH DATA KIỂM THỬ RA KHỎI CÂU LẸNH SO SÁNH -> ĐC GỌI LÀ DDT- 
//DATA DRIVEN TESTING - KIỂM THỬ THEO HƯỚNG TÁCH DATA RIÊNG RẼ