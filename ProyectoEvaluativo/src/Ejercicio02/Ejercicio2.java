/*
 * Al ejercicio anterior, agregar entrada por consola de dos valores e indicar
 * si son mayores, menores o iguales.
 */
package Ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Jeaniel Osorno
 */
public class Ejercicio2 {
    
    public static void comparar(double numeroUno, double numeroDos){
        if (numeroUno > numeroDos){
            System.out.println("El número " + numeroUno + " es mayor que " + numeroDos);
        } else if (numeroDos > numeroUno){
            System.out.println("El número " + numeroDos + " es mayor que " + numeroUno);
        } else{
            System.out.println("Los números " + numeroUno + " y " + numeroDos + " son iguales!");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numeroUno, numeroDos;
        boolean salida = false;
        
        while (salida == false){
            try{
                System.out.println("\n     ***** Reconociendo el mayor de dos numero *****\n");
                System.out.print("Por favor, ingresa el primer número: ");
                numeroUno = Double.parseDouble(sc.nextLine());
                System.out.print("\nAhora, ingrese el segundo número: ");
                numeroDos = Double.parseDouble(sc.nextLine());
                System.out.println("");
                
                comparar(numeroUno, numeroDos);
                System.out.println("");
                
                System.out.println("Intentar de nuevo? Si = 1     No = 0");
                System.out.print("Opción ---> ");
                switch(Integer.parseInt(sc.nextLine())){
                    case 1:
                        System.out.println("\nIngresando de nuevo al ciclo! \n");
                        break;
                    case 0:
                        System.out.println("\nGracias por usar el algoritmo!");
                        salida = true;
                        break;
                    default:
                        System.out.println("\nERROR: opción no permitida. Entrando de nuevo al ciclo...");
                }
            } catch(NumberFormatException ex){
                System.out.println("\nERROR: solo se admiten números. Ingresando al ciclo.\n");
            }
        }
    }
    
}
