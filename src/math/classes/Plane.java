package math.classes;

public class Plane {
    public String name;
    public Point support_vector;
    public Vector plane_vector1;
    public Vector plane_vector2;
    public Vector normal_vector;

    public Plane(String name, Point support_vector, Vector plane_vector1, Vector plane_vector2, Vector normal_vector){
        this.name = name;
        this.support_vector = support_vector;
        this.plane_vector1 = plane_vector1;
        this.plane_vector2 = plane_vector2;
        this.normal_vector = normal_vector;
    }
}