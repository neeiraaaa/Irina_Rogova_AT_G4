package tasks.classwork.den6classWork;

public class ObjectContainer {

    private int freePlaysNumber = 0;
    private Object[] firstArray = new Object[10];


    public void add(Object incoming) {
        if (freePlaysNumber < firstArray.length) {
            firstArray[freePlaysNumber] = incoming;
             freePlaysNumber++;
        }
    }

    public Object removeLast() {
        if (freePlaysNumber > 0) {
            Object object = firstArray[freePlaysNumber - 1];
            firstArray[freePlaysNumber - 1] = null;
            freePlaysNumber--;
            return object;
        }
        return null;
    }

    public boolean isEmpty() {
        return freePlaysNumber == 0;
    }

    public boolean isFool() {
        return freePlaysNumber == firstArray.length;
    }

}

