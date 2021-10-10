package src.den2classwork;

public class MyRunner {
    public static void main(String[] args) {

        Glass glass = new Glass(250, "Белый");
        Glass glass2 = new Glass(280,  "Крассный");

        if (glass.isEmpty()) {
            System.out.println("Стакан пустой");
        } else {
            System.out.println("Стакан не пустой");
        }


        glass.setEffectiveVolume(200);



        System.out.println("В стакане " + glass.getEffectiveVolume() + " мл воды");
        System.out.println("Объём стакана  " + glass.getFullVolume() + " мл воды");
        System.out.println("Цвет стакана  " + glass.getColor());

        if (glass.isEmpty()) {
            System.out.println("Стакан пустой");
        } else {
            System.out.println("Стакан не пустой");
        }

    }
}



