package com.company;

public class Main {

    //TODO: 14: Look Ma! It Runs!!!
    public static void main(String[] args) {
	// write your code here

        MallardDuck mallardDuck = new MallardDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        RubberDuck rubberDuck = new RubberDuck();

        rubberDuck.swim();
        redheadDuck.quack();
        mallardDuck.swim();

        WoodenDuck woodenDuck = new WoodenDuck();
        woodenDuck.quack();

        mallardDuck.fly();
        redheadDuck.fly();
        woodenDuck.fly();
        rubberDuck.fly();

    }
}
