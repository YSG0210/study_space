package com.stringBuffer_;

/**
 * @author herman
 * @version 1.0
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        //1. append 追加
        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append(",world");
        stringBuffer.append("荒天帝");
        System.out.println(stringBuffer);//hello,world荒天帝

        //2. 删 delete(start,end) 包前不包后
        //stringBuffer.delete(6,11);
        System.out.println(stringBuffer);//hello,荒天帝

        //3. 改 replace(start, end, string)
        stringBuffer.replace(6,11,"熊孩子");
        System.out.println(stringBuffer); //hello,熊孩子荒天帝

        //4. 查， 查找字串在字符串中第一次出现的位置,找不到返回-1
        int i = stringBuffer.indexOf("熊孩子");
        System.out.println(i); //6

        //5. 插，insert
        stringBuffer.insert(12,"终成仙帝");
        System.out.println(stringBuffer); //hello,熊孩子荒天帝终成仙帝

        //6. 长度，length
        System.out.println(stringBuffer.length()); //16
    }
}
