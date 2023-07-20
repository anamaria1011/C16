package co.com.ps.c3;

import java.util.Scanner;
//Calculadora sin interface//
public class Calculadora {

    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Leer un número entero desde el teclado
        System.out.print("Ingrese num1: ");//escribir
        int num1 = scanner.nextInt();//Leer

        // Leer una cadena de caracteres desde el teclado
        System.out.print("Ingrese num2 ");
        int num2 = scanner.nextInt();//Leer

        int sum1= num1+num2;
        int res1= num1-num2;
        int mult1= num1*num2;
        int div1= num1/num2;


        System.out.println("El resultado de la suma de las constantes es, "+sum1);
        System.out.println("El resultado de la resta de las constantes es, "+res1);
        System.out.println("El resultado de la multiplicacion de las constantes es, "+mult1);
        System.out.println("El resultado de la division de las constantes es, "+div1);

        // Cerrar el objeto Scanner

    }
}


