package Multi_Threading;

public class Runner {
    static void main(String[] args) {
        MyThread1 A1 = new MyThread1();
        MyThread2 A2 = new MyThread2();
        A1.run();
        A2.run();

    }
}
