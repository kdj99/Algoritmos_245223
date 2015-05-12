/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema6;

import java.util.Scanner;

/**
 *
 * @author Chuck
 */
public class Problema6 {

    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Impresion de los numeros naturales que hay desde 1 "
                + "al numero que ingrese el usuario.");
        System.out.println("\nIngresa el numero para establecer el limite del "
                + "calculo de los numero naturales: ");
        x = in.nextInt();
        System.out.println("\nEstos son los numeros naturales dentro del "
                + "limite establecido por el usuario: ");
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }
}
