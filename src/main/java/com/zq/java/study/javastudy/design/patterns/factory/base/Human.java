package com.zq.java.study.javastudy.design.patterns.factory.base;

import com.zq.java.study.javastudy.design.patterns.factory.enums.HumanSpeciesEnum;

/**
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/15 14:12
 */
public abstract class Human {


    protected HumanSpeciesEnum species;

    /**
     * 上色
     */
    public abstract void printColor();

    /**
     * 说话
     */
    public abstract void talk();

}
