/*
 * Crear un programa que pida un número por teclado. Luego, imprima por pantalla
 * los números desde el número ingresado hasta 1000, con saltos de 2 en 2.
 */
package Ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Jeaniel Osorno
 */
public class NumerosEntreXy1000 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada, contador = 0;
        
        System.out.println("     ***** Números entre X y 1000 *****");
        try{
            System.out.print("Por favor, ingrese un número menor a 1000: ");
            entrada = Integer.parseInt(sc.nextLine());
            if (entrada >= 1000){
                System.out.println("Ups! Ingresaste un número mayor o igual a 1000."
                                + "\nLo igualaré a 1");
                entrada = 1;
            }
            
            for (int i = entrada; i <= 1000; i += 2){
                System.out.print(i + ", ");
                contador++;
                if (contador == 20){
                    System.out.println("");
                    contador = 0;
                }
            }
            System.out.println("");
            
        } catch (NumberFormatException ex){
            System.out.println("ERROR: solo se admitían números.");
        }
    }
}
