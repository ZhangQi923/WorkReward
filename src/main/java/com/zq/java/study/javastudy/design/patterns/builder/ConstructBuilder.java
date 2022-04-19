package com.zq.java.study.javastudy.design.patterns.builder;

/**
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/19 13:52
 */
public class ConstructBuilder extends ComputerBuilder{

    Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.addParts("CPU");
    }

    @Override
    public void buildMainBoard() {
        computer.addParts("主板");
    }

    @Override
    public void buildeHardDisk() {
        computer.addParts("硬盘");
    }

    @Override
    public void buildGraphicCard() {
        computer.addParts("显卡");
    }

    @Override
    public void buildComputerBox() {
        computer.addParts("机箱");
    }

    @Override
    public Computer assembleComputer() {
        return computer;
    }
}
