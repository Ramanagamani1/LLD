package designpatterns.creational.builder.approachtwo;

public class Client {
    public static void main(String[] args) {

        UserExam userExam;
        try {
            userExam = UserExam.getBuilder()
                .setName("Mani")
                .setEnglishMarks(20)
                .setMathsMarks(40)
                .build();

            // MethodChaining

            /*
                 UserExam userExam = UserExam.getBuilder()
                        .setEnglishMarks(12)
                        .setMathsMarks(20)
                        .build()
             */
        } catch (Exception exception) {
            System.out.println("Some parameters are wrong");
        }
    }
}
