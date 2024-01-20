package chapter1.strategypattern.duckexample.fly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoFly implements FlyBehavior {
    private static final Logger logger = LoggerFactory.getLogger(NoFly.class);

    @Override
    public void fly() {
        logger.atInfo().log("[No fly] No flap flap!");
    }
}
