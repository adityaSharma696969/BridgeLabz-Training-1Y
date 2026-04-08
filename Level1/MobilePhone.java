package com.gla.ClassAndObject.Level1;

public class MobilePhone {
          String a,b;
        double c;
        void show(){
            System.out.println("Brand="+a);
            System.out.println("Model="+b);
            System.out.println("Price="+c);
        }
        public static void main(String[] args){
            MobilePhone d=new MobilePhone();
            d.a="Samsung";
            d.b="Galaxy S23";
            d.c=79999;
            d.show();
        }
    }

