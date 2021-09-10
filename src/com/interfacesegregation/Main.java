package com.interfacesegregation;

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.eat();
        Ostrich ostrich = new Ostrich();
        ostrich.eat();
        Penguin penguin = new Penguin();
        penguin.eat();
    }
}
