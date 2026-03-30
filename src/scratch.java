import math.classes.*;
import math.functions.*;


class Scratch {
    static void main(String[] args) {
        Point a = new Point(0,0,0);
        a.info();

        Plane E = new Plane(null, null, null,
                new Vector(1,2,4),
                12);

        Plane F = new Plane(null, null, null,
                new Vector(6,-3,4),
                12);


        Line g = Plane_Functions.Line_of_intersection(E,F);

        //System.out.println(g.support_vector.x);
        //System.out.println(g.support_vector.y);
        //System.out.println(g.support_vector.z);

        //System.out.println(g.direction_vector.x);
        //System.out.println(g.direction_vector.y);
        //System.out.println(g.direction_vector.z);

        Point b = new Point(4,7,5);
        Point c = new Point(2,4,6);

        Line v = Line_Functions.Line_between_points(a, c);
        Line u = Line_Functions.Line_between_points(b, a);
        Line i = new Line(new Vector(c.x,c.y,c.z),Vector_Functions.vector_between_points(a,b));

        boolean kolinear = Line_Functions.kolinear_Lines(u,i);
        boolean identical = Line_Functions.identical_lines(u,i);

        System.out.println(kolinear);
        System.out.println(identical);

        Line m = new Line(new Vector(1,0,2),new Vector(2,1,0));
        Line n = new Line(new Vector(3,1,2),new Vector(0,1,1));

        Point Intersection = Line_Functions.Intersecting_Point_Lines(m,n);
        Intersection.info();

        boolean point_in_plane = Plane_Functions.Point_in_Plane(new Point(12, 0, 0), E);
        System.out.println(point_in_plane);

        Plane plane = new Plane(new Point(0,0,0),
                new Vector(1,1,1),
                new Vector(3,2,1),null,0);

        Line d = new Line(new Vector(1,0,0),
                new Vector(1,1,1));

        boolean id = math.functions.Plane_Functions.Line_in_Plane(d,plane);
        System.out.println(id);

        Plane s = new Plane(null,null,null,
                new Vector(-3,0,2),
                12);

        Line s1 = new Line(new Vector(9,8,7), new Vector(2,3,1));

        Point idd = math.functions.Plane_Functions.Point_of_intersection_Line_Plane(s1,s);
        idd.info();
    }
}