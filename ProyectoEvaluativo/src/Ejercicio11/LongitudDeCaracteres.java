/*
 * Realizar la construcción de un algoritmo que permita, de acuerdo a una frase
 * pasada por consola, indicar cuál es la longitud de esta frase. Adicionalmente,
 * cuente cuántas vocales que tiene. 
 */
package Ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Jeaniel Osorno
 */
public class LongitudDeCaracteres {
    
    public static void contandoLongitudes(String frase){
        int[] vocales = new int[5];
        char aux;
        
        System.out.println("La frase tiene una cantidad de " + frase.length() + " caracteres, contando espacios.");
        System.out.println("Sin espacios, tiene " + frase.replace(" ", "").length() + " caracteres.");
        
        for (int i = frase.length() - 1; i >= 0; i--){
            aux = frase.toLowerCase().charAt(i);
            switch(aux){
                case 'a':
                    vocales[0] += 1;
                    break;
                case 'e':
                    vocales[1] += 1;
                    break;
                case 'i':
                    vocales[2] += 1;
                    break;
                case 'o':
                    vocales[3] += 1;
                    break;
                case 'u':
                    vocales[4] += 1;
                    break;
            }

        }
        System.out.println("Cantidad de vocales:"
                       + "\nA: " + vocales[0]
                       + "\nE: " + vocales[1]
                       + "\nI: " + vocales[2]
                       + "\nO: " + vocales[3]
                       + "\nU: " + vocales[4]);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        
        System.out.println("     ***** Contando la longitud de una frase *****");
        System.out.println("Por favor, ingresa una frase para iniciar el algoritmo: ");
        frase = sc.nextLine();
        
        contandoLongitudes(frase);
    }
}
