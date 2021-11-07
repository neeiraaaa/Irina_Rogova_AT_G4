package tasks.classwork.den9classWork.IMyInterface3;

import tasks.classwork.den9classWork.ClassX.ClassX;

public class Runner {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.justMethod(ClassX::new);
    }
}
