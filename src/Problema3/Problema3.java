/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema3;

/**
 *
 * @author Chuck
 */
public class Problema3 {
    public static void main(String[] args) {
        int x = 0;
        System.out.println("Impresion de numeros pares entre 0 y 100");
        for (int j = 0; j <= 100; j++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x = x + 1;
        }
    }
}
