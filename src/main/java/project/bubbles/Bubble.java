package project.bubbles;

public class Bubble {

    private double bubbleVolume = 0.3;
    private String bubbleGas;

//содержит конструктор Bubble(String gas), в который передается строка с названием газа пузырька
    public Bubble(String bubbleGas) {
        this.bubbleGas = bubbleGas;
    }

    public String getBubbleGas() {
        return bubbleGas;
    }

    public void setBubbleGas(String bubbleGas) {
        this.bubbleGas = bubbleGas;
    }

//есть публичный метод void cramp(), который в консоль выводит слово "Cramp!"
    public void bubbleCramp() {
        System.out.println("Cramp!");
    }

//есть публичный метод double getVolume(), возвращающий обьем пузырька
    public double getVolume() {
        return bubbleVolume;
    }
}
