package tasks.classwork.den6classWork;

public class ClassC extends ClassA {

    public int foo(int x) {
        int y = super.foo(x);
        System.out.println(y);
        return y;
    }
}

