package constructors;

public class Main {
    public static void main(String[] args) {
        Student karthik = new Student("Karthik", "Scelrverse"); // Constructor
        karthik.age = 18;
        karthik.state = "ACTIVE";
        Batch batch = new Batch("Nov21",50);
        karthik.batch = batch;
        /*karthik.pauseCourse();;
        karthik.karthik(); // Method called karthik in student

        Student naman = new Student("Naman", null);
        naman.batch = "Best batch of Scaler";
        naman.karthik();

        System.out.println("Doing Something");

        Student prakash = new Student();*/

        Student karthikCopy = new Student(karthik);
        System.out.println("Random");

        System.out.println("------- Constructor Copy Same Valyes ----");
        System.out.println(karthik.age);
        karthikCopy.age = 21;
        System.out.println(karthik.age);
        System.out.println(karthik.name);
        karthikCopy.name = "naman";
        System.out.println(karthik.name);
        System.out.println(karthikCopy.name);
        karthikCopy.batch.name= "Dec21";
        System.out.println(karthikCopy.batch.name);
        System.out.println(karthik.batch.name);
    }
}
