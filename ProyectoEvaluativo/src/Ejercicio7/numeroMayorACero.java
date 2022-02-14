/*
 * Lee un número por teclado y comprueba que este número es mayor o igual a cero.
 * Si no lo es, volverá a pedir que ingrese el número. Luego, mostrará el número
 * por consola.
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Jeaniel Osorno
 */
public class numeroMayorACero {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Num = -1;
        
        do{
            try{
                System.out.println("\n     ***** Mayor o igual a cero *****\n");
                System.out.print("Por favor, ingresa un número: ");
                Num = Double.parseDouble(sc.nextLine());
                
                if (Num >= 0){
                    System.out.println("\nExcelente! " + Num + " es mayor o igual a cero"
                            + "\n\nSaliste del ciclo!");
                } else{
                    System.out.println("\nIntenta de nuevo!");
                }
            } catch (NumberFormatException ex){
                System.out.println("\nERROR: solo se admiten números");
                Num = -1;
            }
        } while (Num < 0);
    }
}
