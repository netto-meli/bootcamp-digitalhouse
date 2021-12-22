package aula2.pratica2.exercicio2;

import java.util.Arrays;

public class Utilidade {
    public static double areaMedia (FiguraGeometrica[] arr){
        return Arrays.stream(arr).mapToDouble(FiguraGeometrica::area).sum() / arr.length;
    }
}
