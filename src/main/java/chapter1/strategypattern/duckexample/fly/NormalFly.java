package chapter1.strategypattern.duckexample.fly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NormalFly implements FlyBehavior {
    private static final Logger logger = LoggerFactory.getLogger(NormalFly.class);

    @Override
    public void fly() {
        logger.atInfo().log("[Normal fly] Flap flap!");
    }
}
