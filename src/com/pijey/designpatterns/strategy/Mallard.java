package com.pijey.designpatterns.strategy;

import com.pijey.designpatterns.strategy.behaviour.impl.fly.FlyWithWings;
import com.pijey.designpatterns.strategy.behaviour.impl.quack.Quack;

/**
 * Created by A187838 on 11/07/2014.
 */
public class Mallard extends Duck {
    public Mallard(){
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();
    }
}
