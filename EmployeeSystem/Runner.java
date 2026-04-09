package com.gla.EmployeeSystem;
public class Runner{
    public static void main(String[] args){
        Employee[] employees=new Employee[3];
        employees[0]=new Manager("Aditya",69,80000,7);
        employees[1]=new Developer("Abhishek",67,60000,"Java");
        employees[2]=new Intern("Deepesh",143,80000,6);
        for(Employee e:employees){
            e.displayDetails();
            System.out.println();
        }
    }
}