package com.zq.java.study.javastudy.design.patterns.singleton.lazy;

public class LazySingletonTest {

    public static void main(String[] args) {

        // 单线程
//        LazySingleton instance1 = LazySingleton.getInstance();
//        LazySingleton instance2 = LazySingleton.getInstance();
//        System.out.println(instance1 == instance2);

        // 多线程 不安全 概率出现不同的实例
        new Thread(() -> {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }).start();

        new Thread(() -> {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }).start();
    }
}

class LazySingleton{

    // 私有静态属性
    // volatile防止重排序
//    private static LazySingleton instance;
    private volatile static LazySingleton instance;

    // 私有构造函数 避免从外部创造实例
    private LazySingleton() {
    }

    // 对外创建实例的方法 加锁则可避免两次创建
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                    // 字节码
                    // JIT(Just In Time)即时编译器  CPU  指令排序
                    // 1. 在堆空间分配一个小空间
                    // 2. 初始化
                    // 3. 引用赋值
                }
            }
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            instance = new LazySingleton();
//
//        }

        }
        return instance;
    }
}
