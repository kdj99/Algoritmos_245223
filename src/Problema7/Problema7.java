/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Chuck
 */
public class Problema7 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String opcion = "s";
        String sTexto = null;
        int contador = 0;
        System.out.println("Programa que cuenta las frases ingresadas por el "
                + "usuario\n");
        while ("s".equals(opcion)) {
            System.out.println("Ingresa una frase y presiona enter para que "
                    + "comienze el conteo de frases ingresadas:");
            sTexto = br.readLine();
            System.out.print("Deseas introducir mas frases: s/n ?: ");
            opcion = br.readLine();
            contador = contador + 1;

        }
        System.out.println("\nEl total de frases contadas es de: " + contador);
    }
}
