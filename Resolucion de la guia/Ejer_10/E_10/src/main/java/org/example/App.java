package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
// Ingresar un número y validar que sea positivo.
// Si no lo es continuar solicitándolo al usuario hasta que ingrese un número correcto.
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        System.out.print("Ingrese un número positivo: ");
        while (!sc.hasNextInt() || (num = sc.nextInt()) <= 0) {
            System.out.println("Por favor, ingrese un número válido y positivo.");
            System.out.print("Ingrese un número positivo: ");
            sc.next();
        }

        System.out.println("El número ingresado es: " + num);
        sc.close();
        sc.close();
    }
}
