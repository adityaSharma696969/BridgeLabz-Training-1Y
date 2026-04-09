package WrapperClasses;
import java.util.*;
public class PrimitiveToWrapper{
    public static void primitiveToWrapperConversion(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Integer b = a;
        System.out.println("Primitive Data type: " + a);
        System.out.println("Object Data Type: " + b);
    }

    static void main(String[] args) {
        primitiveToWrapperConversion();
    }
}
