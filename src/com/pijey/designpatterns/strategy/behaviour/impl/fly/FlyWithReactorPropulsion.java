package com.pijey.designpatterns.strategy.behaviour.impl.fly;

import com.pijey.designpatterns.strategy.behaviour.FlyBehaviour;

/**
 * Created by A187838 on 11/07/2014.
 */
public class FlyWithReactorPropulsion implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with a reactor !");
    }
}
