package com.lec.spring.aop03;


import com.lec.spring.beans.ServiceEx;

public class MyService31 extends ServiceEx {

    @Override
    public void doWorking() {
        printInfo();
    }

    @Override
    public void quitAction() {
        printInfo();
    }

    @Override
    public void doAction() {
        printInfo();
    }
}
