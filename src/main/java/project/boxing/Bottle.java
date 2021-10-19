package project.boxing;

import project.interfaces.Containable;
import project.interfaces.Transformable;
import project.materials.Material;
import project.water.SparklingWater;

public class Bottle extends Vessel implements Containable {

//содержит приватные поля double volume, SparklingWater water
    private double volume;
    private SparklingWater water;

//содержит конструктор Bottle(double volume), в котором бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр
    public Bottle(double volume) {
        super();
        int arrayBabbles[] = new int[100];
        double newVolume = volume * 10000;
    }

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    //есть публичный метод void open(), который меняет состояние воды в "открытое" (приблизительно, как this.water.setOpened(true);)
    public void open() {
        this.water.setOpened(true);
    }

    @Override
    public void close() {

    }

    //есть публичный метод void warm(int temperature), который устанавливает температуру воды в бутылке
    public void warm(int temperature) {

    }


//есть публичный метод SparklingWater getWater() возвращающий обьект воды
    public  SparklingWater getWater() {
        return water;
    }


//есть публичный метод setWater(SparklingWater water) добавляющий новый обьект воды
    //public SparklingWater setWater(SparklingWater water) {

   // }


}
