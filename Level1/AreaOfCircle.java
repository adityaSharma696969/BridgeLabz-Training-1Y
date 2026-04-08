package com.gla.ClassAndObject.Level1;

public class AreaOfCircle {
        double a;
        double area(){
            return 3.14*a*a;
        }
        double circum(){
            return 2*3.14*a;
        }
        void show(){
            System.out.println("Area="+area());
            System.out.println("Circumference="+circum());
        }
        public static void main(String[] args){
            AreaOfCircle b=new AreaOfCircle();
            b.a=7;
            b.show();
        }
    }

