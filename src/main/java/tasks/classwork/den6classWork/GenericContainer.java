package tasks.classwork.den6classWork;

public class GenericContainer<T> {

        private int freePlaysNumber = 0;
        private T[] firstArray = (T[]) new Object[10];


        public void add(T incoming) {
            if (freePlaysNumber < firstArray.length) {
                firstArray[freePlaysNumber] = incoming;
                freePlaysNumber++;
            }
        }

        public T removeLast() {
            if (freePlaysNumber > 0) {
                Object object = firstArray[freePlaysNumber - 1];
                firstArray[freePlaysNumber - 1] = null;
                freePlaysNumber--;
                return (T) object;
            }
            return null ;
        }

        public boolean isEmpty() {
            return freePlaysNumber == 0;
        }

        public boolean isFool() {
            return freePlaysNumber == firstArray.length;
        }

    }

