package File;

import java.io.File;

/**
 * 使用过滤器
 */
public class DestoryDiguiDemo {
    public static void main(String[] args) {
        File file = new File("D:\\Workspace\\Idea\\");
        getAllFile(file);
    }

    private static void getAllFile(File file) {
        File[] files = file.listFiles(new FileFilterImpl());
        for (File file1 : files) {
            if (file1.isDirectory()) {
                getAllFile(file1);
            } else {
                System.out.println(file1);
            }
        }
    }
}
