import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        getNumFloat();
    }
    
    public static void getNumFloat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        
        try{
            String input = scanner.nextLine();
            
            if (input.contains(".")) {
                float number = Float.parseFloat(input);
                System.out.println("Введенное число: " + number + " (тип float)");
            } else {
                System.out.println("Вы ввели не дробное число!");
                getNumFloat();
            }
        } catch(Exception e) {
            System.out.println("Вы ввели не дробное число!");
            getNumFloat();
        } finally {
            scanner.close();
        }
    }
}