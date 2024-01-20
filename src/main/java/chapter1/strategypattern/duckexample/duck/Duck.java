package chapter1.strategypattern.duckexample.duck;

import chapter1.strategypattern.duckexample.fly.FlyBehavior;
import chapter1.strategypattern.duckexample.fly.NoFly;
import chapter1.strategypattern.duckexample.quack.NoQuack;
import chapter1.strategypattern.duckexample.quack.QuackBehavior;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
        System.out.println("Duck base constructor");
        this.flyBehavior = new NoFly();
        this.quackBehavior = new NoQuack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void fly() {
        flyBehavior.fly();
    }
}
