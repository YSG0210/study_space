package com.work01;

/**
 * @author herman
 * @version 1.0
 */

public class Frock {

    private int serialNumber;
    private static int currentNum = 100077;

    public Frock(){
        this.serialNumber = this.getNextNum();
    }

    public static int getNextNum(){
        return currentNum += 100;
    }


    public int getSerialNumber() {
        return serialNumber;
    }


}
