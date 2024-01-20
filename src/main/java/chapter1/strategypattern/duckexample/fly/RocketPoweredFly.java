package chapter1.strategypattern.duckexample.fly;

public class RocketPoweredFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("[Rocket powered fly] Whoooooooshhhh!");
    }
}
