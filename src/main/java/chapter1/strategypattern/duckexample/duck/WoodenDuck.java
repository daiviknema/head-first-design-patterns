package chapter1.strategypattern.duckexample.duck;

import chapter1.strategypattern.duckexample.fly.NoFly;
import chapter1.strategypattern.duckexample.quack.NoQuack;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        System.out.println("Wooden duck constructor");
        setFlyBehavior(new NoFly());
        setQuackBehavior(new NoQuack());
    }
}
