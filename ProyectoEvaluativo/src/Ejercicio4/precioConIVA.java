/*
 * Lee un número por teclado que pida el precio de un producto, y calcule el
 * precio final con IVA. El IVA será una constante del 21%
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Jeaniel Osorno
 */
public class precioConIVA {
    
    public static double precioFinal(double precioBruto){
        double IVA = 0.21;
        System.out.println("\nRecuerda que usamos un IVA del 21%!");
        return (precioBruto + (precioBruto * IVA));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioBruto, precioNeto;
        boolean enCiclo = true;
        
        while (enCiclo){
            try{
                System.out.println("\n     ***** Precios con IVA *****\n");
                System.out.print("Por favor, ingrese el precio base del producto: ");
                precioBruto = Double.parseDouble(sc.nextLine());
                precioNeto = precioFinal(precioBruto);
                System.out.println("Valor bruto: " + precioBruto
                               + "\nValor neto: " + precioNeto);
                System.out.println("\nIngresar otro valor? Si = 1     No = 0");
                System.out.print("Opcion ---> ");
                switch(Integer.parseInt(sc.nextLine())){
                    case 1:
                        System.out.println("\nIngresando de nuevo al ciclo!");
                        break;
                    case 0:
                        System.out.println("\nGracias por usar mi algoritmo!");
                        enCiclo = false;
                        break;
                    default:
                        System.out.println("\nERROR: opción no valida. Entrando al ciclo...");
                        break;
                }
            } catch (NumberFormatException ex){
                System.out.println("\nERROR: solo se admiten números...");
            }
        }
        
        
    }
}
