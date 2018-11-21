package File;

import java.io.File;
import java.io.FileFilter;

/**
 * 使用过滤器
 */
public class DestoryDiguiDemo2 {
    public static void main(String[] args) {
        File file = new File("D:\\Workspace\\Idea\\");
        getAllFile(file);
    }

    /*private static void getAllFile(File file) {
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith("java");
            }
        });*/


    /*
    使用lambda表达式
     */
    private static void getAllFile(File file) {
        File[] files = file.listFiles(pathname -> pathname.isDirectory() || pathname.getName().toLowerCase().endsWith("java"));


        for (File file1 : files) {
            if (file1.isDirectory()) {
                getAllFile(file1);
            } else {
                System.out.println(file1);
            }
        }
    }
}
