package week2.Task3;

public class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double height, double radius) {
        this.height = height;
        super.radius = radius;
        super.volume = height * radius;
    }
}
