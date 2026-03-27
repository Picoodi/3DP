package math.classes;

public class Line {
    public String name;
    public Vector support_vector;
    public Vector direction_vector;

    public Line(String Name, Vector support_vector, Vector direction_vector){
        this.name = Name;
        this.support_vector = support_vector;
        this.direction_vector = direction_vector;
    }
}