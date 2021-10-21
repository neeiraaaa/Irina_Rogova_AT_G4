package tasks.stringTask;

//найти и вывести в консоль все дубликаты слов в строке текста

import java.util.Objects;

public class DoubleString {

    public static void main(String[] args) {

        String doubleWords= "Привет Ира, привет Настя, привет Оля";
        int count;

        // Преобразуем строку в нижний регистр
        doubleWords = doubleWords.toLowerCase();

        // Разбиваем строку на слова
        String[] words = doubleWords.split(" ");

        System.out.println("Повторяющиеся слова в заданной строке: ");
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    // Присваеваем words [j] в 0, чтобы не печатать посещенное слово
                    words[j] = "0";
                }
            }

            // Отобрабразить повторяющееся слово, если количество больше 1
            if(count > 1 && !Objects.equals(words[i], "0"))
                System.out.println(words[i]);
        }
    }

}
