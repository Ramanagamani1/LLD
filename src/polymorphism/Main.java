package polymorphism;

import java.util.List;

public class Main {

    public static  void changePasswordOfAllUsers(List<User> users) {
         for(User user: users) {
             user.changeEmail();

             if(user instanceof Student) {
                 System.out.println("Iam a student");
                 Student student = (Student) user;
                 student.changeBatch();
             }
         }
    }
    public static void main(String[] args) {
        User user = new TA(); // for compiler user type is user
        //user.expertise =" Java"; -> not possible as user object can access only attributes of user
        User user1 = new Student();
        user1.changeEmail();
        User user2 = new Mentor();
        User user3 = new User();

        List<User> users = List.of(
                user1,
                user2,
                user3,
                user,
                new Student(),
                new Mentor()
        );
        changePasswordOfAllUsers(users);
    }
}
