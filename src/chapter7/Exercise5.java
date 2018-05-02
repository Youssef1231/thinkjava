package chapter7;
class A{
    public A() {
        System.out.println("A constructor run");
    }
}
class B{
    public B() {
        System.out.println("B constructor run");

    }
}

public class Exercise5 extends A {
    public static void main(String[] args) {
    B b=new B();
        Exercise5 ex = new Exercise5();
    }
}
