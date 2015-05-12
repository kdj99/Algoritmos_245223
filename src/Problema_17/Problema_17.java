/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_17;

import java.util.Scanner;

/**
 *
 * @author Chuck
 */
public class Problema_17 {

    public static void main(String[] args) {
        int res = 1;
        while (res == 1) {
            Scanner in = new Scanner(System.in);
            int c = 0;
            int sum = 0;
            int num1 = 0;
            int num2 = 0;
            System.out.println("Ingresa numero: ");
            num1 = in.nextInt();
            System.out.println("Ingresa numero mayor que el anterior: ");
            while (num1 >= num2) {
                num2 = in.nextInt();
            }
            num1 = num1 + 1;
            while (num1 <= num2) {
                if (num1 % 2 == 0) {
                    System.out.println("\n" + num1);
                    c = c + 1;
                    sum = sum + num1;
                }
                num1 = num1 + 1;
            }
            System.out.println("\n Numero de multiplos de 2: " + c);
            System.out.println("\n La suma es: " + sum);

            System.out.println("\nOtra serie de numeros (1=si/2=no)");
            res = in.nextInt();
        }
    }
}
