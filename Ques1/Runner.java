package MultiThreadingTwo;
public class Runner {
    static void main(String[] args) {
        Thread1 A1 = new Thread1();
        Thread2 A2 = new Thread2();
        Thread t = new Thread();
        A2.start();
        A1.start();
    }
}
