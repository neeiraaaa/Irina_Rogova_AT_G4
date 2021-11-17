package tasks.homework.threadTask;

/*- создать 6 потоков, в каждом из которых:
-- создать коллекцию из 26 мышей
- проитерировать коллекцию и пикнуть каждой нечетной мышью
- запустить потоки*/

public class SixThreads {

    public static void main(String[] args) {

        int numThreads = 6;
        for (int z = 0; z < numThreads; z++) {
            Thread thread = new Thread(() -> {
                for (int i = 0; i < 27; i++) {
                    Mouse mouse = new Mouse(i);
                    if (i % 2==1) {
                        mouse.peep();
                    }
                }
            });
            thread.start();
        }
    }
}
