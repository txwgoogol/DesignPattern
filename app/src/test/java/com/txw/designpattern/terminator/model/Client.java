package com.txw.designpattern.terminator.model;

import org.junit.Test;

import top.txwgoogol.designpattern.terminator.model.ConcreteColleagueA;
import top.txwgoogol.designpattern.terminator.model.ConcreteColleagueB;
import top.txwgoogol.designpattern.terminator.model.ConcreteMediator;

/**
 * 中介者模型测试类
 * Created by txwgoogol on 2018/1/12.
 */
public class Client {

    @Test
    public void main() {
        ConcreteMediator concreteMediator = new ConcreteMediator();

        ConcreteColleagueA concreteColleagueA = new ConcreteColleagueA(concreteMediator);
        ConcreteColleagueB concreteColleagueB = new ConcreteColleagueB(concreteMediator);

        concreteMediator.setColleagueA(concreteColleagueA);
        concreteMediator.setColleagueB(concreteColleagueB);

        concreteMediator.method();
    }

}
