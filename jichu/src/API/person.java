package API;

public class person {
    public String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return
     */
    public String toString() {
        return "API.person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
