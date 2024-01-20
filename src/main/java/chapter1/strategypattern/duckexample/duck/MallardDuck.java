package chapter1.strategypattern.duckexample.duck;

import com.google.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MallardDuck extends Duck {
    private static final Logger logger = LoggerFactory.getLogger(MallardDuck.class);

    @Inject
    public MallardDuck() {
        logger.atInfo().log("Mallard duck constructor");
    }
}
