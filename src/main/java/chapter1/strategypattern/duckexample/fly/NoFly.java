package chapter1.strategypattern.duckexample.fly;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("[No fly] No flap flap!");
    }
}
