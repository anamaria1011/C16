package co.com.ps.c6;

public class TrabajoEnClase {
    public static void main(String[] args) {


        int [] numeros =new int[11];
        numeros [0]= 1;
        numeros [1]= 2;
        numeros [2]= 5;
        numeros [3]= 5;
        numeros [4]= 3;
        numeros [5]= 6;
        numeros [6]= 4;
        numeros [7]= 8;
        numeros [8]= 9;
        numeros [9]= 5;
        numeros [10]= 1;

        int mayor=numeros[0];
        int menor=numeros[0];


        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            System.out.println("El menor número es: " + menor);
            System.out.println("El mayor número es: " + mayor);
        }

    }
}