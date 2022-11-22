package overriding;

public class B extends A{

    void doSomething() {
        System.out.println("I am B");
    }

    int doSomething(String a) {
        System.out.println("I am B");
        return 1;
    }
}
