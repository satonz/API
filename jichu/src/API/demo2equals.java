package API;

public class demo2equals {
    public static void main(String[] args) {
        person p1 = new person("zhangsn",18);
        person p2 = new person("lisi",19);
        System.out.println(p1);
        System.out.println(p2);
        p1=p2;
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));

        String s = "zhang";
        String z = "zhang";
        System.out.println(s.toString());
        System.out.println(z.toString());
        System.out.println(s==z);
        System.out.println(s.equals(z));
        
    }
}
