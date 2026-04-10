package com.gla.Ques1;
class Bus implements Rentable {
    @Override
    public void rent() {
        System.out.println("Bus has been rented.");
    }
    @Override
    public void returnVehicle() {
        System.out.println("Bus has been returned.");
    }
}