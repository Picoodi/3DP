package math.classes;

public class Vector {
    public String name;
    public double x,y,z;
    public double rep_x,rep_y,rep_z;

    public Vector(String Name, double x_coordinate, double y_coordinate, double z_coordinate, double rep_x, double rep_y, double rep_z){
        this.name = Name;
        this.x = x_coordinate;
        this.y = y_coordinate;
        this.z = z_coordinate;

        //In Mathematics often we want a specific representative of a vector
        //Later that will also be important for drawing the vector
        //For that we additionally add coordinates of a starting point for the vector
        this.rep_x = rep_x;
        this.rep_y = rep_y;
        this.rep_z = rep_z;

    }

    public void info(){
        System.out.println("Name:" + this.name + " | Coordinates: " + x + "|" + y + "|" + z + " | Type: Vector");
    }
}