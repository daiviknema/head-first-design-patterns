package chapter1.strategypattern.duckexample.quack;

public class NoQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("[No quack] Chirp... chirp...");
    }
}
