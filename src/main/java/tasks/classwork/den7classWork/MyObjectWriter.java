package tasks.classwork.den7classWork;

import java.io.*;

public class MyObjectWriter {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream newFile1 = new FileInputStream("t.tmp");
        ObjectInputStream writerFile2 = new ObjectInputStream(newFile1);
        Table table = (Table) writerFile2.readObject();
        writerFile2.close();
        System.out.println(table.toString());
    }
    // читает мой файл со столом, который я написала ранее
}
