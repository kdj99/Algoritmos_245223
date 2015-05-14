/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_29;

/**
 * Programa que simula 100 tiradas de 2 dados y cuenta cuantas veces
 * los 2 sumaron 10.
 * @author Chuck
 */
public class Problema_29 {

    public static void main(String[] args) {
        int dado1;
        int dado2;
        int contador = 0;
        for (int i = 1; i < 100; i++) {
            dado1 = (int) (Math.random() * 6);
            dado2 = (int) (Math.random() * 6);
            if (dado1 + dado2 == 10) {
                contador = contador + 1;
            }
        }
        System.out.println("La veces que los dados sumaron 10 fueron: "
                + contador);
    }
}
