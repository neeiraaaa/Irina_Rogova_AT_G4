package tasks.classwork.den6classWork;

import java.util.Random;

public class ObjectContainerRunner {
    public static void main(String[] args) {

        ObjectContainer objectContainer = new ObjectContainer();
        Random random = new Random();

        while (!objectContainer.isFool()) {
            objectContainer.add(random.nextInt(100));

        }
        while (!objectContainer.isEmpty()) {
            System.out.println(objectContainer.removeLast());

        }
    }
}
