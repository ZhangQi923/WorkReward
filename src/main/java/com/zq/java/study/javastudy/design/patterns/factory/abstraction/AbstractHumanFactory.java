package com.zq.java.study.javastudy.design.patterns.factory.abstraction;

import com.zq.java.study.javastudy.design.patterns.factory.abstraction.entity.Man;
import com.zq.java.study.javastudy.design.patterns.factory.abstraction.entity.Woman;

/**
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/15 15:31
 */
public abstract class AbstractHumanFactory {

    public abstract Man createMan();


    public abstract Woman createWoMan();

}
