package com.pijey.designpatterns.strategy.main;

import com.pijey.designpatterns.strategy.Duck;
import com.pijey.designpatterns.strategy.DuckPrototype;
import com.pijey.designpatterns.strategy.Mallard;
import com.pijey.designpatterns.strategy.behaviour.impl.fly.FlyWithReactorPropulsion;

/**
 * Created by A187838 on 11/07/2014.
 */
public class MiniSimulator {
    public static void main(String[] args){
        Duck mallard = new Mallard();
        mallard.doFly();
        mallard.doQuack();

        Duck proto = new DuckPrototype();
        proto.doFly();
        proto.setFlyBehaviour(new FlyWithReactorPropulsion());
        proto.doFly();
    }
}
