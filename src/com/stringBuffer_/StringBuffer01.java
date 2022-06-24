package com.stringBuffer_;

/**
 * @author herman
 * @version 1.0
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        //String -> StringBuffer
        String s = "hello world";
        //方式一,使用构造器
        StringBuffer stringBuffer1 = new StringBuffer(s);
        //方式二,使用append
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(s);

        //StringBuffer -> String
        //使用toString
        String s2 = stringBuffer2.toString();
        //使用构造器
        String s3 = new String(stringBuffer2);
    }
}
