/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Chuck
 */
public class Problema_22 {
    public static void main(String[] args) throws IOException {
        String frase;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresa una frase: ");
        frase = br.readLine();
        for (int i = 0; i <5; i++) {
            switch(i)
            {
                case 0:
                    System.out.println("\t\t\t\t" + frase);
                break;
                case 1:
                    System.out.println("\t\t\t\t\t\t\t\t" + frase);
                break;
                case 2:
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t" + frase);
                break;
                case 3:
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + frase);
                break;
                case 4:
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + frase);
            }
            
        }
    }
}
