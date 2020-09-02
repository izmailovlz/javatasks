package week2.Task3;

public class Box extends Shape {
    private double shapesVolumeInside;

    public Box(double volume) {
        this.volume = volume;
    }

    public boolean add(Shape shape) {
        if ((shapesVolumeInside + shape.getVolume()) < this.volume) {
            shapesVolumeInside += shape.getVolume();
            return true;
        } else return false;
    }

    public double getShapesVolumeInside() {
        return shapesVolumeInside;
    }
}
