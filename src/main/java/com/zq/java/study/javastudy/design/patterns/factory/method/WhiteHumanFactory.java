package com.zq.java.study.javastudy.design.patterns.factory.method;

import com.zq.java.study.javastudy.design.patterns.factory.entity.WhiteHuman;

/**
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/15 15:33
 */
public class WhiteHumanFactory extends AbstractHumanFactory{

    @Override
    public WhiteHuman createHuman() {
        return new WhiteHuman();
    }
}
