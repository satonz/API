package 数据结构;

public class Changeargs {
    public static void main(String[] args) {
        int[] arr = {1, 5, 45, 26, 548, 25, 6};
        int sum = getSum(arr);
        System.out.println(sum);

    }

    private static int getSum(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;

        }
        return sum;
    }

}
