/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Chuck
 */
public class Problema_18 {
    public static void main(String[] args) throws IOException {
        String frase;
        char letra;
        int longitud;
        int a=0;
        int res=1;
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
            System.out.println("Introduce una frase: ");
            frase = br.readLine();
            longitud = frase.length();
            int i=1;
            System.out.println("Letra a buscar en la frase: ");
            letra = (char) br.read();
            for (int j = 0; j < longitud; j++) 
            {
                if(frase.charAt(j)==letra)
                {
                    a++;
                }
            }
            System.out.println("El numero de veces que aparece la letra " 
                    + letra + " en la frase " + frase + " es de: " + a);
        
    }
}
