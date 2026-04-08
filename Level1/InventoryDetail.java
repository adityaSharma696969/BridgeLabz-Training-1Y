package com.gla.ClassAndObject.Level1;

public class InventoryDetail {
          int a;
        String b;
        double c;
        void show(int d){
            System.out.println("Code="+a);
            System.out.println("Name="+b);
            System.out.println("Price="+c);
            System.out.println("Total="+c*d);
        }
        public static void main(String[] args){
            InventoryDetail e=new InventoryDetail();
            e.a=101;
            e.b="Pen";
            e.c=10;
            e.show(5);
        }
    }

