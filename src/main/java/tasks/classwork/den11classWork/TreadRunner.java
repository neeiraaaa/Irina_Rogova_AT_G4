package tasks.classwork.den11classWork;

import java.util.stream.IntStream;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class TreadRunner {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            IntStream.range(0, 100).forEach(
                    i -> {
                        System.out.println("t1: " + i);
                        Thread.yield();
                    });
        });

        Thread t2 = new Thread(() -> {
            IntStream.range(0, 100).forEach(i -> System.out.println("t2: " + i));
        });

        Thread t3 = new Thread(() -> {
            IntStream.range(0, 100).forEach(i -> System.out.println("t3: " + i));
        });

        t1.start();
        t2.start();
        t3.start();

        //запустить метод 5 раз
       // for (int i = 0; i < 5; i++) {
            //heavyMethod();
       // }

        //запустить метод 5 раз в новом потоке
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                heavyMethod();
            }).start();
        }
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
