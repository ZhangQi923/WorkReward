package com.zq.java.study.javastudy.design.patterns.factory.entity;

import com.zq.java.study.javastudy.design.patterns.factory.base.Human;
import com.zq.java.study.javastudy.design.patterns.factory.enums.HumanSpeciesEnum;

/**
 * 白种人
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/15 14:13
 */
public class WhiteHuman extends Human {

    public WhiteHuman() {
        this.species = HumanSpeciesEnum.WHITE;
    }

    @Override
    public void printColor() {
        System.out.println("白种人");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话了！");
    }
}
