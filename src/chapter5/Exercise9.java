package chapter5;

public class Exercise9 {
    int age;
    String name;

    public Exercise9(String name) {
        this.name = name;
    }

    public Exercise9(int age, String name) {
        this(name);
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println(new Exercise9(9, "xiaoqiang").name);
    }
}
