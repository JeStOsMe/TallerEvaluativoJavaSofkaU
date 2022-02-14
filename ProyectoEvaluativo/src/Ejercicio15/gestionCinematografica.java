package Ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Jeaniel Osorno
 */
public class gestionCinematografica {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean enCiclo = true;
        
        while (enCiclo) {
            try {
                System.out.println("    ****** GESTION CINEMATOGRÁFICA ********\n"
                        + "    1-NUEVO ACTOR\n"
                        + "    2-BUSCAR ACTOR\n"
                        + "    3-ELIMINAR ACTOR\n"
                        + "    4-MODIFICAR ACTOR\n"
                        + "    5-VER TODOS LOS ACTORES\n"
                        + "    6-VER PELICULAS DE LOS ACTORES\n"
                        + "    7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n"
                        + "    8-SALIR");
                System.out.print("Opcion ---> ");
                switch (Integer.parseInt(sc.nextLine())){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        System.out.println("Saliendo del menú");
                        enCiclo = false;
                        break;
                    default:
                        System.out.println("OPCION INCORRECTA");
                }
            } catch (NumberFormatException ex){
                System.out.println("OPCION INCORRECTA");
            }
        }
    }
}
