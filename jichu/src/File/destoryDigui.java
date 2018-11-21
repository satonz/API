package File;

import java.io.File;

public class destoryDigui {
    public static void main(String[] args) {
        File file = new File("D:\\Workspace\\Idea\\");
        diguiDestory(file);
    }

    private static void diguiDestory(File file) {
      //  System.out.println(file);
        File[] files = file.listFiles();
        for (File file1 : files)
            if (file1.isFile()) {
               // String name = file1.getName();
//                String s = name.toLowerCase();
                if (file1.getName().toLowerCase().endsWith(".java")) {
                    System.out.println(file1.getName());
                }
            } else {
                diguiDestory(file1);
            }
    }

}
