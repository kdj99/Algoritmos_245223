/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_25;

import java.util.Scanner;

/**
 *
 * @author Chuck
 */
public class Problema_25 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        do {
            System.out.print("Introduce un número entre 1 y 5000 para "
                    + "convertirlo a notacion en numeros romanos: ");
            N = in.nextInt();
        } while (N < 1 || N > 5001);
        System.out.println("El numero " + N + " en notacion romana es: " + convertir(N));
    }

    //método para pasar a números romanos
    public static String convertir(int numero) {
        int i = 0, miles, centenares, decenas, unidades;
        String romano = "";
        //obtenemos cada cifra del número
        miles = numero / 1000;
        centenares = numero / 100 % 10;
        decenas = numero / 10 % 10;
        unidades = numero % 10;

        //miles
        if (miles == 4) {
            romano = romano + "^IV";
        } else if (miles == 5) {
            romano = romano + "^V";
        } else if (i <= 3) {
            romano = romano + "M";
            i++;
        }

        //centenares
        if (centenares == 9) {
            romano = romano + "CM";
        } else if (centenares >= 5) {
            romano = romano + "D";
            for (i = 6; i <= centenares; i++) {
                romano = romano + "C";
            }
        } else if (centenares == 4) {
            romano = romano + "CD";
        } else {
            for (i = 1; i <= centenares; i++) {
                romano = romano + "C";
            }
        }

        //decenas
        if (decenas == 9) {
            romano = romano + "XC";
        } else if (decenas >= 5) {
            romano = romano + "L";
            for (i = 6; i <= decenas; i++) {
                romano = romano + "X";
            }
        } else if (decenas == 4) {
            romano = romano + "XL";
        } else {
            for (i = 1; i <= decenas; i++) {
                romano = romano + "X";
            }
        }

        //unidades
        if (unidades == 9) {
            romano = romano + "IX";
        } else if (unidades >= 5) {
            romano = romano + "V";
            for (i = 6; i <= unidades; i++) {
                romano = romano + "I";
            }
        } else if (unidades == 4) {
            romano = romano + "IV";
        } else {
            for (i = 1; i <= unidades; i++) {
                romano = romano + "I";
            }
        }
        return romano;
    }
}
