package com;

import java.util.Objects;

public class Dynamic {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床啦");
            }
        });

        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴起床啦");
            }
        });
    }
}
/*
* 1. 有一个接口Bell，里面有个ring方法
* 2. 有一个手机类CellPhone，具有闹钟功能alarmClock，参数是Bell类型
* 3. 测试手机类的闹钟功能，通过匿名内部类（对象）作为参数，打印：懒猪起床啦，
*    再传入另一个匿名内部类，打印：小伙伴上课啦
* */

interface Bell{
    void ring();
}

class CellPhone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
}


class Outer{  //外部类
    private int a = 10;

    public Outer(){

    }
    public void method01(){
        System.out.println("method01()");
    }
    public void method02(){
        final class Inner{ //成员内部类,可用final修饰，不能被继承
            private int a = 800; //与外部类属性同名
            public void f1(){
                //如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果访问外部类的成员，则可以使用（外部类名.this.成员）去访问。
                System.out.println("（内部类属性）a = " + a + "\n" + "（外部类属性）a = " + Outer.this.a);
                method01(); //访问外部类方法
            }
        }
        //外部类访问局部内部类的成员   访问方式：创建对象，再访问，注意：必须在作用域内
        Inner inner = new Inner();
        inner.f1();
    }
}
