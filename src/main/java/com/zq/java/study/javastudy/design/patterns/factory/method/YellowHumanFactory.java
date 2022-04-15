package com.zq.java.study.javastudy.design.patterns.factory.method;

import com.zq.java.study.javastudy.design.patterns.factory.entity.YellowHuman;

/**
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/15 15:33
 */
public class YellowHumanFactory extends AbstractHumanFactory{

    @Override
    public YellowHuman createHuman() {
        return new YellowHuman();
    }
}
