package week2.Task3;

public class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        this.volume = 0.33333 * s * h;
    }

}
