package lab04;

public class A {

    public A() { 
        System.out.println("A constructor called");
    }
    public A(String msg) {
        System.out.println(msg);
    }
    public A(String msg1, String msg2) {
        this(msg1 + ',' + msg2);
        System.out.println("A 2-param constructor called");
    }
    public void instanceMethod1() {
        System.out.println("A INSTANCE method1 called");
    }
    public void instanceMethod2() {
        System.out.println("A INSTANCE method2 called");
    }
    public static void staticMethod() {
        System.out.println("A STATIC method2 called");
    }

}