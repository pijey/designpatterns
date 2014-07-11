package com.pijey.designpatterns.strategy.behaviour.impl.quack;

import com.pijey.designpatterns.strategy.behaviour.QuackBehaviour;

/**
 * Created by A187838 on 11/07/2014.
 */
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
