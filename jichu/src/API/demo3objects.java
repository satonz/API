package API;

import java.util.Objects;

public class demo3objects {
    public static void main(String[] args) {
        String s=null;
        String z="zhangsan";

        /**
         * 利用objects可以防止空指针异常
         */
        boolean equals1 = Objects.equals(s, z);
        System.out.println(equals1);

    }
}
