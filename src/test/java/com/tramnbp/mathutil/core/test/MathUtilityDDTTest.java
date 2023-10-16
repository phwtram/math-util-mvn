/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tramnbp.mathutil.core.test;

import com.tramnbp.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ACER
 */
public class MathUtilityDDTTest {
    public static Object[][] innitData() {
        Object[][] dataSet = {{0, 1},
                              {1, 1},
                              {2, 2},
                              {3, 6},
                              {5,120}
                             };
        
        return dataSet;
    }
    //hàm xài data từ nơi khác đưa đến, mảng data đưa vào
    @ParameterizedTest
    @MethodSource("innitData")
    
  public void verifyFactorialGivenRightArgumentReturnOk(int n, long expected) {
      assertEquals(expected, MathUtility.getFactorial(n));
  }
}
