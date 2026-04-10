package com.gla.methods.level1;

import java.util.Scanner;

public class ChoclateDistribution{
    public int quotient(int choclate,int childs){
        return choclate / childs;
    }
    public int remainder(int choclate, int childs){
        return choclate%childs;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuotientAndRemainder find = new QuotientAndRemainder();
        System.out.print("Enter Number Of choclates: ");
        int choclates = sc.nextInt();
        System.out.print("Enter Chidrens Count: ");
        int childrens = sc.nextInt();
        System.out.println("Choclates Distributed to each children are : " + find.quotient(choclates, childrens) + " And choclates left are: " + find.remainder(choclates, childrens));
    }
}
