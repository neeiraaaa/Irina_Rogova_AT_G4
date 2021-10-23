package tasks.classwork.den7classWork;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyFileRunner {

    public static void main(String[] args) throws IOException {

        FileOutputStream newFile = new FileOutputStream("t.tmp");
        ObjectOutputStream writerFile = new ObjectOutputStream(newFile);
        writerFile.writeObject(new Table(12, "green"));
        writerFile.close();
    }
}
