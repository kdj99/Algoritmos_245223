/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_30;

/**
 * Programa que simula una carrera entre 2 caballos con igual
 * probabilidad de ganar.
 * @author Chuck
 */
public class Problema_30 {

    public static void main(String[] args) {
        int caballo1;
        int caballo2;
        int contador = 0;
        int vueltas = 0;
        for (int i = 1; i < 10; i++) {
            caballo1 = (int) ((Math.random() * 9) + 1.0);
            caballo2 = (int) ((Math.random() * 9) + 1.0);
            if (caballo1 > caballo2) {
                System.out.println("El caballo1 gano la carrera");
                i = 10;
            } else if (caballo1 < caballo2) {
                System.out.println("El caballo2 gano la carrera ");
                i = 10;
            }
        }

    }
}
