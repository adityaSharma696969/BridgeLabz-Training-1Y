package com.gla.ClassAndObject.Level2;

public class BankAccount {
            String a;
        int b;
        double c;
        void deposit(double d){
            c+=d;
        }
        void withdraw(double d){
            if(c>=d)c-=d;
            else System.out.println("Insufficient balance");
        }
        void show(){
            System.out.println("Holder="+a);
            System.out.println("Account="+b);
            System.out.println("Balance="+c);
        }
        public static void main(String[] args){
            BankAccount e=new BankAccount();
            e.a="Ravi";
            e.b=101;
            e.c=5000;
            e.deposit(2000);
            e.withdraw(1000);
            e.show();
        }

}
