package com.lambda_;

/**
 * @author herman
 * @version 1.0
 */
public class EatableDemo {
    /**
     * 定义一个测试类(EatableDemo)，在测试类中提供两个方法
     * ①、一个方法是：useEatable(Eatable e)
     * ②、一个方法是主方法，在主方法中调用useEatable方法
     */
    public static void main(String[] args) {
        //1. 通过实现类方法
        Eatable eatable = new EatableImpl();
        useEatable(eatable);

        //2. 匿名接口类方法
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("匿名类改进");
            }
        });

        //3. lambda改进
        useEatable(() -> System.out.println("lambda改进"));
    }

    private static void useEatable(Eatable eatable){
        eatable.eat();
    }

}

class EatableImpl implements Eatable{

    @Override
    public void eat() {
        System.out.println("无返回值测试");
    }
}