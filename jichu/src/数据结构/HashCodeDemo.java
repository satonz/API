package 数据结构;

public class HashCodeDemo {
    public static void main(String[] args) {
        Person person = new Person();
        int i = person.hashCode();
        System.out.println(i);

        Person person1 = new Person();
        int i1 = person1.hashCode();
        System.out.println(i1);
        System.out.println(person==person1);


        String s = new String("123");
        int i2 = s.hashCode();
        System.out.println(i2);
    }
}
