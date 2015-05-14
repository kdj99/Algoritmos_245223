/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_11;

import java.util.Scanner;

/**
 * Programa que cuenta los multiplos de 3 desde 1 hasta un
 * numero ingresado por el usuario
 * @author Chuck
 */
public class Problema_11 {

    public static void main(String[] args) {
        int x = 0;
        int j = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Impresion de los multiplos de 3 que hay desde 1 "
                + "al numero que ingrese el usuario.");
        System.out.println("\nIngresa el numero para establecer el limite del "
                + "calculo de los multiplos de 3: ");
        x = in.nextInt();
        System.out.println("\nEstos son los multiplos de 3 dentro del "
                + "limite establecido por el usuario: ");
        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i = i + 1;
        }
    }
}
