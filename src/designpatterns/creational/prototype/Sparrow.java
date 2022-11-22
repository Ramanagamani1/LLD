package designpatterns.creational.prototype;

public class Sparrow extends Bird{
    private String legSize;

    public Sparrow() {

    }

    public Sparrow(Sparrow old) {
        super(old);
        this.legSize = old.legSize;
    }

    public void setLegSize(String legSize) {
        this.legSize = legSize;
    }

    @Override
    public Sparrow clone() {
        return new Sparrow(this);
    }
}
