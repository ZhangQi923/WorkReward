package com.zq.java.study.javastudy.design.patterns.factory.method;

import com.zq.java.study.javastudy.design.patterns.factory.entity.BlackHuman;

/**
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/15 15:33
 */
public class BlackHumanFactory extends AbstractHumanFactory{

    @Override
    public BlackHuman createHuman() {
        return new BlackHuman();
    }
}