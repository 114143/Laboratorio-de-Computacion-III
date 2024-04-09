package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
//Ingresar la cantidad de horas trabajadas por un empleado y
// el sueldo que cobra por hora. Indique el total a cobrar teniendo en cuenta
// que si trabajó más de 180 horas las excedentes las cobra con un 50 % de aumento.
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cant de horas trabajadas: ");
        int horas = sc.nextInt();
        System.out.println("Ingrese el monto por hora");
        double monto = sc.nextDouble();
        double totalSueldo;

        if (horas > 180)
        {
            int horasExtras = horas - 180;
            double sueldoExtra = horasExtras * (monto * 1.5);// Aumento del 50% para las horas extras
            totalSueldo = (180*monto) + sueldoExtra;
        }
        else
        {
             totalSueldo = horas * monto;
        }

          System.out.println("El sueldo total es: $" + totalSueldo );

          sc.close();
    }

}
