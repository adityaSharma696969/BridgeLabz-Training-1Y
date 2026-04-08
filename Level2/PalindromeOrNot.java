package com.gla.ClassAndObject.Level2;

public class PalindromeOrNot {
        String a;
        boolean check(){
            String b=new StringBuilder(a).reverse().toString();
            return a.equals(b);
        }
        void show(){
            System.out.println("Text="+a);
            System.out.println("Palindrome="+check());
        }
        public static void main(String[] args){
            PalindromeOrNot c=new PalindromeOrNot();
            c.a="madam";
            c.show();

    }
}
