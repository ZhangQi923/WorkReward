package com.zq.java.study.javastudy.design.patterns.singleton.enums;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;

public class EnumSingletonTest{

    public static void main(String[] args)
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
//        EnumSingleton instance1 = EnumSingleton.INSTANCE;
//        EnumSingleton instance2 = EnumSingleton.INSTANCE;
//        System.out.println(instance1 == instance2);


//        // 不能够反射攻击且线程安全
//        Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
//        declaredConstructor.setAccessible(true);
//        EnumSingleton instance = declaredConstructor.newInstance("INSTANCE", 0);



        EnumSingleton instance = EnumSingleton.INSTANCE;
        System.out.println(instance);

        // 序列化
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("testSerializable6"));
//        oos.writeObject(instance);
//        oos.close();

        // 反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("testSerializable6"));
        EnumSingleton serializeSingleton = (EnumSingleton) ois.readObject();
        ois.close();

        System.out.println(instance == serializeSingleton);

    }
}

enum EnumSingleton {

    INSTANCE;

    public void print(){
        System.out.println(this.hashCode());
    }
}