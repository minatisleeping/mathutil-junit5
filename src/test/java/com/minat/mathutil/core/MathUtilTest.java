/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.minat.mathutil.core;

import static com.minat.mathutil.core.MathUtil.*;
//- import static là dành riêng cho những hàm static
//tức là gọi hàm mà bỏ qua tên class 


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author minhnhat
 */

public class MathUtilTest {
    
    
    public static Object[][] initData() {
        return new Integer[][] {
                                  {1, 1},
                                  {2, 2},
                                  {5, 120},
                                  {7, 5040}
                               };
    }
    
    
    
    @ParameterizedTest
    @MethodSource(value = "initData")// tên hàm cung cấp data, ngầm định thứ tự 
                                    //của các phần tử mảng, map vào tham số hàm
    public void testGetFactorialGivenRightReturnWell(int input, long expected) {
        assertEquals(expected, getFactorial(input));
    }
 
    @Test
    public void testGetFactorialGivenWrongArgThrowException() {
        // xài biểu thức thứ 2 là 1 cái object/có code implement cái
        //functionnal interface tên la Exercutable - có 1 hàm duy nhất ko code
        //tên là execute()
        //chơi chậm
        
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };
                
//            Executable exObject = () -> getFactorial(-5);
                
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    } 
     
    
}
