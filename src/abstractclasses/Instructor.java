package abstractclasses;

public class Instructor extends User {
    private String description;
    private String assignedBatch;

    Instructor() {
        super("Instructor");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignedBatch() {
        return assignedBatch;
    }

    public void setAssignedBatch(String assignedBatch) {
        this.assignedBatch = assignedBatch;
    }

    @Override
    void saySomething() {
        System.out.println("Solve your assignments");
    }
}
