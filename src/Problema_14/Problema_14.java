/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_14;

import java.util.Scanner;

/**
 * Programa que imprime el mayor y menos de una serie de 5 numeros
 * ingresados por el usuario.
 * @author Chuck
 */
public class Problema_14 {
    public static void main(String[] args) {
        int con=0;
        int n=0;
        int max=0;
        int min=10000;
        Scanner in = new Scanner(System.in);
        
        while(con <5)
        {
            System.out.println("Ingresa numero: ");
            n = in.nextInt();
            if(n>max)
            {
                max=n;
            }
            if(n<min)
            {   
                min=n;
            }
            con=con+1;
        }
        System.out.println("El mayor de los numero es: " + max);
        System.out.println("El menor de los numero es: " + min);
    }
}
