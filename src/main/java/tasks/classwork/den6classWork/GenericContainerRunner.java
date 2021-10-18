package tasks.classwork.den6classWork;

import java.util.Random;

public class GenericContainerRunner {
    public static void main(String[] args) {

        GenericContainer <Integer> objectContainerNew = new GenericContainer<>();
        Random random = new Random();

        while (!objectContainerNew.isFool()) {
            objectContainerNew.add(random.nextInt(100));

        }
        while (!objectContainerNew.isEmpty()) {
            System.out.println(objectContainerNew.removeLast());

        }
    }
}
