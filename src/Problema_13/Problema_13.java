/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_13;

/**
 * Programa que imprime los numeros que son multiplos de 2 y 3 
 * que hay entre 1 y 100
 * @author Chuck
 */
public class Problema_13 {

    public static void main(String[] args) {
        int i = 1;
        int x = 0;

        while (i < 101) {
            if (i % 2 == 0 & i % 3 == 0) {
                x = x + 1;
            }
            i = i + 1;
        }
        System.out.println("El numero de multiplos de 2 y 3 entre 1 y 10 es de: "
                + x);
    }
}
