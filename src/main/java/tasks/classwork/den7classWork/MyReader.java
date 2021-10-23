package tasks.classwork.den7classWork;

import java.io.*;

public class MyReader {

    public static void main(String[] args) throws IOException {

        read();
        write();

    }

    public static void read() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("myfile.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }

    public static void write() throws IOException {

        BufferedWriter out = new BufferedWriter(new FileWriter("myfile.txt"));
        out.write("привет");
        out.newLine();
        out.write("как дела");

        out.close();
    }
}
