package com;

public class Inner {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.useInner02();
    }
}

class Outer01 {
    private int age = 10;
    String name = "张三";

    //成员内部类
    class Inner02{
        public void say(){
            System.out.println("age = "+ age +", name = "+ name);
        }
    }

    //使用成员内部类
    public void useInner02(){
        Inner02 inner02 = new Inner02();
        inner02.say();
    }
}