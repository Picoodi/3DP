package math.functions;

import java.util.Collections;
import java.util.List;

public class Gauss {

    public static List<List<Double>> matrix_zeros(List<List<Double>> matrix) {
        int zeilen_max = matrix.size();
        int spalte_max = matrix.get(0).size();

        // Klassische Gauß-Elimination: für jede Spalte s
        for (int s = 0; s < Math.min(zeilen_max - 1, spalte_max - 2); s++) {

            // PIVOT-SUCHE: Beste Zeile in Spalte s finden
            int pivot_zeile = s;
            for (int k = s + 1; k < zeilen_max; k++) {
                if (Math.abs(matrix.get(k).get(s)) > Math.abs(matrix.get(pivot_zeile).get(s))) {
                    pivot_zeile = k;  // Bessere Zeile
                }
            }
            // NULL-CHECK: Ist die jetzige Pivot Zeile brauchbar oder ist es teilen durch 0 oder fast 0
            if (Math.abs(matrix.get(pivot_zeile).get(s)) < 1e-10) {
                //Wenn es nicht weiter geht dann abbruch
                return matrix;
            }
            //Beste Zeile nach oben
            Collections.swap(matrix, s, pivot_zeile);


            // Alle Zeilen unter der jetzigen Zeile eliminieren
            for (int z = s + 1; z < zeilen_max; z++) {
                //Faktor zwischen Zeile nacher und jetziger Zeile berechnen
                double factor = matrix.get(z).get(s) / matrix.get(s).get(s);

                // Neue Zeile z := Zeile z - factor * Zeile s
                //für jedes Element j in dieser Zeile wird die neue Zahl berechnet und gesetzt
                for (int j = s; j < spalte_max; j++) {
                    double newValue = matrix.get(z).get(j) - factor * matrix.get(s).get(j);
                    matrix.get(z).set(j, newValue);
                }
            }
        }
        return matrix;
    }
}
