package com.work01;

/**
 * @author herman
 * @version 1.0
 */
public class FrockTest {
    public static void main(String[] args) {

        Frock frock1 = new Frock();
        System.out.println("frock1 = " + frock1.getSerialNumber());
        Frock frock2 = new Frock();
        System.out.println("frock2 = " + frock2.getSerialNumber());
        Frock frock3 = new Frock();
        System.out.println("frock3 = " + frock3.getSerialNumber());
        System.out.println("测试合并分支");
        System.out.println("master test");
        System.out.println("dev commit2");
        System.out.println("push test");
    }
}
