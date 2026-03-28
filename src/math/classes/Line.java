package math.classes;

public class Line {
    public Vector support_vector;
    public Vector direction_vector;

    public Line(Vector support_vector, Vector direction_vector){
        this.support_vector = support_vector;
        this.direction_vector = direction_vector;
    }
}