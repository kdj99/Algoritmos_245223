/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_27;

import java.util.Scanner;

/**
 *
 * @author Chuck
 */
public class Problema_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = 0;
        int resultado=0;
        System.out.println("Ingresa el numero para mostrar su tabla de "
                + "multiplicar");
        numero = in.nextInt();
        for (int i = 0; i <=10; i++) {
            resultado=numero*i;
            System.out.println(numero + " X " + i + "= " + resultado);        
        }
    }
}
