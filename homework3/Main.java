package homework3;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundCheck {
        Server server = new Server();
        String filePath = "C:\\Users\\shche\\OneDrive\\\u0420\u0430\u0431\u043E\u0447\u0438\u0439 \u0441\u0442\u043E\u043B\\ExceptionJavaHW\\homework3\\phonebook.txt";
        String[] human_info;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Записать данные");
            System.out.println("2. Прочитать данные");
            System.out.println("3. Выход из приложения");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Чтение символа новой строки после ввода числа
            switch (choice) {
                case 1:
                    try {
                        File file = new File(filePath);
                        human_info = server
                                .prompt("Введите через пробел: ФИО, дату рождения, номер телефона и пол (f или m): ");
                        server.checkAmount(human_info);
                        for (int i = 0; i < human_info.length; i++) {
                            server.checkFormat(human_info, i);
                        }
                        ArrayList<String> people = new ArrayList<>(Arrays.asList(human_info));
                        server.writeFile(people, file);
                    } catch (RuntimeException e) {
                        System.out.println();
                    }
                    break;
                case 2:
                    File file = new File(filePath);
                    try {
                        server.readFile(file);
                    } catch (RuntimeException e) {
                        System.out.println();
                    }
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }
}