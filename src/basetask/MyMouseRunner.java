package basetask;

public class MyMouseRunner {

    Mouse mouse = new Mouse("Ira", 23);
    public static void main(String[] args) {

        new  MyMouseRunner().printMouseDetails();

    }

    public void printMouseDetails() {
        System.out.println("Я мышь и меня зовут " + mouse.getName() + " и мне " + mouse.getAge());
    }


}
