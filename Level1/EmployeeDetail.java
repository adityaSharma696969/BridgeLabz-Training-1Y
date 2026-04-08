package com.gla.ClassAndObject.Level1;

public class EmployeeDetail {
        String a;
        int b;
        double c;
        void show(){
            System.out.println("Name="+a);
            System.out.println("Id="+b);
            System.out.println("Salary="+c);
        }
        public static void main(String[] args){
            EmployeeDetail d=new EmployeeDetail();
            d.a="Aditya";
            d.b=69;
            d.c=50000;
            d.show();

    }
}
