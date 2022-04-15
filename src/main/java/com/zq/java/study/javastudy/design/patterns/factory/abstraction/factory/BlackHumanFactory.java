package com.zq.java.study.javastudy.design.patterns.factory.abstraction.factory;

import com.zq.java.study.javastudy.design.patterns.factory.abstraction.AbstractHumanFactory;
import com.zq.java.study.javastudy.design.patterns.factory.abstraction.entity.BlackMan;
import com.zq.java.study.javastudy.design.patterns.factory.abstraction.entity.BlackWoman;

/**
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/15 16:01
 */
public class BlackHumanFactory extends AbstractHumanFactory {

    @Override
    public BlackMan createMan() {
        return new BlackMan();
    }

    @Override
    public BlackWoman createWoMan() {
        return new BlackWoman();
    }
}
