package tasks.classwork.den2classwork;

public class Glass {

    private int fullVolume;

    private int effectiveVolume;
    public String color;
    private boolean isEmpty = true ;

    public Glass(int fullVolume, String color){
        this.fullVolume = fullVolume;
        this.color = color;

    }

    public int getFullVolume() {
        return fullVolume;
    }

    public int getEffectiveVolume() {
        return effectiveVolume;
    }

    public void setEffectiveVolume(int effectiveVolume) {
        this.effectiveVolume = effectiveVolume;

        if(effectiveVolume > 0) {
            this.isEmpty = false;

        }
    }

    public String getColor() {
        return color;
    }


    public boolean isEmpty() {
        return isEmpty;
    }

}
