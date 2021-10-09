package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
        System.out.println("Метод printInt вернул " + trainMethodsReturn.returnNewInt(5));
        System.out.println("Метод returnNewLong вернул " + trainMethodsReturn.returnNewLong(6));
        System.out.println("Метод returnNewChar вернул " + trainMethodsReturn.returnNewChar('а'));
        System.out.println("Метод returnNewFloat вернул " + trainMethodsReturn.returnNewFloat((float) 40.80));
        System.out.println("Метод returnNewDouble вернул " + trainMethodsReturn.returnNewDouble(67.77));
        System.out.println("Метод returnNewShort вернул " + trainMethodsReturn.returnNewShort((short) 60));
        System.out.println("Метод returnNewByte вернул " + trainMethodsReturn.returnNewByte((byte) 2));
        System.out.println("Метод returnNewBoolean вернул " + trainMethodsReturn.returnNewBoolean(false));
    }
}
