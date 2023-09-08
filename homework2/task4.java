import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        printer();
    }
    public static void printer() {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Введите не пустую строку: ");
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                throw new RuntimeException("Пустые строки вводить нельзя.");
            } else {
                System.out.println(line);
                printer();
            }
        } 
    }
}