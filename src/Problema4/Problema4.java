/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema4;

/**
 *
 * @author Chuck
 */
public class Problema4 {
    public static void main(String[] args) {
    int x=0;
    int temp=0;
        System.out.println("Impresion de la suma de numero de 0 a 100");
        for (int i=0;i<100;i++) {
            temp=temp+1;
            x=temp+x;
        }
        System.out.println(x);
    }
}
