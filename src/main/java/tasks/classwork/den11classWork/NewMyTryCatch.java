package tasks.classwork.den11classWork;

import java.io.*;

public class NewMyTryCatch {

    public static void main(String[] args) {


        try(FileOutputStream fos = new FileOutputStream("t.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
