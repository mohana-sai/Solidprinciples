package com.interfacesegregation;

public class Penguin implements Bird, Swimmerbird{
    @Override
    public void eat(){
        System.out.println("Penguin eats fish");
    }
    @Override
    public void swim(){
        System.out.println("Penguins are black and white");
    }
}
