package com.zq.java.study.javastudy.design.patterns.factory.abstraction.factory;

import com.zq.java.study.javastudy.design.patterns.factory.abstraction.AbstractHumanFactory;
import com.zq.java.study.javastudy.design.patterns.factory.abstraction.entity.YellowMan;
import com.zq.java.study.javastudy.design.patterns.factory.abstraction.entity.YellowWoman;

/**
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/15 16:01
 */
public class YellowHumanFactory extends AbstractHumanFactory {

    @Override
    public YellowMan createMan() {
        return new YellowMan();
    }

    @Override
    public YellowWoman createWoMan() {
        return new YellowWoman();
    }
}
