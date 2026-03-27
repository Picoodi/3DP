package math.classes;

public class Point {
    public String name;
    public double x,y,z;

    public Point(String Name, double x_coordinate, double y_coordinate, double z_coordinate){
        this.name = Name;
        this.x = x_coordinate;
        this.y = y_coordinate;
        this.z = z_coordinate;
    }

    public void info(){
        System.out.println("Name:" + this.name + " | Coordinates: " + x + "|" + y + "|" + z + " | Type: Point");
    }
}