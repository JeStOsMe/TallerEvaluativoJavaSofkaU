/*
 * Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usar un
 * bucle while
 */
package Ejercicio5;

/**
 *
 * @author Jeaniel Osorno
 */
public class paresImparesEntreUnoyCien {
    
    public static void main(String[] args) {
        int limite = 1;
        
        //Aquí va la "version 1" de mi solución al problema.
        System.out.println("Primera propuesta");
        while(limite <= 100){
            if (limite % 2 == 0) System.out.println(limite + " es par");
            else System.out.println(limite + " es impar");
            limite++;
        }
        
        //"Version 2" de mi solución. Solo un detalle estético.
        System.out.println("Segunda propuesta");
        String pares = "", impares = "";
        limite = 1;
        
        while (limite <= 100){
            if (limite % 2 == 0){
                pares = pares + ", " + limite;
            } else{
                impares = impares + ", " + limite;
            }
            limite++;
        }
        
        System.out.println("Números impares:" + impares);
        System.out.println("Números pares:" + pares);
    }
}
