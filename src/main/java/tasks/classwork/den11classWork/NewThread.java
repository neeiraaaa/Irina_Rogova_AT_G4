package tasks.classwork.den11classWork;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class NewThread {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> heavyMethod());

        Thread t2 = new Thread(() -> heavyMethod());

        Thread t3 = new Thread(() -> {
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            heavyMethod();
        });

        t1.start();
        t2.start();
        t3.start();

    }

    //метод с затратными вычислениями
    public  static  void  heavyMethod() {
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000_000; i++) {
            double d = tan(atan(123456789.123456789));
        }

        System.out.printf("I am %s, and I have finished in %s \r\n",
                Thread.currentThread().getName(),
                (System.currentTimeMillis() - t0));
    }
}
