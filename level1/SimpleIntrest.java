package com.gla.methods.level1;
import java.util.Scanner;
public class SimpleIntrest {
    public int simpleintrest(int p, int r, int t) {
        return (p * r * t);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleIntrest si = new SimpleIntrest();
        System.out.print("Enter p =  ");
        int principal = sc.nextInt();
        System.out.print("Enter r = ");
        int rate = sc.nextInt();
        System.out.print("Enter t = ");
        int time = sc.nextInt();
        System.out.print("Simple Intrest is " + si.simpleintrest(principal,time,rate));
        System.out.print(" for principal " + principal);
        System.out.print(" Rate of intrest " + rate);
        System.out.print(" and time " + time);
    }
}
