/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_10;

import java.util.Scanner;

/**
 * Programa que indica si el numero ingresado es impar o par
 * @author Chuck
 */
public class Problema_10 {

    public static void main(String[] args) {
        int x = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe un numero para saber si es impar o si es par: ");
        x = in.nextInt();
        if (x % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }
}
