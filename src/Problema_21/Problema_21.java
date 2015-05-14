/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_21;

/**
 * Programa que calcula la suma de pares e impares entre
 * 1 y 1000 usando un switch.
 * @author Chuck
 */
public class Problema_21 {
    public static void main(String[] args) {
        int par = 0;
        int impar = 0;
        int i = 1;
        int opc=0;
        while(i<=1000)
        {
            switch (opc)
            {
                case 0:
                    impar=impar+i;
                    opc=1;
                break;
                default:
                    par=par+i;
                    opc=0;
            }
            i=i+1;
        }
        System.out.println("La suma de pares es: " + par);
        System.out.println("La suma de impares es: " + impar);
        
    }
}
