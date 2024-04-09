package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
// Hacer un programa que ingrese los datos de una factura en la cual haya
// tres artículos vendidos. De cada artículo ingresar el precio unitario y la cantidad.
// Finalmente imprimir el total de la factura
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar precio del articulo 1: ");
        double precio1 = sc.nextDouble();
        System.out.println("Ingresar la cantidad");
        int cantidad1 = sc.nextInt();

        double total1 = precio1*cantidad1;

        System.out.println("Ingresar precio del articulo 2: ");
        double precio2 = sc.nextDouble();
        System.out.println("Ingresar la cantidad");
        int cantidad2 = sc.nextInt();

        double total2 = precio2*cantidad2;

        System.out.println("Ingresar precio del articulo 3: ");
        double precio3 = sc.nextDouble();
        System.out.println("Ingresar la cantidad");
        int cantidad3 = sc.nextInt();

        double total3 = precio3*cantidad3;

        double total = total1+total2+total3;


        System.out.println( "El Monto total de la factura es: " + total);

        sc.close();
    }
}
