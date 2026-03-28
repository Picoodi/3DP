package math.functions;

import math.classes.Line;
import math.classes.Point;
import math.classes.Vector;

public class Line_Functions {

    public static Line Line_between_points(Point point1, Point point2){
        return new Line(new Vector(point1.x,  point1.y, point1.z),
                Vector_Functions.vector_between_points(point1,point2));
    }

    public static boolean Point_on_Line(Point point, Line line){
        double l1 = (point.x - line.support_vector.x)/(line.direction_vector.x);
        double l2 = (point.y - line.support_vector.y)/(line.direction_vector.y);
        double l3 = (point.z - line.support_vector.z)/(line.direction_vector.z);
        return l1 - l2 == 0 && l2 - l3 == 0;
    }

    public static boolean kolinear_Lines(Line Line1, Line Line2){
        double r1 = Line1.direction_vector.x / Line2.direction_vector.x;
        double r2 = Line1.direction_vector.y / Line2.direction_vector.y;
        double r3 = Line1.direction_vector.z / Line2.direction_vector.z;

        return r1 == r2 && r2 == r3;
    }

    public static boolean identical_lines(Line Line1, Line Line2){
        return kolinear_Lines(Line1, Line2) && Point_on_Line(new Point(Line1.support_vector.x, Line1.support_vector.y, Line1.support_vector.z), Line2);
    }

    public static Point Intersecting_Point_Lines(Line Line1, Line Line2){
        if (kolinear_Lines(Line1, Line2)){
            System.out.println("Both dont intersect each other");
            return null;
        }
        else if (identical_lines(Line1, Line2)) {
            System.out.println("Lines are identical and are intersecting each other in every point");
            return null;
        }
        else{
            double A1 = Line1.support_vector.x;
            double B1 = Line2.support_vector.x;
            double A2 = Line1.support_vector.y;
            double B2 = Line2.support_vector.y;

            double g1 = Line1.direction_vector.x;
            double g2 =Line1.direction_vector.y;
            double h1 =Line2.direction_vector.x;
            double h2 = Line2.direction_vector.y;

            double mu = (A2 - B2 - ((g2 / g1) * (A1 - B1))) * (1.0 / (h1 * (g2 / g1) - h2));

            System.out.println(mu);

            return new Point(
                    Line2.support_vector.x + mu * Line2.direction_vector.x,
                    Line2.support_vector.y + mu * Line2.direction_vector.z,
                    Line2.support_vector.z + mu * Line2.direction_vector.z);
        }
    }
}