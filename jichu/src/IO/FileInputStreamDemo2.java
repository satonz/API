package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
//        demo1();
        FileInputStream input = new FileInputStream("jichu\\src\\IO\\zhnag.txt");
        byte[] bytes = new byte[1024];
        int len =0;
        while ((len = input.read(bytes)) != -1) {
            System.out.println(new String(bytes));
        }

    }

    private static void demo1() throws IOException {
        FileInputStream input = new FileInputStream("jichu\\src\\IO\\zhnag.txt");
        byte[] bytes = new byte[4];
        int read = input.read(bytes);
        System.out.println(read);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));

        read = input.read(bytes);
        System.out.println(read);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));

        read = input.read(bytes);
        System.out.println(read);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));
        input.close();
    }
}
