package Exception;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
    自定义异常类
    自定义异常必须继承exception或者runtimeexception

 */
public class zidingyiException {
    public static void main(String[] args) throws zidinyiException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要注册的用户名:");
        String s = scanner.next();

        ArrayList<String> username = new ArrayList<>();
        username.add("张三");
        username.add("李四");
        username.add("王五");
        int is =0;
        Iterator<String> it = username.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(s)) {
                throw new zidinyiException("该用户已被注册");
            }
        }
        if (is == 0) {
            System.out.println("注册成功");
        }

    }

    public static class  zidinyiException extends Exception{
        public zidinyiException() {
            super();
        }

        public zidinyiException(String s) {
            super(s);
        }
    }
}
