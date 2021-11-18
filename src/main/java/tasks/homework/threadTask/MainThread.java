package tasks.homework.threadTask;

/*- в главном потоке создать коллекцию из 280 мышей
- создать 5 дочерних потоков, в каждом из которых:
- каджые 300мс удалять 1 пикающую мышь
- запустить потоки*/

public class MainThread {

    public static void main(String[] args) {

        for (int i = 0; i < 281; i++) {
            Mouse mouse = new Mouse(i);
            if (i % 2 == 1) {
                mouse.peep();
            }
        }
    }
}
