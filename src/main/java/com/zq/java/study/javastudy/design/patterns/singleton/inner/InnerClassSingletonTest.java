package com.zq.java.study.javastudy.design.patterns.singleton.inner;

public class InnerClassSingletonTest {

    public static void main(String[] args) {
        // 单线程
//        InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
//        InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
//        System.out.println(instance1 == instance2);

        // 多线程 安全
        new Thread(() -> {
            InnerClassSingleton instance = InnerClassSingleton.getInstance();
            System.out.println(instance);
        }).start();

        new Thread(() -> {
            InnerClassSingleton instance = InnerClassSingleton.getInstance();
            System.out.println(instance);
        }).start();
    }
}

// 单例 静态内部类懒加载
class InnerClassSingleton{

    // 静态内部类是在调用getInstance() 使用静态内部类的属性时才加载
    private static class InnerClassHolder{
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.instance;
    }
}
