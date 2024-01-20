package chapter1.strategypattern.duckexample.fly;

public class NormalFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("[Normal fly] Flap flap!");
    }
}
