package com.pijey.designpatterns.strategy;

import com.pijey.designpatterns.strategy.behaviour.impl.fly.DoNotFly;
import com.pijey.designpatterns.strategy.behaviour.impl.quack.Quack;

/**
 * Created by A187838 on 11/07/2014.
 */
public class DuckPrototype extends Duck {
    public DuckPrototype(){
        quackBehaviour = new Quack();
        flyBehaviour = new DoNotFly();
    }

    public void display(){
        System.out.println("I'm a duck prototype");
    }
}
