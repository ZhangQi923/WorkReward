package com.zq.java.study.javastudy.design.patterns.factory.simple;

import static com.zq.java.study.javastudy.design.patterns.factory.enums.HumanSpeciesEnum.BLACK;

import com.zq.java.study.javastudy.design.patterns.factory.base.Human;
import com.zq.java.study.javastudy.design.patterns.factory.entity.BlackHuman;
import com.zq.java.study.javastudy.design.patterns.factory.entity.WhiteHuman;
import com.zq.java.study.javastudy.design.patterns.factory.entity.YellowHuman;
import com.zq.java.study.javastudy.design.patterns.factory.enums.HumanSpeciesEnum;

/**
 * 八卦炉
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/15 14:11
 */
public class HumanFactory {
    public static Human createHuman(HumanSpeciesEnum species) {
        switch (species){
            case BLACK:
                return new BlackHuman();
            case WHITE:
                return new WhiteHuman();
            case YELLOW:
                return new YellowHuman();
            default:
                return null;
        }
    }
}
