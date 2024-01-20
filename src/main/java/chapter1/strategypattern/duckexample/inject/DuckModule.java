package chapter1.strategypattern.duckexample.inject;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import chapter1.strategypattern.duckexample.duck.Duck;
import chapter1.strategypattern.duckexample.duck.MallardDuck;
import chapter1.strategypattern.duckexample.duck.WoodenDuck;
import chapter1.strategypattern.duckexample.fly.NoFly;
import chapter1.strategypattern.duckexample.fly.NormalFly;
import chapter1.strategypattern.duckexample.inject.Annotations.Mallard;
import chapter1.strategypattern.duckexample.inject.Annotations.Wooden;
import chapter1.strategypattern.duckexample.quack.NoQuack;
import chapter1.strategypattern.duckexample.quack.NormalQuack;

public class DuckModule extends AbstractModule {
    @Provides
    @Mallard
    public Duck provideMallardDuck() {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new NormalFly());
        mallardDuck.setQuackBehavior(new NormalQuack());
        return mallardDuck;
    }

    @Provides
    @Wooden
    public Duck provideWoodenDuck() {
        Duck woodenDuck = new WoodenDuck();
        woodenDuck.setFlyBehavior(new NoFly());
        woodenDuck.setQuackBehavior(new NoQuack());
        return woodenDuck;
    }
}
