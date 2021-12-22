package aula1.pratica2;
/*
 Dado um vetor de 10 posicoes, preenchido pelos valores
 52, 10, 85, 1324, 01, 13, 62, 30, 12 e 127.

 Imprima no console:
 a) Sua ordenacao crescente.
 b) Sua ordenacao decrescente.
*/

import java.util.Arrays;
import java.util.Collections;

public class Exercicio2_1 {
    private static final Integer[] array = {52, 10, 85, 1324, 1, 13, 62, 30, 12, 127};

    public static void main(String[] args) {
        Arrays.sort(array);
        for ( Integer i: array) {
            System.out.println(i.intValue());
        }
        Arrays.sort(array, Collections.reverseOrder());
        for ( Integer i: array) {
            System.out.println(i.intValue());
        }
    }
}
