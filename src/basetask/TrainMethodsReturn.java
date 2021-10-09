package basetask;

public class TrainMethodsReturn {
    public int returnNewInt(int integerValue) {
        return integerValue * 3;
    }
    public long returnNewLong(long longValue) {
        return longValue - 4;

    }
    public String returnNewChar(char charValue) {
        return charValue + charValue + "";
    }

    public float returnNewFloat(float floatValue) {
        return floatValue / 2;
    }

    public double returnNewDouble(double doubleValue) {
        return doubleValue + 8;
    }

    public short returnNewShort(short shortValue) {
        return (short) (shortValue - 1);
    }

    public byte returnNewByte(byte byteValue) {
        return (byte) (byteValue * 2);
    }

    public boolean returnNewBoolean(boolean isTrue) {
        return !isTrue;
       }
    }


