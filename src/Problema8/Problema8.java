/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Programa el cual solo acepta la entrada de caracteres S y N
 * @author Chuck
 */
public class Problema8 {
    public static void main(String[] args) throws IOException {
        String resultado=null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(!"S".equalsIgnoreCase(resultado) & !"N".equalsIgnoreCase(resultado)){
            System.out.println("Introduce S o N: ");
            resultado = br.readLine();
            String toUpperCase = resultado.toUpperCase();
            
        }
    }
}
