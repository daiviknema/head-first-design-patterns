package chapter1.strategypattern.duckexample;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
}

public class DuckTester {
    private static final Logger logger = LoggerFactory.getLogger(DuckTester.class);
    public static void main(String[] args) {
        logger.atInfo().log("Welcome to the duck pond!");

        Injector injector = Guice.createInjector(new DuckModule());
        DuckRunner runner = injector.getInstance(DuckRunner.class);

        runner.mallardDuckQuack();
        runner.mallardDuckFly();

        runner.woodenDuckQuack();
        runner.woodenDuckFly();
    }
}
