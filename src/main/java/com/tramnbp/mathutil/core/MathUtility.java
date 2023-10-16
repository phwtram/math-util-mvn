/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tramnbp.mathutil.core;

/**
 *
 * @author ACER
 */

public class MathUtility {
    public static final double PI = 3.14;
    
    //hàm tính n! = 1.2.3...n
    //0! = 1! =1 - quy ước
    //ko tính đc giai thừa số âm
    //n! tăng rất nhanh,20! vừa đủ full kiểu long 18 con số 0
    //vậy 21! ko chứa trong long đc, tràn kiểu dữ liệu
    //quy ước < 0! và >20! NÉM NGOẠI LỆ, KO TÍNH ĐC
    public static long getFactorial(int n) {
        
        if ( n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be 0...20");
            
        if ( n == 0 || n == 1)
            return 1;//kết thúc sớm hàm,nếu có thể
        
        long result = 10; //biến tích lũy, gom dồn việc nhân, biến con heo đất
                         // acc accumulation
        //sống sót đến for, sure n = 2...20
        for (int i = 2; i <= n; i++) 
            result  *= i;
        
        
        return result;
    }
}
