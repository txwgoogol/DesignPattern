package com.txw.designpattern.appearance.model;

/**
 * Created by txw on 2018/2/5.
 */
public class PhoneImpl implements Phone {

    @Override
    public void dail() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断");
    }

}