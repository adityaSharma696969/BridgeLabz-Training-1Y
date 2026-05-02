package com.Generics,PairRunner;
public class PairRunner {
        public static void main(String[] args){
            Pair<String,Integer> student=new Pair<>("Aditya",18);
            System.out.println("Name = "+student.getFirst());
            System.out.println("Age = "+student.getSecond());
        }
}
