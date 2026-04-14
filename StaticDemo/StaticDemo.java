package StaticDemo;
import static java.lang.Math.*;
public class StaticImportDemo {
    public static void main(String[] args) {
        int a = 16;
        int b = 4;
        System.out.println("Square Root of 16 = " + sqrt(a));
        System.out.println("Power (4^3) = " + pow(b, 3));
        System.out.println("Maximum of 10 and 20 = " + max(10, 20));
        System.out.println("Minimum of 10 and 20 = " + min(10, 20));
        System.out.println("Absolute value of -25 = " + abs(-25));
    }
}