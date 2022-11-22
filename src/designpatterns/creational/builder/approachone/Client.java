package designpatterns.creational.builder.approachone;

public class Client {
    public static void main(String[] args) {
        UserExamParameters parameters = new UserExamParameters();
        parameters.englishMarks = 120;
        parameters.name = "Mani";

        UserExam userExam ;
        try {
            userExam = new UserExam(parameters);
        }
        catch(Exception e){
            System.out.println("Some parameters are wrong");
        }

        // But here we cannot validate attributes before object creation
//        UserExam userExam1 = new UserExam();
//        userExam1.setName("Mani");
    }
}
