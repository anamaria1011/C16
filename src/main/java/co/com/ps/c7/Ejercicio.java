package co.com.ps.c7;

//Dado un arreglo {4,2,6,2,3,5} ordenar de menor a mayor

import java.util.Arrays;

public class Ejercicio {

    public static void main(String[] args) {
        int[] datos = new int[6];
        datos[0] = 4;
        datos[1] = 2;
        datos[2] = 6;
        datos[3] = 2;
        datos[4] = 3;
        datos[5] = 5;

        int vari = 0;

        for (int i = 0; i < datos.length; i++) {
            for (int j = 1; j < (datos.length - i); j++) {
                if (datos[j - 1] > datos[j]) {
                    vari = datos[j - 1];
                    datos[j - 1] = datos[j];
                    datos[j] = vari;
                }
            }
        }
        System.out.println(Arrays.toString(datos));
    }
}