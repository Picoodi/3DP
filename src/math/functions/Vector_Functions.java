package math.functions;

import math.classes.Point;
import math.classes.Vector;

import java.util.ArrayList;
import java.util.List;

public class Vector_Functions {

    public static double magnitude(Vector vector){
        return Math.sqrt(Math.pow(vector.x ,2) + Math.pow(vector.y, 2) + Math.pow(vector.z, 2));
    }

    public static Vector vector_between_points(Point point1, Point point2, String name){
        return new Vector( name,
                point2.x - point1.x,
                point2.y - point1.y,
                point2.z - point1.z,
                point1.x, point1.y, point1.z); //Representative is point1
    }

    public static void scalar_multiplication(Vector vector, double number){
        vector.x = vector.x * number;
        vector.y = vector.y * number;
        vector.z = vector.z * number;
    }

    public static Vector opposite_vector(Vector vector, String name){
        double x = vector.x * -1;
        double y = vector.y * -1;
        double z = vector.z * -1;
        return new Vector(name,x,y,z,vector.rep_x + vector.x, vector.rep_y + vector.y, vector.rep_z + vector.z);
    }

    public static Vector vector_addition(Vector vector1, Vector vector2, String name){
        return new Vector(name,
                vector1.x + vector2.x,
                vector1.y + vector2.y,
                vector1.z + vector2.z,
                0,0,0); //No representative
    }

    public static Vector vector_subtraction(Vector vector1, Vector vector2, String name){
        return new Vector(name,
                vector1.x - vector2.x,
                vector1.y - vector2.y,
                vector1.z - vector2.z,
                0,0,0); //No representative
    }

    public static double scalar_product(Vector vector1, Vector vector2) {
        return vector1.x * vector2.x + vector1.y * vector2.y + vector1.z * vector2.z;
    }

    public static Vector cross_product( Vector vector1, Vector vector2, String name){
        return new Vector(name,
                vector1.y * vector2.z - vector1.z * vector2.y,
                vector1.z * vector2.x - vector1.x * vector2.z,
                vector1.x * vector2.y - vector1.y * vector2.x,
                0,0,0); //No representative
    }

    public static boolean linearly_dependent(Vector v1, Vector v2, Vector v3) {
        List<List<Double>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(List.of(v1.x, v2.x, v3.x, 0.0)));
        matrix.add(new ArrayList<>(List.of(v1.y, v2.y, v3.y, 0.0)));
        matrix.add(new ArrayList<>(List.of(v1.z, v2.z, v3.z, 0.0)));

        matrix = Gauss.matrix_zeros(matrix);  // Gauß durchlaufen

        int zeilen_max = matrix.size();
        int spalte_max = matrix.get(0).size();
        int rang = 0;

        // Zähle NUR-Null-Zeilen
        for (List<Double> doubles : matrix) {
            boolean istNullZeile = true;
            for (double val : doubles) {
                if (Math.abs(val) > 1e-10) {
                    istNullZeile = false;
                    break;
                }
            }
            if (!istNullZeile) rang++;
        }

        return rang < spalte_max - 1;  // Rang < Vektoranzahl
    }
}
