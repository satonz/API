package 数据结构;

import java.util.HashSet;

public class HashSetSavePerson {
    public static void main(String[] args) {
        Person person = new Person("zhang","18");
        HashSet<Person> set = new HashSet<>();
        Person person1 = new Person("zhang","19");
        Person person2 = new Person("zhang", "18");

        System.out.println(person);

        set.add(person);
        set.add(person1);
        set.add(person2);

        System.out.println(set);
    }
}
