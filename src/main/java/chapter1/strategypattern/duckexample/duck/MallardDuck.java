package chapter1.strategypattern.duckexample.duck;

import chapter1.strategypattern.duckexample.fly.NormalFly;
import chapter1.strategypattern.duckexample.quack.NormalQuack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        System.out.println("Mallard duck constructor");
        setFlyBehavior(new NormalFly());
        setQuackBehavior(new NormalQuack());
    }
}
