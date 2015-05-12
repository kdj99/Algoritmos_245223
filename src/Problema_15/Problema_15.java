/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_15;

import java.util.Scanner;

/**
 *
 * @author Chuck
 */
public class Problema_15 {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int temp = 0;
        int son = 0;
        int pares = 0;
        int suma_imp = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el numero mayor: ");
        num1 = in.nextInt();
        System.out.println("Ingresa el numero menor: ");
        num2 = in.nextInt();
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        while (num1 <= num2) {
            System.out.println("\n" + num1);
            son = son + 1;
            if (num1 % 2 == 0) {
                pares = pares + 1;
            } else {
                suma_imp = suma_imp + num1;
            }
            num1 = num1 + 1;
        }
        System.out.println("Numeros visualizados: " + son);
        System.out.println("\nPares encontrados: " + pares);
        System.out.println("\nLa suma de numeros impares encontrados es: " + suma_imp);
    }
}
