package abstractclasses;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.setName("mani");
        //instructor.description = "Super cool";
        instructor.setDescription("Super Cool");
        instructor.saySomething();
        //User user = new User();
       // user.name = "karthik";

        Mentor mentor = new Mentor();
//        mentor.name = "Abhimanyu";
//        mentor.description = "Boss";
//        mentor.email = "abhi@gmail.com";
    }
}
