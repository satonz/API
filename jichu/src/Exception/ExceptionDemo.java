package Exception;

/**
 * error不能处理的错误
 * exception可以进行处理的错误
 * 使用throw抛出异常是交给虚拟机处理(会程序中断)
 * try catch 自己处理 会继续执行下面的代码
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int e = getElement(arr, 3);//ArrayIndexOutOfBoundsException: 3
        System.out.println(e);
    }

    public static int getElement(int[] arr, int index) {
        int ele = arr[index];
        return ele;
    }
}
