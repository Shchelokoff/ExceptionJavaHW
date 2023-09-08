package homework3;

public class StringCheck extends NumberFormatException {
    public StringCheck(int error) {
        switch (error) {
            case -1:
                    System.out.println("Неккоректен формат ввода введённых данных. В ФИО должны быть только буквенные значения.");
            case -2:
                    System.out.println("Неккоректен формат ввода введённых данных. При вводе номера телефона должны быть только числовые значения.");
            case -3:
                    System.out.println("Неккоректен формат ввода введённых данных. Дата должна быть в формате: dd.mm.yyyy");
            case -4:
                    System.out.println("Неккоректен формат ввода введённых данных. Здесь нужно вводить либо f, либо m.");
        }
    }
}
