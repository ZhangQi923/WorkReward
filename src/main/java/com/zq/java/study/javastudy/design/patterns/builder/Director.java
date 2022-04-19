package com.zq.java.study.javastudy.design.patterns.builder;

/**
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/18 15:54
 */
public class Director {

    /**
     * 极简版
     * @param computerBuilder
     */
    public void SimpleConstruct(ComputerBuilder computerBuilder) {
        computerBuilder.buildCpu();
        computerBuilder.buildMainBoard();
        computerBuilder.buildeHardDisk();
    }

    /**
     * 普通版
     * @param computerBuilder
     */
    public void commonConstruct(ComputerBuilder computerBuilder) {
        computerBuilder.buildCpu();
        computerBuilder.buildMainBoard();
        computerBuilder.buildeHardDisk();
        computerBuilder.buildComputerBox();
    }

    /**
     * 高配版
     * @param computerBuilder
     */
    public void superConstruct(ComputerBuilder computerBuilder) {
        computerBuilder.buildCpu();
        computerBuilder.buildMainBoard();
        computerBuilder.buildeHardDisk();
        computerBuilder.buildComputerBox();
    }
}
