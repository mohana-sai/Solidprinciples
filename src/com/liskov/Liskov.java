package com.liskov;


import java.util.Vector;

class Vehicle {
    public void start(){
        System.out.println("Starting a vehicle");
    }

    public void stop(){
        System.out.println("Stopping a vehicle");
    }
}

class Bike extends Vehicle{
    public void start(){
        System.out.println("Starting a Bike");
    }

    public void stop(){
        System.out.println("Stopping a Bike");
    }
}

class Car extends Vehicle{
    public void start(){
        System.out.println("Starting a Car");
    }

    public void stop(){
        System.out.println("Stopping a Car");
    }
}


public class Liskov {

    static  void testDrive(Vehicle vehicle){
        vehicle.start();
        vehicle.stop();
    }

    public static void main(String[] args) {
        testDrive(new Vehicle());
        testDrive(new Bike());
        testDrive(new Car());
    }
}