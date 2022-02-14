/*
 * Realizar el ejercicio 5, pero cambiando el ciclo while por un ciclo for.
 */
package Ejercicio06;

/**
 *
 * @author Jeaniel Osorno
 */
public class paresImparesConFor {
    
    public static void main(String[] args) {
        int limite = 100;
        
        System.out.println("Primera propuesta");
        for (int i = 1; i <= limite; i++){
            if (i % 2 == 0) System.out.println(i + " es par");
            else System.out.println(i + " es impar");
        }
        
        System.out.println("\nSegunda propuesta");
        String pares = "", impares = "";
        
        for (int i = 1; i <= limite; i++){
            if (i % 2 == 0){
                pares = pares + ", " + i;
            } else{
                impares = impares + ", " + i;
            }
        }
        
        System.out.println("Números impares: " + impares);
        System.out.println("Números pares: " + pares);
    }
}
