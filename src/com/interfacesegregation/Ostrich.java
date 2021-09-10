package com.interfacesegregation;

public class Ostrich implements Bird, Runnerbird{
    @Override
    public void eat(){
        System.out.println("Ostrich eats snake");
    }
    @Override
    public void run(){
        System.out.println("Ostrich Flies very fast");
    }
}
