package designpatterns.creational.prototype;

public class Crow extends Bird{
    private String sound = "Kaw";

    public Crow() {

    }
    public Crow(Crow old) {
        super(old);
        this.sound = old.sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public Crow clone() {
        /*
             In this solution parents attributes are not copied
             Crow copy = new Crow();
             copy.sound = this.sound;
         */
        return new Crow(this);
    }
}
