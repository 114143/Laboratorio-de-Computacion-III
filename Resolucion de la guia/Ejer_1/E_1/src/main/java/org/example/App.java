package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
//1. Declarar dos variables enteras y cargar sus valores por teclado.
// Informar su suma, diferencia, producto y cociente.
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int a = sc.nextInt();
        System.out.println("ingrese otro numero");

        int b = sc.nextInt();

        int suma = a + b;
        int diferencia = a-b;
        int producto = a * b;
        float cociente = a / b;

        System.out.println( "La suma es: " + suma );
        System.out.println( "La diferencia es: " + diferencia );
        System.out.println( "El producto es: " + producto );
        System.out.println( "El cociente es: " + cociente );

        sc.close();
    }
}
