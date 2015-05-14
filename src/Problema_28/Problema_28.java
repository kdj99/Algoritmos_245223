/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_28;

/**
 * Programa que simula el lanzamiento de una moneda
 * @author Chuck
 */
public class Problema_28 {
    public static void main(String[] args) {
        if(Math.random()<=0.5)
        {
            System.out.println("Salio cara");
        }
        else
        {
            System.out.println("Salio cruz");
        }
    }
}
