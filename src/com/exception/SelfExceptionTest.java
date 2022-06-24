package com.exception;

/**
 * @author herman
 * @version 1.0
 */

public class SelfExceptionTest {
    public static void main(String[] args) {
       //包装类(Integer) -> String
        Integer i1 = 100;
        //方式1
        String str1 = i1 + "";
        //方式2
        String str2 = String.valueOf(i1);
        //方式3
        String str3 = i1.toString();

       //String -> 包装类
        String st = "1234";
        Integer i2 = Integer.parseInt(st);
        Integer integer = new Integer(st);
    }
}
