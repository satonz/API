package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopayDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("jichu\\src\\IO\\1.jpg");
        FileOutputStream fos = new FileOutputStream("jichu\\src\\IO\\2.jpg");
        byte[] bytes = new byte[1024];
        int len = 0;
        long s = System.currentTimeMillis();
        while (-1 != (len = fis.read(bytes))) {
            fos.write(bytes,0,len);
        }
        long e = System.currentTimeMillis();
        System.out.println("复制耗时:"+(e-s)+"毫秒");
        fos.close();
        fis.close();
    }
}
