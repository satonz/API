package File;

/*
递归一定要有结束条件并且次数不能太多  否则会发生栈内存溢出异常
 */
public class digui {
    public static void main(String[] args) {
//        a();//java.lang.StackOverflowError
        int sum = sum(10);
        System.out.println(sum);
    }

    private static int sum(int n) {
        if (n == 1) {
            return 1;

        }
        return n + sum(n - 1);

    }

    private static void a() {
        System.out.println("zhang");
        a();
    }
}
