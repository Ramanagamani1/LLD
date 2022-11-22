package designpatterns.creational.prototype;

public class Bird implements Cloneable<Bird>{
    private String name;
    private String color;
    private int weight;

    public Bird() {}

    public Bird(Bird old) {
        this.name = old.name;
        this.color = old.color;
        this.weight = old.weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public Bird clone() {
        /* This solution only works when the class that I am cloning is the parent class
        Bird copy = new Bird();
        copy.color = this.color;
        copy.name = this.name;
        copy.weight = this.weight;
        return copy; */
       return new Bird(this);
    }
}
