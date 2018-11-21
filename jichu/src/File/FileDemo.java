package File;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File f1 = new File("D:\\Workspace\\Idea\\jichu\\src\\File\\a.txt");
        if (!f1.exists()) {
            try {
                f1.createNewFile();
                System.out.println("文件已创建");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(f1);

        File f2 = new File("D:\\Workspace\\Idea\\jichu\\src\\File");
        System.out.println(f2);

        File f3 = new File("a.txt");
        System.out.println(f3.getAbsolutePath());

        System.out.println(f3.exists());
        System.out.println(f2.exists());

    }
}
