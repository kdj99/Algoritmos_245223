/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_24;

import java.util.Scanner;

/**
 *
 * @author Chuck
 */
public class Problema_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
         int a=0;
         int numero;  
         System.out.println("Ingresa un numero: ");  
         numero=in.nextInt();  
         for(int i=1;i<(numero+1);i++){  
         if(numero%i==0){  
             a++;  
            }  
         }  
         if(a==2){  
              System.out.println("El numero ingresado Primo");  
            }else{  
                System.out.println("El numero ingresado no es primo");  
         }  
     }  
}
