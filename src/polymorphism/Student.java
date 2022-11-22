package polymorphism;

public class Student extends User{
    String batch;
    double psp;
    Mentor mentor;

    void changeEmail() {
        System.out.println("Changing Email in Student");
    }
    void changeBatch() {

    }
}
