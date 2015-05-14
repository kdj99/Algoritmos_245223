/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_34;

import java.util.Scanner;

/**
 * Programa que lee calificaciones de un alumno en 10 materias
 * y calcula su media.
 * @author Chuck
 */
public class Problema_34 {
    public static void main(String[] args) {
        int calificaciones[] = new int[11];
        int suma = 0, media = 0;
        Scanner in = new Scanner(System.in);
        for (int i=1; i<=10; i++) {
            System.out.println("Ingresa la calificacion de la materia " 
                    + i + " : ");
            calificaciones[i] = in.nextInt();
        }
        for (int i=1; i<=10; i++) {
            suma=suma+calificaciones[i];
        }
        media=suma/10;
        System.out.println("La media de calificaciones en 10 materias es de: "
                + media);
    }
}
