package com.zq.java.study.javastudy.design.patterns.singleton.serialize;

import java.io.*;

public class SerializeSingletonTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SerializeSingleton instance = SerializeSingleton.getInstance();
        System.out.println();

        // 序列化
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("testSerializable"));
//        oos.writeObject(instance);
//        oos.close();

        // 反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("testSerializable"));
        SerializeSingleton serializeSingleton = (SerializeSingleton) ois.readObject();
        ois.close();

        System.out.println(instance == serializeSingleton);


    }
}


class SerializeSingleton implements Serializable {

    static final long serialVersionUID = 43L;

    private static class SerializeInnerSingleton{
        private static SerializeSingleton instance = new SerializeSingleton();
    }

    private SerializeSingleton() {

        if (SerializeInnerSingleton.instance != null) {
            throw new RuntimeException(" 单例不允许多个实例 ");
        }
    }

    public static SerializeSingleton getInstance(){
        return SerializeInnerSingleton.instance;
    }

    Object readResolve() throws ObjectStreamException {
        return SerializeInnerSingleton.instance;
    }

}
