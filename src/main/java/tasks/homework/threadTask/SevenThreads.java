package tasks.homework.threadTask;

/*- создать 7 потоков, в каждом из которых:
-- создать коллекцию из 18 мышей
-- проитерировать коллекцию и пикнуть каждой четной мышью
- запустить потоки*/

public class SevenThreads {

    public static void main(String[] args) {

        int numThreads = 7;
        for (int z = 0; z < numThreads; z++) {
            Thread thread = new Thread(() -> {
                for (int i = 0; i < 19; i++) {
                    Mouse mouse = new Mouse(i);
                    if (i % 2==0) {
                        mouse.peep();
                    }
                }
            });
            thread.start();
        }
    }
}
