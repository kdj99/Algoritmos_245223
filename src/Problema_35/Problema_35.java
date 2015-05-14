/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_35;

import java.util.Scanner;

/**
 * Programa que busca la posicion de una calificacion ingresado por el
 * usuario
 * @author Chuck
 */
public class Problema_35 {

    public static void main(String[] args) {
        int calificaciones[] = new int[11];
        int buscar;
        Scanner in = new Scanner(System.in);
        calificaciones[1] = 10;
        calificaciones[2] = 9;
        calificaciones[3] = 8;
        calificaciones[4] = 10;
        calificaciones[5] = 7;
        calificaciones[6] = 6;
        calificaciones[7] = 10;
        calificaciones[8] = 4;
        calificaciones[9] = 2;
        calificaciones[10] = 1;
        System.out.println("Ingresa una calificacion para saber en"
                + " que posicion se encuentra: ");
        buscar = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            if (buscar == calificaciones[i]) {
                System.out.println("Calificacion encontrada en la posicion: " + i);
            }
        }
    }
}
