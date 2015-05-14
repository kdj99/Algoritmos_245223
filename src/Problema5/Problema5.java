/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema5;

/**
 *Programa que imprime los numeros impares de 1 a 100 y cuenta cuantos impares
 * encontro mediante un ciclo for
 * @author Chuck
 */
public class Problema5 {

    public static void main(String[] args) {
        int x = 0;
        int contador = 0;
        System.out.println("Impresion de numeros impares entre 0 y 100, "
                + "y cuantos numeros impares hay entre 0 y 100");
        for (int j = 0; j <= 100; j++) {
            if (x % 2 != 0) {
                System.out.println(x);
                contador = contador + 1;
            }
            x = x + 1;
        }
        System.out.println("Hay " + contador + " numeros impares");
    }
}
