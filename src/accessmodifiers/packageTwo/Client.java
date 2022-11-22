package accessmodifiers.packageTwo;

import accessmodifiers.packageOne.Student;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        //student.name = "naman"; as name has default access modifier it cannot be accessed outside packageOne
        student.email = "naman@gmail.com";
    }
}
