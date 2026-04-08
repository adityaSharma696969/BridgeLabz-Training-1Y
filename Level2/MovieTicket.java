package com.gla.ClassAndObject.Level2;

public class MovieTicket {
           String a;
        int b;
        double c;
        void book(String x,int y,double z){
            a=x;b=y;c=z;
        }
        void show(){
            System.out.println("Movie="+a);
            System.out.println("Seat="+b);
            System.out.println("Price="+c);
        }
        public static void main(String[] args){
            MovieTicket d=new MovieTicket();
            d.book("Avengers",12,350);
            d.show();

    }
}
