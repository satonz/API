package API;

public class StringBuliderTest {
    public static  void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("s");
        stringBuilder.append(12);
        System.out.println(stringBuilder);
        StringBuilder bulider = new StringBuilder();
        System.out.println(stringBuilder.equals(bulider));
        System.out.println(stringBuilder.toString());

        StringBuilder bu2 = stringBuilder.append("123");
        System.out.println(bu2);
        System.out.println(bu2.equals(stringBuilder));
    }
}
