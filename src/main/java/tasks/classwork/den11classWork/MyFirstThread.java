package tasks.classwork.den11classWork;

public class MyFirstThread {

    public static void main(String[] args) {

        Thread thread = new Thread(System.out::println);

        thread.start();

    }
}
