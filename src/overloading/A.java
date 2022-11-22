package overloading;

public class A {

    public void print() {
        System.out.println("Helloo world");
    }

    public void print(String name) {
        System.out.println("Hello "+name);
    }
    //  not possible as return type will not play role in deciding overloading. this will not be possible at compile time as compiler doesnt know which method to call
//    public String print(String name) {
//        System.out.println("Hello from String return type "+name);
//    }
}
