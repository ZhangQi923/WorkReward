package com.zq.java.study.javastudy.design.patterns.factory;

import com.zq.java.study.javastudy.design.patterns.factory.abstraction.entity.BlackMan;
import com.zq.java.study.javastudy.design.patterns.factory.abstraction.entity.BlackWoman;
import com.zq.java.study.javastudy.design.patterns.factory.abstraction.factory.BlackHumanFactory;
import com.zq.java.study.javastudy.design.patterns.factory.base.Human;
import com.zq.java.study.javastudy.design.patterns.factory.entity.BlackHuman;
import com.zq.java.study.javastudy.design.patterns.factory.entity.WhiteHuman;
import com.zq.java.study.javastudy.design.patterns.factory.entity.YellowHuman;
import com.zq.java.study.javastudy.design.patterns.factory.enums.HumanSpeciesEnum;
import com.zq.java.study.javastudy.design.patterns.factory.method.AbstractHumanFactory;
import com.zq.java.study.javastudy.design.patterns.factory.method.WhiteHumanFactory;
import com.zq.java.study.javastudy.design.patterns.factory.method.YellowHumanFactory;
import com.zq.java.study.javastudy.design.patterns.factory.simple.HumanFactory;
import java.util.Objects;

/**
 * 女娲
 *
 * 在介绍工厂模式之前，我们先来看一个女娲造人的神话故事。东汉《风俗通》记录了这样一则神话故事：
 * “开天辟地，未有人民，女娲搏黄土做人”，说的就是女娲造人的故事。女娲是如何造人的呢？
 * 过程大概是这样的：首先，女娲采集黄土捏成人的形状，然后放到八卦炉中烧制，最后放到大地上生长。
 * 由于女娲是第一次做人，经验不足，对火候的把控不准确，柴火放多了，火太旺，七七四十九天之后，
 * 造好拿出来一看，人都被烤黑了，于是，黑种人就诞生了；然后女娲开始少放柴火，小火慢炖，
 * 又过了七七四十九天，拿出来一看，人还没烤熟呢，于是，白种人就诞生了；最后，女娲有经验了，
 * 把控好火的大小，就这样又过了七七四十九天，打开八卦炉一看，嗯，这次就对了，于是黄种人就诞生了。
 *
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/15 14:10
 */
public class NvWa {

    public static void main(String[] args) {

        // 简单工厂模式
//        System.out.println("开始创造黑种人");
//        Human human = HumanFactory.createHuman(HumanSpeciesEnum.BLACK);
//        if (Objects.nonNull(human)){
//            human.printColor();
//            human.talk();
//        }
//        System.out.println("开始创造白种人");
//        human = HumanFactory.createHuman(HumanSpeciesEnum.WHITE);
//        if (Objects.nonNull(human)) {
//            human.printColor();
//            human.talk();
//        }
//        System.out.println("开始创造黄种人");
//        human = HumanFactory.createHuman(HumanSpeciesEnum.YELLOW);
//        if (Objects.nonNull(human)) {
//            human.printColor();
//            human.talk();
//        }

        // 工厂方法模式
//        System.out.println("开始创造黑种人");
//        BlackHumanFactory blackFactory = new BlackHumanFactory();
//        BlackHuman blackHuman = blackFactory.createHuman();
//        blackHuman.printColor();
//        blackHuman.talk();
//        System.out.println("开始创造白种人");
//        WhiteHumanFactory whiteFactory = new WhiteHumanFactory();
//        WhiteHuman whiteHuman = whiteFactory.createHuman();
//        whiteHuman.printColor();
//        whiteHuman.talk();
//        System.out.println("开始创造黄种人");
//        YellowHumanFactory yellowFactory = new YellowHumanFactory();
//        YellowHuman yellowHuman = yellowFactory.createHuman();
//        yellowHuman.printColor();
//        yellowHuman.talk();

        // 抽象工厂模式
        BlackHumanFactory blackHumanFactory = new BlackHumanFactory();
        BlackMan blackMan = blackHumanFactory.createMan();
        blackMan.printColor();
        blackMan.printGender();
        blackMan.talk();
        BlackWoman blackWoman = blackHumanFactory.createWoMan();
        blackWoman.printColor();
        blackWoman.printGender();
        blackWoman.talk();
    }

}
