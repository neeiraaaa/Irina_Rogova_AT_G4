package tasks.classwork.den9classWork.IMyInterface1;

import tasks.classwork.den9classWork.IMyInterface1.IMyInterface;

public class MyClass {
    
    public void justMethod(IMyInterface staff) {
        System.out.println("The result of something is: " + staff.doSomething());
    }
}
