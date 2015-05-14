/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_43;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;





/**
 * Programa que permite dar de alta en un fichero DATOS.dat
 * los datos de DNI,NOMBRE,APELLIDOS,DIRECCION Y POVINCIA.
 * @author Chuck
 */
public class Problema_43 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       File archivo = null;
      FileReader fr = null;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Scanner in = new Scanner(System.in);
      String dni="",nombre="",apellidos="",direccion="",provincia="";
      int op = 1;
  
    FileWriter fichero = null;
        PrintWriter pw = null;
        while(op==1)
        {
            System.out.println("Ingresa el DNI: ");
            dni = "\n\t" + br.readLine();
            System.out.println("Ingresa el nombre: ");
            nombre = "\t" + br.readLine();
            System.out.println("Ingresa los apellidos: ");
            apellidos = "\t" + br.readLine();
            System.out.println("Ingresa la direccion: ");
            direccion = "\t" + br.readLine();
            System.out.println("Ingresa la provincia: ");
            provincia = "\t" + br.readLine();
            System.out.println("Deseas capturar mas datos ? 1=si 2=no");
            op=in.nextInt();
        }
        try
        {
            fichero = new FileWriter("C:/Users/Chuck/Documents/Lightshot/Algoritmos/DATOS.dat");
            pw = new PrintWriter(fichero);
 
                pw.write(dni);
                pw.write(nombre);
                pw.write(apellidos);
                pw.write(direccion);
                pw.write(provincia);
 
        } catch (Exception e) {
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
           }
        }
        try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:\\Users\\Chuck\\Documents\\Lightshot\\Algoritmos\\DATOS.dat");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         // Lectura del fichero
         String linea;
            System.out.println("Contenido del fichero DATOS.dat\n");
         while((linea=br.readLine())!=null)
            System.out.println(linea);
      }
      catch(Exception e){
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
         }
      }
    }
}

