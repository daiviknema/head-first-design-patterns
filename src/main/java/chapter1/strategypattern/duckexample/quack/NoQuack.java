package chapter1.strategypattern.duckexample.quack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoQuack implements QuackBehavior {
    private static final Logger logger = LoggerFactory.getLogger(NoQuack.class);

    @Override
    public void quack() {
        logger.atInfo().log("[No quack] Chirp... chirp...");
    }
}
