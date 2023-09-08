package homework3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Server {
    Scanner scanner = new Scanner(System.in);   
        // Запрос у пользователя данных:
    public String[] prompt(String msg) {
        System.out.println(msg);
        return scanner.nextLine().split(" ");
    }

    // Проверка формата введённых данных:
    public void checkFormat(String[] human_info, int i) {
        switch (i) {
            case 0: // Проверка фамилии
                if (checkString(human_info[0]))
                    throw new StringCheck(-1);
            case 1: // Проверка имени
                if (checkString(human_info[1]))
                    throw new StringCheck(-1);
            case 2: // Проверка отчества
                if (checkString(human_info[2]))
                    throw new StringCheck(-1);
            case 3: // Проверка даты
                if (!dateValidator(human_info[3])) throw new StringCheck(-3);
            case 4: // Проверка номера телефона
                if (!checkString(human_info[4]))
                    throw new StringCheck(-2);
            case 5: // Проверка пола
                if (!human_info[5].equals("f") && !human_info[5].equals("m")) throw new StringCheck(-4);
        }
    }

    // Проверка на String и Integer
    public boolean checkString(String line) {
        try {
            Integer.valueOf(line);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Проверка на количество введённых данных:
    public void checkAmount(String[] human_info) {
        if (human_info.length < 6) throw new AmountCheck(-1);
        if (human_info.length > 6) throw new AmountCheck(-3);
    }

    // Проверка валидности даты:
    public boolean dateValidator(String date) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yyyy");
        myFormat.setLenient(false);
        try {
            myFormat.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Вывод списка:
    public void printPB(String[] human) {
        for (String s : human) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    // Запись в файл:
    public void writeFile(ArrayList<String> people, File file) {
        try (FileWriter writer = new FileWriter(file, true)) {
            for (String s : people) {
                writer.write("<" + s + ">");
            }
            writer.append('\n');
            writer.flush();
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
        // Чтение файла:
    public void readFile(File file) {
            try(FileReader reader = new FileReader(file)){;

            // Чтение данных из файла и вывод на консоль
            System.out.println("Содержимое файла:");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            // Закрытие FileReader после чтения данных
            reader.close();
            } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}
