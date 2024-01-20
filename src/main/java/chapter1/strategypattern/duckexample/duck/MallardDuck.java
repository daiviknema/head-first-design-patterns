package chapter1.strategypattern.duckexample.duck;

import com.google.inject.Inject;

public class MallardDuck extends Duck {
    @Inject
    public MallardDuck() {
        System.out.println("Mallard duck constructor");
    }
}
