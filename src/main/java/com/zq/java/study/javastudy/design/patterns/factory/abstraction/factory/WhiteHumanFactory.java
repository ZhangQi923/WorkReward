package com.zq.java.study.javastudy.design.patterns.factory.abstraction.factory;

import com.zq.java.study.javastudy.design.patterns.factory.abstraction.AbstractHumanFactory;
import com.zq.java.study.javastudy.design.patterns.factory.abstraction.entity.WhiteMan;
import com.zq.java.study.javastudy.design.patterns.factory.abstraction.entity.WhiteWoman;

/**
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/15 16:01
 */
public class WhiteHumanFactory extends AbstractHumanFactory {

    @Override
    public WhiteMan createMan() {
        return new WhiteMan();
    }

    @Override
    public WhiteWoman createWoMan() {
        return new WhiteWoman();
    }
}
