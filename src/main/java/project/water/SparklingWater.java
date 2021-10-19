package project.water;

import project.bubbles.Bubble;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;

//содержит конструктор SparklingWater(), который вызывает внутренний метод isOpened();
    public SparklingWater() {

    }

//есть публичный метод void setOpened(boolean isOpened), который меняет состояние воды на "открытое"
    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }

//есть приватный метод void isOpened(), который в новом потоке проверят состояние воды на "открытость"
// и в случае, если она открыта запускает метод degas()
    private void isOpened() {
        if (isOpened) {
            degas();
        }
    }

//есть публичный метод void pump(Bubble[] bubbles), который сетает массив из пузырьков в воду
    public void pump(Bubble[] bubbles) {
        //  1 литр воды =10 тыс пузырьков
    }

//есть приватный метод degas(), который каждую секунду выпускает по партии пузырьков
// из рассчета 10 + 5 * температура_воды
    private void degas() {

    }

//есть публичный метод boolean isSparkle(), возвращающий true если в воде еще есть пузырьки газа
    public boolean isSparkle(boolean isSparkle) {
        System.out.printf("This is Sparkle water? It is: ").println();
        return isSparkle;
    }

    @Override
    public void mix() {

    }
}
