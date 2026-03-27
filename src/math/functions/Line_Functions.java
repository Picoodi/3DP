package math.functions;

import math.classes.Line;
import math.classes.Point;
import math.classes.Vector;

public class Line_Functions {

    public static Line Line_between_points(String name, Point point1, Point point2){
        return new Line( name,
                new Vector("", point1.x,  point1.y, point1.z,0,0,0),
                Vector_Functions.vector_between_points(point1,point2, ""));
    }

    public static boolean Point_on_Line(Point point, Line line){
        double l1 = (point.x - line.support_vector.x)/(line.direction_vector.x);
        double l2 = (point.y - line.support_vector.y)/(line.direction_vector.y);
        double l3 = (point.z - line.support_vector.z)/(line.direction_vector.z);
        return l1 - l2 == 0 && l2 - l3 == 0;
    }
}