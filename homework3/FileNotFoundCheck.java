package homework3;

import java.io.FileNotFoundException;

public class FileNotFoundCheck extends FileNotFoundException{
    public FileNotFoundCheck(String path) {
        super("Такого файла не существует: " + path);
    }

    public FileNotFoundCheck() {
        super("Такого файла не существует.");
    }
}
