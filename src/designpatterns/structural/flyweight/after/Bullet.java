package designpatterns.structural.flyweight.after;

public class Bullet {
    private double radius;
    private double weight;
    private BulletType bulletType;
    private byte[] image;

    public double getRadius() {
        return radius;
    }

    public double getWeight() {
        return weight;
    }

    public BulletType getBulletType() {
        return bulletType;
    }

    public byte[] getImage() {
        return image;
    }

    public void setBulletType(BulletType type) {
        this.bulletType = type;
    }
}
