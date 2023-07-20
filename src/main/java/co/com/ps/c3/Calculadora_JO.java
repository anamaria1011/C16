package co.com.ps.c3;

import javax.swing.*;

public class Calculadora_JO {

    public static void main(String[] args) {
        // Mostrar un mensaje de diálogo
        JOptionPane.showMessageDialog(null, "Hola bienvenido a la calculadora");

        // Obtener una entrada de texto del usuario
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa n1"));

        // Obtener una entrada de texto del usuario
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa n2"));

        int sum1= num1+num2;
        int res1= num1-num2;
        int mult1= num1*num2;
        int div1= num1/num2;

        // Realizar una verificación utilizando el valor ingresado
            JOptionPane.showMessageDialog(null, "El resultado de la suma es:" +sum1);
            JOptionPane.showMessageDialog(null, "El resultado de la resta es:"+res1);
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es:"+mult1);
            JOptionPane.showMessageDialog(null, "El resultado de la division es:"+div1);

    }
}

