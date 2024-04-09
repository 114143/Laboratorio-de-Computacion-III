package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
//Ingresar 3 números por teclado, informar su suma y promedio.
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = sc.nextInt();
        System.out.println("Ingrese otro numero");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        float promedio = sum / 3;

        System.out.println( "La suma es: " + sum+ "y el promedio es: " + promedio );

        sc.close();
    }
}
