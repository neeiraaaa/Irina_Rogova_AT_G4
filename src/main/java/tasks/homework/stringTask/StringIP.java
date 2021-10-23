package tasks.homework.stringTask;

//имеется текст лога в виде:
        //access_log.2020.09.07 212.168.101.5 granted
        //access_log.2020.09.07 212.168.101.6 denied (отклонен)

//написать метод, который выводит список из уникальных IP адресов и количества удачных и неудачных попыток доступа в формате:
        //ip 212.168.101.5: ok - 3, failed - 2

public class StringIP {

    public static void main(String[] args) {

        String ipLog = "access_log.2020.09.07 212.168.101.5 granted";
        String ipLog2 = "access_log.2020.09.07 212.168.101.6 denied";

        for (int i = 0; i < ipLog.length(); i++) {
            //Метод Character.isDigit() — определяет, является ли указанное значение типа char цифрой.
            //Метод charAt() — возвращает символ, расположенный по указанному индексу строки.
            if (Character.isDigit(ipLog.charAt(i)))
                System.out.print(ipLog.charAt(i));

        }

        }

    }

