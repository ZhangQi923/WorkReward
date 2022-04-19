package com.zq.java.study.javastudy.design.patterns.builder;

/**
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/19 13:42
 */
public abstract class ComputerBuilder {

    /**
     * 建造cpu
     */
    public abstract void buildCpu();

    /**
     * 建造主板
     */
    public abstract void buildMainBoard();

    /**
     * 建造硬盘
     */
    public abstract void buildeHardDisk();

    /**
     * 建造显卡
     */
    public abstract void buildGraphicCard();

    /**
     * 建造机箱
     */
    public abstract void buildComputerBox();

    /**
     * 组装电脑
     * @return
     */
    public abstract Computer assembleComputer();

}
