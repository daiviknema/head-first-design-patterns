package chapter1.strategypattern.duckexample;

import com.google.inject.Guice;
import com.google.inject.Inject;

import chapter1.strategypattern.duckexample.duck.Duck;
import chapter1.strategypattern.duckexample.inject.Annotations.Wooden;
import chapter1.strategypattern.duckexample.inject.Annotations.Mallard;
import chapter1.strategypattern.duckexample.inject.DuckModule;

class DuckRunner {
    private Duck mallardDuck;

    private Duck woodenDuck;

    @Inject
    public DuckRunner(@Mallard Duck mallardDuck, @Wooden Duck woodenDuck) {
        this.mallardDuck = mallardDuck;
        this.woodenDuck = woodenDuck;
    }

    public void mallardDuckQuack() {
        mallardDuck.quack();
    }

    public void mallardDuckFly() {
        mallardDuck.fly();
    }

    public void woodenDuckQuack() {
        woodenDuck.quack();
    }

    public void woodenDuckFly() {
        woodenDuck.fly();
    }

    public static DuckRunner getDuckRunnerInstance() {
        return Guice.createInjector(new DuckModule()).getInstance(DuckRunner.class);
    }
}

public class DuckTester {

    public static void main(String[] args) {
        System.out.println("Welcome to the duck application");

        DuckRunner runner = DuckRunner.getDuckRunnerInstance();

        runner.mallardDuckQuack();
        runner.mallardDuckFly();

        runner.woodenDuckQuack();
        runner.woodenDuckFly();
    }
}
