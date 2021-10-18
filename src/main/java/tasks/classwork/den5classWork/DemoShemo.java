package tasks.classwork.den5classWork;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoShemo {
    public static void main(String[] args) throws ParseException {

        System.out.println(0.3 + 0.4);

        float x = 0.3F + 0.4F;
        System.out.println(x);

        int y = Integer.parseInt("23");
        System.out.println(y);

        long t1 = System.currentTimeMillis();


        int n = 100000;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append("*");
        }
        System.out.println(s);
        System.out.println(System.currentTimeMillis() - t1);

        compare(null);

        DateFormat dateFormat = new SimpleDateFormat("dd.MMM.yyyy");
        //Date date = dateFormat.parse("12.01.2021");
        String tex = dateFormat.format((new Date()));

        System.out.println(tex);

    }
    public static void compare(String s) {
        System.out.println("mama".equals(s));
    }
}
