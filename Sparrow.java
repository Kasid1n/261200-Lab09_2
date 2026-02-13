package oop.lsp;

public class Sparrow implements Flyable{
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void move() {//Flyable extends Movable
        System.out.println("Sparrow moving out");
    }
}
