/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_31;

import java.util.Scanner;

/**
 * Programa que mediante un menu calcula la suma, resta, multiplicacion
 * y division de 2 numeros ingresados por el usuario
 * @author Chuck
 */
public class Problema_31 {

    public static void main(String[] args) {
        int op = 0;
        int n1, n2, suma, resta, multiplicacion, division;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        n1 = in.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        n2 = in.nextInt();
        System.out.println("Si quieres sumas los numeros ingresa 1\n"
                + "Si quieres restar los numeros ingresa 2\n"
                + "Si quieres multiplicar los numeros ingresa 3\n"
                + "Si quieres dividir los numeros ingresa 4");
        op = in.nextInt();
        if (op == 1) {
            suma = n1 + n2;
            System.out.println("La suma de los numeros es: " + suma);
        } else if (op == 2) {
            resta = n1 - n2;
            System.out.println("La resta de los numeros es: " + resta);
        } else if (op == 3) {
            multiplicacion = n1 * n2;
            System.out.println("La multiplicacion de los numero es: " + multiplicacion);
        } else if (op == 4) {
            division = n1 / n2;
            System.out.println("La division de los numeros es: " + division);
        }
    }
}
