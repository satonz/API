package File;

import java.io.File;

public class FileBianli {
    public static void main(String[] args) {
        File file = new File("D:\\Workspace\\Idea\\jichu\\src\\");
        File[] arr = file.listFiles();
        for (File s : arr) {
            System.out.println(s);
        }
    }
}
