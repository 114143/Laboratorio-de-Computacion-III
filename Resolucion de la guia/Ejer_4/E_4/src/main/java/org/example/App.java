package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
//Ingresar nombre y altura de dos personas, informar el nombre de la más alta.
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre p1:");
        String nombre1 = sc.nextLine();
        System.out.println("Ingrese la altura de p1:");
        float altura1 = sc.nextFloat();
        sc.nextLine();

        System.out.println( "Ingrese nombre p2:" );
        String nombre2 = sc.nextLine();
        System.out.println("Ingrese la altura de p2:");
        float altura2 = sc.nextFloat();
        sc.nextLine();

        if (altura1 > altura2){
            System.out.println("La persona mas alta es: " + nombre1);
        }
        else {
            System.out.println("La persona mas alta es: " + nombre2);
        }

        sc.close();
    }
}
