package com.reflex_;

/**
 * @author herman
 * @version 1.0
 */
public class ReflexTest {
    public static void main(String[] args) throws ClassNotFoundException {
        String classFullPath = "com.reflex_.Cat";

        //1。已知一个类的全类名
        Class<?> aClass = Class.forName(classFullPath);
        System.out.println(aClass);

        //2。已知具体的类名
        Class<Cat> catClass = Cat.class;
        System.out.println(catClass);

        //3。已知某个类的实例
        Cat cat = new Cat();
        Class aClass1 = cat.getClass();
        System.out.println(aClass1);

        //4。通过类加载器
        ClassLoader classLoader = cat.getClass().getClassLoader();
        Class<?> aClass2 = classLoader.loadClass(classFullPath);
        System.out.println(aClass2);

        //基本数据类型获取class
        Class<Integer> integerClass = int.class;
        System.out.println(integerClass);

        //包装类获取class
        Class<Boolean> type = Boolean.TYPE;
        System.out.println(type);

    }
}
