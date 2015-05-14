/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_33;

import java.io.IOException;

/**
 * Programa que imprime todos los elemendos de un arreglo de
 * 20 espacios.
 * @author Chuck
 */
public class Problema_33 {

    public static void main(String[] args) throws IOException {
        String[] nombre = new String[20];
        nombre[0] = "Luis";
        nombre[1] = "María";
        nombre[2] = "Carlos";
        nombre[3] = "Jose";
        nombre[4] = "Ismael";
        nombre[5] = "Pedrito";
        nombre[6] = "Monserrat";
        nombre[7] = "Karen";
        nombre[8] = "Amelia";
        nombre[9] = "Ismael";
        nombre[10] = "Isabel";
        nombre[11] = "Lili";
        nombre[12] = "Pancho";
        nombre[13] = "Alfredo";
        nombre[14] = "Artemio";
        nombre[15] = "Laura";
        nombre[16] = "Ehtieen";
        nombre[17] = "Diego";
        nombre[18] = "Peng";
        nombre[19] = "Dilan";
        for (int i = 0; i < 20; i++) {
            System.out.println(nombre[i] + "\n");
        }

    }
}
