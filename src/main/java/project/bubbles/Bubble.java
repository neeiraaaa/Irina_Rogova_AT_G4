package project.bubbles;

public class Bubble {

    public String bubbleVolume = "0.3 мм2";
    public String bubbleCramp = "Cramp!";
    private int bubbleGas;

    public Bubble(int bubbleGas) {
        this.bubbleGas = bubbleGas;
    }
    public int getBubbleGas() {
        return bubbleGas;
    }

    public void setBubbleGas(int bubbleGas) {
        this.bubbleGas = bubbleGas;
    }




}
