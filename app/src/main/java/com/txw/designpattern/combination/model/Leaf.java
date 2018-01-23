package com.txw.designpattern.combination.model;

/**
 * 具体叶子节点
 * Created by txw on 2018/1/23.
 */
public class Leaf extends Combination {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
    }

}
