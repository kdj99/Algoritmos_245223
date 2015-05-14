/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_36;

/**
 * Programa que imprime una matriz de 4 filas y 5 columnas
 * mediante numeros aleatorios de 1 a 100.
 * @author Chuck
 */
public class Problema_36 {

    public static void main(String[] args) {
        int filas = 4, columnas = 5, temp = 0;
        int i, j;
        int[][] matriz = new int[filas][columnas];
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Matriz generada:");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
