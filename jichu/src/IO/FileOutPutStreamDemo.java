package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutPutStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("jichu\\src\\IO\\zhnag.txt",true);//true表示可以追加写入
            outputStream.write(97);
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("写入成功");
        }


    }
}
