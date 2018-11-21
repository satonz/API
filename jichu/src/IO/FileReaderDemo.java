package IO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("jichu\\src\\IO\\zhnag.txt");
        char[] ch = new char[10];
        int len = 0;
        while ((len = fr.read(ch)) != -1) {
            System.out.println(new String(ch, 0, len));
        }
    }
}
