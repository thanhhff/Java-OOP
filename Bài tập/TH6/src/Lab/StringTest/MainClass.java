
package Lab.StringTest;

class A {
    public A(int i) {
        System.out.println(1);
    }

    public A() {
        this(10);
        System.out.println(2);

    }

    void A() {
        A(10);
        System.out.println(3);
    }

    void A(int i) {
        System.out.println(4);
    }
}

class ClassOne {
    void method(String s1) {
        method(s1, s1+s1);
    }

    void method(String s1, String s2) {
        method(s1, s2, s1 + s2);
    }

    void method(String s1, String s2, String s3) {
        System.out.println(s1 + s2 + s3);
    }
}

public class MainClass {
    public static void main(String[] args) {
        ClassOne one = new ClassOne();
        one.method("JAVA");

        new A().A();
    }

}