package week2.Task2;

public final class Vector {
    private final double x;
    private final double y;
    private final double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static double scalarProduct(Vector v1, Vector v2) {
        return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
    }

    public static Vector vectorProduct(Vector v1, Vector v2) {
        return new Vector(v1.y * v2.z - v1.z * v2.y, v1.z * v2.x - v1.x * v2.z, v1.x * v2.y - v1.y * v2.x);
    }

    public static double corner(Vector v1, Vector v2) {
        return scalarProduct(v1, v2) / (v1.length() * v2.length());
    }

    public static Vector sum(Vector v1, Vector v2) {
        return new Vector(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public static Vector difference(Vector v1, Vector v2) {
        return new Vector(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }

    public static Vector[] vectorsArray(Integer n){
        Vector[] result = new Vector[n];
        for (int i=0; i< n; i++){
            result [i]= new Vector((int)(Math.random()*10), (int)(Math.random()*10),(int)(Math.random()*10));
        }
        return result;
    }
}
