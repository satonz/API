package API;

import com.sun.media.jfxmedia.events.NewFrameEvent;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class demotostring {

    public static void main(String[] args) {
        person person = new person("zhang",18);
        String s = person.toString();
        System.out.println(s);
        System.out.println(person);

        Random random = new Random();
        System.out.println(random);

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list);
    }
}
