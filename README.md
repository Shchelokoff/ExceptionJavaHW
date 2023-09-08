# Репозиторий домашних заданий курса "Исключения в программировании и их обработка"
## **homework2 (Домашнее задание к семинару 2)**

## 1. (task1) Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. 
## [ссылка на решение задачи][1]

## 2. (task2) Если необходимо, исправьте код [ссылка на код][5]
## [ссылка на решение задачи][2]
#### Отсутствовала точка входа в приложение - главный метод main:
```
    public static void main(String[] args){

    }
```
### Не был объявлен и проинициализирован массив intArray:
```
    int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
```
### Не были добавлены дополнительные исключения: 
```
    catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) 
```
## 3. (task3) Дан следующий код, исправьте его там, где требуется [ссылка на код][5]
## [ссылка на решение задачи][3]
#### Первый catch ловит всевозможные ошибки:
```
    catch (Throwable ex)
```
### Использование throws Exception в методе main не является правильным, так как это не рекомендуется для основного метода main:
```
   public static void main(String[] args) throws Exception
```
### Лишняя обработка, т.к. нулевых значений в коде не наблюдается:
```
   catch (NullPointerException ex) {
        System.out.println("Указатель не может указывать на null!");
   }
```
### Использование throws FileNotFoundException в методе printSum не является правильным, т.к. нет работы с файлами в коде:
```
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
    System.out.println(a + b);
}
```

## 4. (task4) Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
## [ссылка на решение задачи][4]

## **homework3 (Промежуточная аттестация)**
### Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
### Фамилия Имя Отчество датарождения номертелефона пол

### Форматы данных:
### фамилия, имя, отчество - строки
### датарождения - строка формата dd.mm.yyyy
### номертелефона - целое беззнаковое число без форматирования
### пол - символ латиницей f или m.

### Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

### Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

### Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида

### <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

### Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

### Не забудьте закрыть соединение с файлом.

### При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
## [ссылка на приложение][6]

[1]: <https://github.com/Shchelokoff/ExceptionJavaHW/blob/main/homework2/task1.java>
[2]: <https://github.com/Shchelokoff/ExceptionJavaHW/blob/main/homework2/task2.java>
[3]: <https://github.com/Shchelokoff/ExceptionJavaHW/blob/main/homework2/task3.java>
[4]: <https://github.com/Shchelokoff/ExceptionJavaHW/blob/main/homework2/task4.java>
[5]: <https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit>
[6]: <https://github.com/Shchelokoff/ExceptionJavaHW/tree/main/homework3>

