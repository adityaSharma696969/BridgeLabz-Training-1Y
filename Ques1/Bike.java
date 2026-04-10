package com.gla.Ques1;
class Bike implements Rentable {
    @Override
    public void rent() {
        System.out.println("Bike has been rented.");
    }
    @Override
    public void returnVehicle() {
        System.out.println("Bike has been returned.");
    }
}