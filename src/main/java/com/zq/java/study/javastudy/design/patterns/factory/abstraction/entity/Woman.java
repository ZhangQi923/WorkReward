package com.zq.java.study.javastudy.design.patterns.factory.abstraction.entity;

import com.zq.java.study.javastudy.design.patterns.factory.base.Human;

/**
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/15 15:51
 */
public abstract class Woman extends Human {

    public void printGender() {
        System.out.print("女人");
    }
}
