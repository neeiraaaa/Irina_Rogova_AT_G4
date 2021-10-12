package tasks.homework.basetask;

public class TrainMethodsLfRunner {
    public static void main(String[] args) {
        TrainMethodsLf trainMethodslf = new TrainMethodsLf();
        System.out.println("Метод returnNewLnt вернул " + trainMethodslf.returnNewLnt(12) );
        System.out.println("Метод returnNewLong вернул " + trainMethodslf.returnNewLong(6));
        System.out.println("Метод returnNewChar вернул " + trainMethodslf.returnNewChar('g'));
        System.out.println("Метод returnNewFloat вернул " + trainMethodslf.returnNewFloat( 0.68F));
        System.out.println("Метод returnNewDouble вернул " + trainMethodslf.returnNewDouble(400.56));
        System.out.println(trainMethodslf.returnNewBoolean(false));
    }
}

