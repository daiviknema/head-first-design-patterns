package chapter1.strategypattern.duckexample.quack;

public class NormalQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("[Normal quack] Quack Quack!");
    }
}
