package com.zq.java.study.javastudy.design.patterns.builder;

/**
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/19 13:55
 */
public class CustomerClient {

    public static void main(String[] args) {

        // 小明找到一位电脑城老板
        Director director = new Director();

        // 并找到该店的组装工程师
        ConstructBuilder constructBuilder = new ConstructBuilder();

        // 描述需求后，老板让工程师去组装电脑
        // 简易版
        director.SimpleConstruct(constructBuilder);
//        // 普通版
//        director.commonConstruct(constructBuilder);
//        // 升级版
//        director.superConstruct(constructBuilder);

        // 工程师组装好电脑
        Computer computer = constructBuilder.assembleComputer();

        // 向客户展示组装好的电脑
        computer.Show();
    }
}
