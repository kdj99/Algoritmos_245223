/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_39;

import java.util.Scanner;

/**
 * Programa que ordena una matriz de M filas y N columnas
 * 
 * @author columnashuck
 */
public class Problema_39 {

    public static void main(String[] args) {
        int filas = 0, columnas = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de filas: ");
        filas = sc.nextInt();
        System.out.println("Numero de columnas: ");
        columnas = sc.nextInt();
        System.out.println("Introduzca la matriz: ");
        int i, j;
        int[][] matriz = new int[filas][columnas];
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                System.out.print("elemento :[" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz generada:");
        for (i = 0; i < matriz.length; i++) { 
            for (j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < filas; i++) {//ordena la matriz de abajo hacia arriba
            for (j = 0; j < columnas; j++) {
                for (int x = 0; x < filas; x++) {
                    for (int y = 0; y < columnas; y++) {
                        if (matriz[i][j] < matriz[x][y]) {
                            int t = matriz[i][j];
                            matriz[i][j] = matriz[x][y];
                            matriz[x][y] = t;
                        }
                    }
                }
            }
        }
        System.out.println("Matriz ordenada:");
        for (i = 0; i < matriz.length; i++) { 
            for (j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
        
}