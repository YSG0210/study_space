package com.reflex_;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author herman
 * @version 1.0
 */
public class CatTest {
    public static void main(String[] args) throws Exception {
        //通过反射调用配置文件，从而调用Cat方法
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\tt.properties"));
        String classFullPath = properties.get("classFullPath").toString();
        String method = properties.get("method").toString();

        //1. 加载类，返回Class类型的对象
        Class aClass = Class.forName(classFullPath);
        System.out.println("class类型对象："+aClass);
        //2. 通过加载的类得到实例对象
        Object o = aClass.newInstance();

        //3. 通过加载的类得到该类的方法
        Method method1 = aClass.getMethod(method);

        //4. 通过method1 调用方法   反射机制：方法.invoke(对象)
        method1.invoke(o);

        //System.out.println(invoke);
    }
}
