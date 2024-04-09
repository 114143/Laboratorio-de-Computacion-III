package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
//Ingresar un número n y a continuación n números positivos.
// Informar la cantidad de mayores a 5 que se hayan ingresado.
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero n: ");
        int n = sc.nextInt();

        int mayA5 = 0;
        
        for ( int i = 1; i < n; i++ )
        {
            System.out.println("Ingrese un numero positivo: ");
            int numero = sc.nextInt();
            if(numero > 5)
            {
                mayA5++;
            }

        }

        System.out.println( "La cant de num mayores a 5 son: " +mayA5 );
    }
}
