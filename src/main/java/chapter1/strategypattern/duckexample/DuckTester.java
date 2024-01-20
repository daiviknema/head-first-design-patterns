package chapter1.strategypattern.duckexample;

import chapter1.strategypattern.duckexample.duck.Duck;
import chapter1.strategypattern.duckexample.duck.MallardDuck;
import chapter1.strategypattern.duckexample.duck.WoodenDuck;

public class DuckTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the duck application");

        Duck mallard = new MallardDuck();
        mallard.quack();
        mallard.fly();

        Duck woodenDuck = new WoodenDuck();
        woodenDuck.quack();
        woodenDuck.fly();
    }
}
