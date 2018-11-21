package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("jichu\\src\\IO\\zhnag.txt");
        int i = 0;
        while ((i=input.read()) != -1) {

            System.out.println((char)i);

        }
        input.close();
    }
}
