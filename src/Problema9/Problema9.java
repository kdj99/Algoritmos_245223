/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema9;

import java.util.Scanner;

/**
 *
 * @author Chuck
 */
public class Problema9 {
    public static void main(String[] args) {
        int x=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe un numero para saber si es positivo o no: ");
        x = in.nextInt();
        if(x>0)
        {   
            System.out.println("El numero es positivo.");
        }
        else
        {   
            System.out.println("El numero es negativo.");
        }
    }
}
