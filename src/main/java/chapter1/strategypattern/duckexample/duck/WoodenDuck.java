package chapter1.strategypattern.duckexample.duck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WoodenDuck extends Duck {
    private static final Logger logger = LoggerFactory.getLogger(WoodenDuck.class);

    public WoodenDuck() {
        logger.atInfo().log("Wooden duck constructor");
    }
}
