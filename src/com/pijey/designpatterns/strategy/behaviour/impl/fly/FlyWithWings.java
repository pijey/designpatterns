package com.pijey.designpatterns.strategy.behaviour.impl.fly;

import com.pijey.designpatterns.strategy.behaviour.FlyBehaviour;

/**
 * Created by A187838 on 11/07/2014.
 */
public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying !");
    }
}
