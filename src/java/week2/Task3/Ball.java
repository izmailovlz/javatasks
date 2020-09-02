package week2.Task3;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        this.volume = 1.33333 * Math.PI * Math.pow(radius, 3);
    }
}
