/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_38;

import java.util.Scanner;

/**
 * Programa que lee notas de un alumno en funcion de filas y
 * columnas de una matriz
 * @author Chuck
 */
public class Problema_38 {
    public static void main(String[] args) {
        int cursos = 0, n_alumno = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de cursos: ");
        cursos = sc.nextInt();
        System.out.println("Numero de alumnos: ");
        n_alumno = sc.nextInt();
        System.out.println("Introduzca las notas: ");
        int i, j;
        int[][] notas = new int[cursos][n_alumno];
        for (i = 0; i < cursos; i++) {
            for (j = 0; j < n_alumno; j++) {
                System.out.print("notas del curso numero:[" + i + "] del alumno numero:[" + j + "]= ");
                notas[i][j] = sc.nextInt();
            }
        }
        System.out.println("valores introducidos:");
        for (i = 0; i < notas.length; i++) { 
            for (j = 0; j < notas[i].length; j++) {
                System.out.print("notas del curso numero:[" + i + "] del alumno numero:[" + j + "]= " + notas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
