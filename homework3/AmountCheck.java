package homework3;

public class AmountCheck extends RuntimeException {
    public AmountCheck(int error) {
        switch (error) {
            case -1 -> System.out.println("Вы ввели меньше данных, чем нужно.");
            case -3 -> System.out.println("Вы ввели больше данных, чем нужно.");
        }
    }
}
