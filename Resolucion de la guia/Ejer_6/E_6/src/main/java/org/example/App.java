package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
//Ingresar un año e indicar si ese año es bisiesto. Un año es bisiesto
// si es múltiplo de 4 y no es múltiplo de 100 o si es múltiplo de 400.
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un año:");
        int year = scanner.nextInt();

        boolean esBisiesto = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (esBisiesto) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }

        scanner.close();
    }
}
