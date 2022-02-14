/*
 * Pedir dos palabras por teclado. Indicar si son iguales, y si no lo son
 * mostrar sus diferencias
 */
package Ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Jeaniel Osorno
 */
public class DosPalabras {
    
    public static void diferencias(String palabraUno, String palabraDos){
        if (palabraUno.length() != palabraDos.length()){
            System.out.println(palabraUno + " tiene " + palabraUno.length() + " caracteres, "
                        + "mientras que " + palabraDos + " tiene " + palabraDos.length() + " caracteres.");
            return;
        } else if (palabraUno.toUpperCase().equals(palabraDos.toUpperCase())){
            System.out.println("Las palabras " + palabraUno + " y " + palabraDos + " son iguales!");
            return;
        } else{
            System.out.println("Hora de comparar letra por letra de cada palabra!");
            
            if (palabraUno.length() <= palabraDos.length()){
                for (int i = 0; i < palabraUno.length(); i++){
                    System.out.println("Caracter " + (i + 1) + " de " + palabraUno + ": " + palabraUno.charAt(i));
                    System.out.println("Caracter " + (i + 1) + " de " + palabraDos + ": " + palabraDos.charAt(i));
                    if (palabraUno.toUpperCase().charAt(i) != palabraDos.toUpperCase().charAt(i)){
                        System.out.println("Sus caracteres son diferentes!");
                    }
                }
            } else{
                for (int i = 0; i < palabraDos.length(); i++){
                    System.out.println("Caracter " + (i + 1) + " de " + palabraUno + ": " + palabraUno.charAt(i));
                    System.out.println("Caracter " + (i + 1) + " de " + palabraDos + ": " + palabraDos.charAt(i));
                    if (palabraUno.toUpperCase().charAt(i) != palabraDos.toUpperCase().charAt(i)){
                        System.out.println("Sus caracteres son diferentes!");
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraUno, palabraDos;
        
        System.out.println("     ***** Palabras y sus diferencias *****");
        System.out.print("Por favor, ingrese la primera palabra: ");
        palabraUno = sc.nextLine();
        System.out.print("\nAhora, ingrese la segunda palabra: ");
        palabraDos = sc.nextLine();
        
        diferencias(palabraUno, palabraDos);
    }
    
}
