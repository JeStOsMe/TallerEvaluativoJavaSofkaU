package Ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Jeaniel Osorno
 */
public class testPersona {
    
    public static void comprobarPeso(Persona persona){
        switch(persona.calcularIMC()){
            case -1:
                System.out.println("Peligro! Usted está por debajo de su peso ideal");
                break;
            case 0:
                System.out.println("Estás en tu peso ideal. Sigue así!");
                break;
            case 1:
                System.out.println("Peligro! Usted está por encima de su peso ideal");
                break;
            default:
                System.out.println("Lo sentimos: no tenemos la información necesaria para calcular su IMC");
                break;
        }
        System.out.println("");
    }
    
    public static void comprobarEdad(Persona persona){
        if (persona.esMayorDeEdad()){
            System.out.println(persona.getNombre() + " es mayor de edad!");
        } else{
            System.out.println(persona.getNombre() + " es menor de edad!");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Nombre, Sexo;
        int Edad;
        double Peso, Altura;

        Persona personaUno, personaDos, personaTres;
        
        try {
            System.out.println("     ***** Creando Personas a partir de la clase Persona *****");
            System.out.print("\nPor favor, ingrese un nombre: ");
            Nombre = sc.nextLine();
            System.out.print("\nIngrese la edad de " + Nombre + ": ");
            Edad = Integer.parseInt(sc.nextLine());
            System.out.print("\nIngrese el sexo de " + Nombre + " (recuerde ingresar solo H o M): ");
            Sexo = sc.nextLine();
            System.out.print("\nIngrese el peso de " + Nombre + " en kilogramos: ");
            Peso = Double.parseDouble(sc.nextLine());
            System.out.print("\nFinalmente, ingrese la altura en metros de " + Nombre + ": ");
            Altura = Double.parseDouble(sc.nextLine());
            System.out.println("\n     ***** Realizando acciones *****\n");
            
            personaUno = new Persona(Nombre, Edad, Sexo, Peso, Altura);
            personaUno.comprobarSexo(Sexo);
            
            personaDos = new Persona(Nombre, Edad, Sexo);
            personaDos.comprobarSexo(Sexo);
            
            personaTres = new Persona();    //Valores por defecto.
            //Asignación de valores mediante setters de objeto.
            personaTres.setNombre(Nombre);
            personaTres.setEdad(Edad);
            personaTres.setSexo(Sexo);
            personaTres.setPeso(Peso);
            personaTres.setAltura(Altura);
            personaTres.comprobarSexo(Sexo);
            
            comprobarPeso(personaUno);
            comprobarPeso(personaDos);
            comprobarPeso(personaTres);
            
            System.out.println("Persona Uno:\n" + personaUno.toString() + "\n");
            System.out.println("Persona Dos:\n" + personaDos.toString() + "\n");
            System.out.println("Persona Tres:\n" + personaTres.toString() + "\n");
            
            
        } catch (NumberFormatException ex) {
            System.out.println("Ups! Parece que ingresó un valor incorrecto. Saliendo del algoritmo");
        }
        
        System.out.println("Gracias por usar mi algoritmo!");
    }
}
