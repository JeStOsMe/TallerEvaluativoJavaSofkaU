/*
 * Realizar una aplicación de consola, que al ingresar una frase, elimine los
 * espacios en blanco que contenga
 */
package Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class EliminandoEspaciosEnFrase {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        
        System.out.println("     ***** Eliminando espacios en blanco *****");
        System.out.println("Por favor, ingresa una frase para eliminar sus espacios en blanco: ");
        frase = sc.nextLine();
        System.out.println("\nFrase original: " + frase);
        System.out.println("Frase modificada: " + frase.replace(" ", ""));
    }
}
