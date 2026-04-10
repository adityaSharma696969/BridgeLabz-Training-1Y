package com.gla.methods.level1;
import  java.util.Scanner;
public class Perimeter {
    public int triangleperimeter(int s){
        int rounds = 5000/(3*s);
        return rounds;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perimeter per = new Perimeter();
        System.out.print("Enter Park Side in meters = ");
        int s = sc.nextInt();
        System.out.println("No Of Rounds Are: " + per.triangleperimeter(s));
    }
}
