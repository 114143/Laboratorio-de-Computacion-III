package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
//Una empresa de alquiler de autos cobra $300 por día si no
// se superan los 200 km de uso diario.
// Por cada km extra hasta los 1000 km cobra $5 adicionales,
// y a partir de los 1000 cobra $10 adicionales. Hacer un programa que solicite
// la cantidad de km realizados por un cliente e indique el importe que se le debe cobrar.
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de km");
        double km = sc.nextDouble();

        double totalACobrar;
        if (km <= 200)
        {
            totalACobrar =300;
            System.out.println("El monto a cobrar es: $" + totalACobrar);

        }
        else if (km <= 1000)
        {
            double KmExtras = km - 200;
            double cobroExtra = KmExtras * 5;
            totalACobrar =300 + cobroExtra ;
            System.out.println("El monto a cobrar es: $" + totalACobrar);
        }
        else if (km > 1000)
        {
            totalACobrar =300 + 5 * (1000 - 200) + 10 * (km - 1000);
            System.out.println("El monto a cobrar es: $" + totalACobrar);
        }

    }
}
