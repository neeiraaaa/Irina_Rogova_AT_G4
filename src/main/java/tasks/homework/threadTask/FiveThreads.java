package tasks.homework.threadTask;

/*- создать 5 потоков, в каждом из которых:
-- создать коллекцию из 20 мышей
-- проитерировать коллекцию и пикнуть каждой мышью
- запустить потоки одновременно*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FiveThreads  {

        public static void main(String[] args) {

            List<Mouse> mouses = Collections.synchronizedList(new ArrayList<>(280));
            for (int i = 1; i <= 280; i++) {
                mouses.add(new Mouse(i));
            }

            for (int i = 0; i < 5; i++) {
                Thread thread = new Thread(() -> {
                    while(!mouses.isEmpty()) {
                        mouses.remove(0).peep();
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            System.out.println("Something goes wrong");
                        }
                    }
                });
                thread.start();
            }
        }
    }



