/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_19;

import java.util.Scanner;

/**
 *
 * @author Chuck
 */
public class Problema_19 {
    public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;
        int res=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa la hora: ");
        horas = in.nextInt();
        System.out.println("Ingresa los minutos: ");
        minutos = in.nextInt();
        System.out.println("Ingresa los segundos: ");
        segundos = in.nextInt();
        while(res==1)
        {
            while(horas<24)
            {
                while(minutos<60)
                {
                    while(segundos<60)
                    {
                        System.out.println(horas + ":" + minutos + ":" + segundos);
                        segundos=segundos+1;
                    }
                    minutos=minutos+1;
                    segundos=0;
                }
                horas=horas+1;
                minutos=0;
            }
            horas=0;
        }
    }
}
