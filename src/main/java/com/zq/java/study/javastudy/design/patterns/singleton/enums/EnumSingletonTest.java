package com.zq.java.study.javastudy.design.patterns.singleton.enums;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumSingletonTest{

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println(instance1 == instance2);


        // 不能够反射攻击且线程安全
//        Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
//        declaredConstructor.setAccessible(true);
//        EnumSingleton instance = declaredConstructor.newInstance("INSTANCE", 0);

    }
}

enum EnumSingleton {

    INSTANCE;

    public void print(){
        System.out.println(this.hashCode());
    }
}