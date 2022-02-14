/*
 * Haz una aplicación que calcule el área de un círculo (Pi*R^2). El radio se
 * pedirá por teclado. Usa la constante Pi y el método pow de Math.
 */
package Ejercicio03;

import java.util.Scanner;

/**
 *
 * @author Jeaniel Osorno
 */
public class AreaDelCirculo {
    
    public static double areaCirculo(double radioCirculo){
        return (Math.PI * (Math.pow(radioCirculo, 2)));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, area;
        boolean enCiclo = true;
        
        while (enCiclo) {
            try {
                System.out.println("\n     ***** Calculando el área de un círculo *****\n");
                System.out.print("Por favor, ingrese el valor del área del círculo: ");
                radio = Double.parseDouble(sc.nextLine());
                area = areaCirculo(radio);
                System.out.println("\nEl área del circulo de radio " + radio + " es " + area + " unidades cuadradas");

                System.out.println("\nIntentar de nuevo? Si = 1     No = 0");
                System.out.print("Opcion ---> ");
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        System.out.println("\nIngresando de nuevo al ciclo!");
                        break;
                    case 0:
                        System.out.println("\nGracias por usar mi algoritmo!");
                        enCiclo = false;
                        break;
                    default:
                        System.out.println("\nERROR: opción no válida. Ingresando al ciclo...");
                        break;
                }
            } catch (NumberFormatException ex){
                System.out.println("\nERROR: solo se admiten números...");
            }
        }
    }
    
}
