package WrapperClasses;
import java.util.*;
public class WrapperToPrimitive{
    public static void rapperToPrimitiveConversion(){
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        double b = sc.nextDouble();
        int c = (int) b;
        System.out.println("Double object: " + a);
        System.out.println("double Primitive: " + b);
        System.out.println("Intger primitive: " + c);
    }

    static void main(String[] args) {
        rapperToPrimitiveConversion();
    }
}
