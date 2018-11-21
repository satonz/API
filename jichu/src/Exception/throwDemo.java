package Exception;

public class throwDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        int e = getElement(arr, 3);
        System.out.println(e);
    }

    public static int getElement(int[] arr, int index) {
        /*
            先对传递的参数进行合法性检验
         */
        if (arr == null) {
            throw new NullPointerException("传递的数组为空");
        }

        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("数组索引越界");
        }
        int ele = arr[index];
        return ele;
    }
}
