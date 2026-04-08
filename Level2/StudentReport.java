package com.gla.ClassAndObject.Level2;

public class StudentReport {
            String a;
        int b,c;
        String grade(){
            if(c>=90)return "A";
            else if(c>=75)return "B";
            else if(c>=50)return "C";
            else return "F";
        }
        void show(){
            System.out.println("Name="+a);
            System.out.println("Roll="+b);
            System.out.println("Marks="+c);
            System.out.println("Grade="+grade());
        }
        public static void main(String[] args){
            StudentReport d=new StudentReport();
            d.a="Ravi";
            d.b=101;
            d.c=88;
            d.show();
        }
    }
