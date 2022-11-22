package designpatterns.creational.builder.approachtwo;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private String name;

    private UserExam() {}

    public static UserExamBuilder getBuilder() {
        return new UserExamBuilder();
    }

    public static class UserExamBuilder {
        private int englishMarks;
        private int mathsMarks;
        private int scienceMarks;
        private String name;

        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public UserExamBuilder setMathsMarks(int mathsMarks) {
            this.mathsMarks = mathsMarks;
            return this;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserExam build() {
            // Step1 : validate the attributes
            if(englishMarks> 100 || mathsMarks>100 || scienceMarks>100) {
                throw new InvalidParameterException("Marks can't be greater than 100");
            }

            if(name.startsWith("O")){
                throw  new InvalidParameterException("Name can't start with O");
            }

            if(englishMarks + mathsMarks > 150){
                throw new InvalidParameterException("Maths and English marks total must not be greater than 150");
            }

            // Step2: create an object
            UserExam userExam = new UserExam();
            userExam.englishMarks = this.englishMarks;
            userExam.mathsMarks = this.mathsMarks;
            userExam.scienceMarks = this.scienceMarks;
            userExam.name = this.name;

            return userExam;
        }

    }

}

// A static class means you can access this class without creating an object