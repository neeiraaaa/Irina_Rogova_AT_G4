package den2classwork;

public class NewClassMyDemo {
    public void goDemoVersion() {
        int i = 23;
        for ( i = 23; i < 28; i++){
            if (i % 13 == 0) {
                System.out.println("continue!");
                break;
            }
            System.out.println("i is : " + i);
        }
        System.out.println("number is : " + i);
    }
}

