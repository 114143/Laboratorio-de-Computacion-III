package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
//Hacer un programa que ingrese el precio de un artículo a la venta y calcule el precio con IVA.
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del articulo:");
        int precio = sc.nextInt();

        float pre_iva = precio * 1.21f;

        System.out.println("El precio del articulo + IVA es: " + pre_iva);

    }
}
