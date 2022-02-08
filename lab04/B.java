package lab04;

class B extends A {

    public B() {
        System.out.println("B constructor called");
    }
    public B(String msg) {
        super(msg);
        System.out.println("B constructor called");
    }
    public void instanceMethod1() {
        System.out.println("B---instance method1 called");
        super.instanceMethod1();
    }
}
