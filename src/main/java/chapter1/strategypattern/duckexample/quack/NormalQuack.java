package chapter1.strategypattern.duckexample.quack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chapter1.strategypattern.duckexample.fly.NormalFly;

public class NormalQuack implements QuackBehavior{
    private static final Logger logger = LoggerFactory.getLogger(NormalQuack.class);

    @Override
    public void quack() {
        logger.atInfo().log("[Normal quack] Quack Quack!");
    }
}
