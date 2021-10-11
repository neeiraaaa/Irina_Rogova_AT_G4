package basetask;

public class Bee {
    private String gender;
    private long weigh;

    public Bee(String gender, long weigh) {
        this.gender = gender;
        this.weigh = weigh;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getWeigh() {
        return weigh;
    }

    public void setWeigh(long weigh) {
        this.weigh = weigh;
    }

    public void printBeeDetails() {
        System.out.println("Я легче лося в " + 500 / weigh + " раз");
    }
}
