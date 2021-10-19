package project.boxing;

import project.interfaces.Containable;
import project.interfaces.Transformable;
import project.materials.Material;

public class Cup extends Vessel implements Containable {


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

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
