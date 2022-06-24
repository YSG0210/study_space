package com.stringBuffer_;

/**
 * @author herman
 * @version 1.0
 */
public class StringBufferWork {
    public static void main(String[] args) {
        String price = "2245212353.23";
        StringBuffer stringBuffer = new StringBuffer(price);

        //int i = stringBuffer.lastIndexOf(".");
        //stringBuffer.insert(i- 3,",");
       // System.out.println(stringBuffer);

        for (int i = stringBuffer.lastIndexOf(".") - 3; i > 0; i -= 3 ){
             stringBuffer = stringBuffer.insert(i,",");
        }
        System.out.println(stringBuffer);

    }
}
