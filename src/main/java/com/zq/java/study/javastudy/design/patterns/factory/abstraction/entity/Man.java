package com.zq.java.study.javastudy.design.patterns.factory.abstraction.entity;

import com.zq.java.study.javastudy.design.patterns.factory.base.Human;

/**
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/15 15:49
 */
public abstract class Man extends Human {


    public void printGender() {
        System.out.print("男人");
    }

}
