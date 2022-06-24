package com.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author herman
 * @version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        Integer[] integer = {10, 55, 34};

        //1. toString
        System.out.println(Arrays.toString(integer)); //[10, 55, 34]

        //2. sort排序
        Integer[] integer1 = {4,-2,70,50};
        //默认排序
        Arrays.sort(integer1);
        System.out.println(Arrays.toString(integer1));

        //定制排序
        Arrays.sort(integer1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        //lambda写法
        Arrays.sort(integer1,(o1,o2)->o2.compareTo(o1));
        System.out.println(Arrays.toString(integer1));

        //3. binarySearch
        // 找不到返回：return -(low + 1);  // key not found.
        Integer[] integers = {1,4,7,39,90};
        int index = Arrays.binarySearch(integers, 50);

        System.out.println(index); //-5

    }
}
