package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
//. Ingresar el tiempo en segundos que realizó el ganador de la clasificación
// de una carrera de F1. Luego ingresar los tiempos de los otros 9 corredores
// e informar cuántos disputarán la carrera.
// Para que un corredor pueda participar su tiempo de clasificación
// no puede superar en 15 % al del ganador.
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los segundos del ganador: ");
        int seg = sc.nextInt();

        int cont = 0;
        while (!sc.hasNextInt() || (cont = sc.nextInt()) <= 9) {
            System.out.println("ingrese los segundos del corredor: " + cont);
            cont= cont++;
        }

        System.out.println( "Hello World!" );
    }
}
