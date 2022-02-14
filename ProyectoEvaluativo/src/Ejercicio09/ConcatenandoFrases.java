/*
 * Del texto "La sonrisa sera la mejor arma contra la tristeza", remplaza todas 
 * las a del string por e. Adicionalmente, concatenar a esta frase una adicional
 * ingresada por consola, y luego las muestre unidas.
 */
package Ejercicio09;

import java.util.Scanner;

/**
 *
 * @author Jeaniel Osorno
 */
public class ConcatenandoFrases {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original, nueva;
        original = "La sonrisa sera la mejor arma contra la tristeza ";
        
        System.out.println("     ***** Concatenando frases *****");
        System.out.println("Por favor, ingresa una frase (a libre elección) para concatenar: ");
        nueva = sc.nextLine();
        
        System.out.println("La frase original es: " + original);
        original = original.replace("a", "e");
        System.out.println("La frase original modificada queda: " + original);
        System.out.println("Si unimos ambas frases, quedaría: " + original.concat(nueva));
    }
}
