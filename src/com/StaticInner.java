package com;

public class StaticInner {
    public static void main(String[] args) {
        new StaticInner01.StaticInner02().f();
    }
}

class StaticInner01{
    private int age = 10;
    private static String name = "张三";

    //静态成员内部类
    public static class StaticInner02{
        public void f(){
            //可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员
           // System.out.println(age); //报错
            System.out.println(name);
        }
    }

}