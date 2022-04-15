package com.zq.java.study.javastudy.design.patterns.singleton.lazy;

public class VolatileTest extends Thread{
    boolean flag = false;
    int i = 0;
    int j = 0;

    public void run() {
        while (!flag) {
            i++;
//            System.out.println(i);
            j++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileTest vt = new VolatileTest();
        vt.start();
        Thread.sleep(2000);
        vt.flag = true;
        System.out.println("stope" + vt.i);
    }
}
