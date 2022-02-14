/*
 * Crea una aplicación por consola que nos pida un día de la semana, y que nos 
 * diga si es un día laboral o no. Usar un switch.
 */
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Jeaniel Osorno
 */
public class DiasLaborales {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;
        boolean enCiclo = true;
        
        while (enCiclo){
            System.out.println("\n     ***** Dias laborales *****\n");
            System.out.print("Por favor, ingresa un día de la semana (no usar acentos): ");
            dia = sc.nextLine();
            switch(dia.toUpperCase()){
                case "LUNES":
                    System.out.println("\nLos lunes son días laborales!");
                    break;
                case "MARTES":
                    System.out.println("\nLos martes son días laborales!");
                    break;
                case "MIERCOLES":
                    System.out.println("\nLos miércoles son días laborales!");
                    break;
                case "JUEVES":
                    System.out.println("\nLos jueves son días laborales!");
                    break;
                case "VIERNES":
                    System.out.println("\nLos viernes son días laborales!");
                    break;
                case "SABADO":
                    System.out.println("\nLos sábados NO son días laborales. A descansar!");
                    break;
                case "DOMINGO":
                    System.out.println("\nLos domingos NO son dias laborales. A descansar!");
                    break;
                default:
                    System.out.println("\nParece que no ingresaste el día correctamente.");
                    break;
            }
            
            System.out.println("\nIntentar de nuevo? Si = 1     No = 0");
            System.out.print("Opcion ---> ");
            switch (Integer.parseInt(sc.nextLine())){
                case 1:
                    System.out.println("\nEntrando al ciclo!");
                    break;
                case 0:
                    System.out.println("\nGracias por usar mi algoritmo!");
                    enCiclo = false;
                    break;
                default:
                    System.out.println("\nERROR: opción no válida. Entrando de nuevo al ciclo...");
            }
        }
        
    }
}
