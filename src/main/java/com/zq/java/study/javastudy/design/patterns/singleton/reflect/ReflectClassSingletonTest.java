package com.zq.java.study.javastudy.design.patterns.singleton.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectClassSingletonTest {

    // 反射攻击
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取构造函数
        Constructor<ReflectClassSingleton> declaredConstructor = ReflectClassSingleton.class.getDeclaredConstructor();

        // 设置访问权
        declaredConstructor.setAccessible(true);

        // 通过反射获取的实例
        ReflectClassSingleton reflectClassSingleton = declaredConstructor.newInstance();

        // 通过静态内部类获取的实例
        ReflectClassSingleton instance = ReflectClassSingleton.getInstance();

        System.out.println(reflectClassSingleton == instance);

    }
}

class ReflectClassSingleton{

    private static class ReflectInnerSingleton{

        static {
            System.out.println("进来");
        }

        private static ReflectClassSingleton instance = new ReflectClassSingleton();
    }

    private ReflectClassSingleton() {
        System.out.println("开始");
        // 防止反射攻击 只适用于饿汉模式和静态内部类的单例
        if(ReflectInnerSingleton.instance != null) {
            throw new RuntimeException("单例不允许多个实例");
        }
    }

    public static ReflectClassSingleton getInstance(){
        return ReflectInnerSingleton.instance;
    }
}
