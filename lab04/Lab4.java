package lab04;

public class Lab4 {
    public static void main(String[] args) {
        // B b = new B();
        // B bb = new B("pass this msg from B to A");
        // A a = new A("msg1: The 2-param constructor of A uses \"this\" ",
        //             "msg2 to call the 1-param constructor of A ");

        A a1 = new A();
        B b1 = new B();

        a1.instanceMethod1();
        a1.instanceMethod2();
        A.staticMethod();

        b1.instanceMethod1();
        b1.instanceMethod2();
        B.staticMethod();

        
    }
}