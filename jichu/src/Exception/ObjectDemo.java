package Exception;

import java.util.Objects;

public class ObjectDemo {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object o) {
//        if (o == null) {
//            throw new NullPointerException("传递的参数为null");
//        }
        Objects.requireNonNull(o,"传递的参数为null");
    }

}
