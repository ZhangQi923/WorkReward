package com.zq.java.study.javastudy.design.patterns.factory.entity;

import com.zq.java.study.javastudy.design.patterns.factory.base.Human;
import com.zq.java.study.javastudy.design.patterns.factory.enums.HumanSpeciesEnum;

/**
 * 黑种人
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/15 14:13
 */
public class BlackHuman extends Human {

    public BlackHuman() {
        this.species = HumanSpeciesEnum.BLACK;
    }

    @Override
    public void printColor() {
        System.out.println("黑种人");
    }

    @Override
    public void talk() {
        System.out.println("黑种人说话了！");
    }
}
