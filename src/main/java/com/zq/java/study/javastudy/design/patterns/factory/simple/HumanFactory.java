package com.zq.java.study.javastudy.design.patterns.factory.simple;

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
        if (HumanSpeciesEnum.BLACK.equals(species)) {
            return new BlackHuman();
        } else if (HumanSpeciesEnum.WHITE.equals(species)) {
            return new WhiteHuman();
        } else if (HumanSpeciesEnum.YELLOW.equals(species)) {
            return new YellowHuman();
        } else {
            return null;
        }
    }
}
