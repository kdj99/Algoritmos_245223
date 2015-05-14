/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_20;

import java.util.Scanner;

/**
 *
 * @author Chuck
 */
public class Problema_20 {

    public static void main(String[] args) {

        int res = 1;
        int factorial;
        int numero;
        Scanner in = new Scanner(System.in);
        while (res == 1) {
            factorial = 1;
            System.out.println("Escriba numero: ");
            numero = in.nextInt();
            if (numero < 0) {
                System.out.println("No tiene factorial");
            } else {
                calculos(numero, factorial);
            }
        }
    }

    public static void calculos(int numero, int factorial) {

        while (numero > 1) {
            factorial = factorial * numero;
            numero = numero - 1;
        }
        imprimir(factorial);
    }

    private static void imprimir(int factorial) {
        System.out.println("Su factorial es: " + factorial);
    }

}
