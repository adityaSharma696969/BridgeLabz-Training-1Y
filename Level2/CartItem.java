package com.gla.ClassAndObject.Level2;

public class CartItem {
          String a;
        double b;
        int c;
        void add(String x,double y,int z){
            a=x;b=y;c=z;
        }
        void remove(){
            a="";b=0;c=0;
        }
        double total(){
            return b*c;
        }
        void show(){
            System.out.println("Item="+a);
            System.out.println("Price="+b);
            System.out.println("Quantity="+c);
            System.out.println("Total="+total());
        }
        public static void main(String[] args){
            CartItem d=new CartItem();
            d.add("Pen",10,5);
            d.show();
            d.remove();
            d.show();

    }
}
