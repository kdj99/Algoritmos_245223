/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_16;

/**
 *
 * @author Chuck
 */
public class Problema_16 {
    public static void main(String[] args) {
        int serie=0;
        System.out.println("Impresion 10 veces del numero del 1 al 10\n");
        while(serie<10)
        {   
            int numero=1;
            while(numero<=10)
            {
                System.out.println(numero);
                numero=numero+1;
            }
            serie=serie+1;
        }
    }
    
}
