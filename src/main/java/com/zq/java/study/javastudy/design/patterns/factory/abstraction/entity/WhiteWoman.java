package com.zq.java.study.javastudy.design.patterns.factory.abstraction.entity;

/**
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/15 15:57
 */
public class WhiteWoman extends Woman{

    @Override
    public void printColor() {
        System.out.print("白种 ");
    }

    @Override
    public void talk() {
        System.out.println(" 说话了");
    }
}
