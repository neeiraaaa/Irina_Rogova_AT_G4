package tasks.homework.basetask;

public class TrainMethodsLf {
    public int returnNewLnt(int newValue) {
        if (newValue < 8) {
            return newValue * 7;
        } else {
            return newValue / 4;
        }
    }

    public long returnNewLong(long newLongValue) {
        if (newLongValue > 300) {
            return newLongValue - 300;
        } else {
            return newLongValue + 20;
        }
    }

    public String returnNewChar(char newCharValue) {
        if (newCharValue == 'g') {
            return "go";
        } else {
            return "o";
        }
    }

    public float returnNewFloat(float newFloatValue) {
        if (newFloatValue == 0.67F) {
            return newFloatValue;
        } else {
            return newFloatValue * 2;
        }
    }

    public double returnNewDouble(double newDoubleValue) {
        if (newDoubleValue > 30 && newDoubleValue < 80) {
            return newDoubleValue + 87;
        } else if (newDoubleValue > 80 && newDoubleValue < 400) {
            return newDoubleValue - 87;
        } else if (newDoubleValue > 400) {
            return newDoubleValue / 4;
        }
        return newDoubleValue;
    }

    public boolean returnNewBoolean(boolean isTrue) {
        if (isTrue) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
        return isTrue;
    }

}

