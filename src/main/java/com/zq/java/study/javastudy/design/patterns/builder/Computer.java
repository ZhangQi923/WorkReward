package com.zq.java.study.javastudy.design.patterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: qi.zhang@mosi-tech.com
 * @Date: 2022/4/19 13:46
 */
public class Computer {

    private List<String> parts = new ArrayList<>();

    public void addParts(String part) {
        parts.add(part);
    }

    public void Show() {
        for (int i = 0; i < parts.size(); i++) {
            System.out.println(parts.get(i) + "装了");
        }
        System.out.println("电脑组装完成，请验收。");
    }
}
