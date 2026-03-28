package math.classes;

public class Plane {
    public Point support_point;
    public Vector plane_vector1;
    public Vector plane_vector2;
    public Vector normal_vector;
    public double constant;

    public Plane(Point support_point, Vector plane_vector1, Vector plane_vector2, Vector normal_vector, double constant){
        this.support_point = support_point;
        this.plane_vector1 = plane_vector1;
        this.plane_vector2 = plane_vector2;
        this.normal_vector = normal_vector;
        this.constant = constant;

    }

    public void create_normal_form(){
        this.normal_vector = math.functions.Vector_Functions.cross_product(this.plane_vector1,this.plane_vector2);
        this.constant = -1 * math.functions.Vector_Functions.scalar_product(this.normal_vector,
                new Vector(this.support_point.x, this.support_point.y, this.support_point.z));
    }
}