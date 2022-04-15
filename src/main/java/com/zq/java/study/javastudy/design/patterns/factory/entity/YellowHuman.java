package com.zq.java.study.javastudy.design.patterns.factory.entity;

import com.zq.java.study.javastudy.design.patterns.factory.base.Human;
import com.zq.java.study.javastudy.design.patterns.factory.enums.HumanSpeciesEnum;

/**
 * 黄种人
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/15 14:14
 */
public class YellowHuman extends Human {

    public YellowHuman() {
        this.species = HumanSpeciesEnum.YELLOW;
    }

    @Override
    public void printColor() {
        System.out.println("黄种人");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话了！");
    }
}
