/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_12;

import java.util.Scanner;

/**
 *
 * @author Chuck
 */
public class Problema_12 {

    public static void main(String[] args) {
        int i=1;
        int suma_par=0;
        int suma_imp=0;
        
        while(i<101)
        {   
            if(i%2==0){
            suma_par=suma_par+i;
            }
            else{
            suma_imp=suma_imp+i;
            }
            i=i+1;
        }   
        System.out.println("La suma de numero pares entre 1 y 100 es: " 
                + suma_par);
        System.out.println("La suma de numeros impares entre 1 y 100 es: "
                + suma_imp);
    }
}
