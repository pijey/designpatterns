package com.pijey.designpatterns.strategy;

import com.pijey.designpatterns.strategy.behaviour.FlyBehaviour;
import com.pijey.designpatterns.strategy.behaviour.QuackBehaviour;

/**
 * Created by A187838 on 11/07/2014.
 */
public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {

    }

    public void doFly(){
        flyBehaviour.fly();
    }

    public void doQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("Every duck swims, even decoys!");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
