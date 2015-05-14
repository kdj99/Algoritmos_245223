/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_32;

import java.util.Scanner;

/**
 * Programa que comprueba si es primo un numero ingresado por el usuario,
 * encuentra su factorial e imprime su tabla de multiplicar.
 * @author Chuck
 */
public class Problema_32 {

    public static void main(String[] args) {
        int numero, resultado_mult, a = 0, res = 1, factorial;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        numero = in.nextInt();
        for (int i = 1; i < (numero + 1); i++) {
            if (numero % i == 0) {
                a++;
            }
        }
        if (a == 2) {
            System.out.println("El numero ingresado Primo\n");
        } else {
            System.out.println("El numero ingresado no es primo");
        }
        factorial = 1;
        if (numero < 0) {
            System.out.println("No tiene factorial");
        } else {
            while (numero > 1) {
                factorial = factorial * numero;
                numero = numero - 1;
            }
        }
        System.out.println("Su factorial es: " + factorial);

        System.out.println("Tabla de multiplicar del numero");
        for (int i = 0; i <= 10; i++) {
            resultado_mult = numero * i;
            System.out.println(numero + " X " + i + "= " + resultado_mult);
        }
    }
}