package math.classes;

public class Point {
    public double x,y,z;

    public Point(double x_coordinate, double y_coordinate, double z_coordinate){
        this.x = x_coordinate;
        this.y = y_coordinate;
        this.z = z_coordinate;
    }

    public void info(){
        System.out.println("Coordinates: " + x + "|" + y + "|" + z + " | Type: Point");
    }
}