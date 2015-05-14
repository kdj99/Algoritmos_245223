/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema2;

/**
 * Programa que imprime un numero del 100 al 0 de forma decreciente
 * mediante el uso de un ciclo for
 * @author Chuck
 */
public class Problema2 {
    public static void main(String[] args) {
        int x = 100;
        System.out.println("Impresion de numeros del 100 al 0");
        for (int j = 0; j <= 100; j++) {
            System.out.println(x);
            x = x - 1;
        }
    }
}
