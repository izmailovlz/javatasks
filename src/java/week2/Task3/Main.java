package week2.Task3;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(200);
        Cylinder cylinder = new Cylinder(20, 4);
        Ball ball = new Ball(3);
        Pyramid pyramid = new Pyramid(11, 6);
        System.out.println("Volume:"
                + "\n" + "box " + box.getVolume()
                + "\n" + "cylinder " + cylinder.getVolume()
                + "\n" + "pyramid " + pyramid.getVolume()
                + "\n" + "ball " + ball.getVolume());
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
        System.out.println(box.add(ball));
        System.out.println(box.getShapesVolumeInside());
    }

}
