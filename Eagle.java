package oop.lsp;

public class Eagle implements Flyable{
    @Override
    public void move() {//Flyable extends Movable
        System.out.println("Eagle walk");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is preying on its target");
    }
}
