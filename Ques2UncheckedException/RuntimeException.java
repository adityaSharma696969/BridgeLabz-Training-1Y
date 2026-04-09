package com.gla.ExceptionHandling.Ques2UncheckedException;
import java.util.Scanner;
import java.util.InputMismatchException;
public class RuntimeException {
public static void main(String[] args) {
            Scanner ob = new Scanner(System.in);
            try {
                int a = ob.nextInt();
                int b = ob.nextInt();
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception");
            } catch (InputMismatchException e) {
                System.out.println("Input Mismatch Exception");
            }
            ob.close();
                  }
    }

