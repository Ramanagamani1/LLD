package designpatterns.creational.builder.approachone;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private String name;

    public UserExam(UserExamParameters userExamParameters) {
        if(userExamParameters.englishMarks> 100 || userExamParameters.mathsMarks>100 || userExamParameters.scienceMarks>100) {
            throw new InvalidParameterException("Marks can't be greater than 100");
        }

        if(userExamParameters.name.startsWith("O")){
            throw  new InvalidParameterException("Name can't start with O");
        }

        if(userExamParameters.englishMarks + userExamParameters.mathsMarks > 150){
            throw new InvalidParameterException("Maths and English marks total must not be greater than 150");
        }

        this.englishMarks = userExamParameters.englishMarks;
        this.name = userExamParameters.name;
        this.mathsMarks = userExamParameters.mathsMarks;
        this.scienceMarks = userExamParameters.scienceMarks;
    }

}
