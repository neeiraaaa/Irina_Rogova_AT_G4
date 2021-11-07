package tasks.homework.streamsApi;

//- построчно прочитать файл и создать стрим из его строк, пропустив первые 4 строки собрать коллекцию в отдну строку,
//разделить на по <br>, оставить только те, что начинаются с "Date log:", в каждой строке оставить только первые 20 символов,
// к каждой в конец дописать значение текущей даты

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.stream.Collectors;

public class DateLog {

    public static void main(String[] args) throws IOException {

        System.out.println(Files.lines(Paths.get("dateLog.txt")).skip(4)
                .filter(s -> s.startsWith("Date log"))
                .map(line -> line.substring(0, Math.min(line.length(), 20)))
                .map(line -> line + " " + LocalDateTime.now())
                .collect(Collectors.joining(" " + "<br>" + " ")));
    }
}
