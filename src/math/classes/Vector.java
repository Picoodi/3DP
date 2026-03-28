package math.classes;

public class Vector {
    public double x,y,z;
    public double rep_x,rep_y,rep_z;

    public Vector(double x_coordinate, double y_coordinate, double z_coordinate){
        this.x = x_coordinate;
        this.y = y_coordinate;
        this.z = z_coordinate;
    }

    public void info(){
        System.out.println("Coordinates: " + x + "|" + y + "|" + z + " | Type: Vector");
    }
}