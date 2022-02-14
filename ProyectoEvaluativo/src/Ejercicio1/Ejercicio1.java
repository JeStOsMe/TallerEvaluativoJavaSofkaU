/*
 * Declara dos variables numéricas (con el valor que desees), e indica cuál es
 * mayor de los dos. Si son iguales, indicarlo también. Ve cambiando los valores
 * para comprobar que funcionan.
 */
package Ejercicio1;

/**
 *
 * @author Jeaniel Osorno
 */
public class Ejercicio1 {
    
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
        double numeroUno, numeroDos;
        numeroUno = 3.14;
        numeroDos = 2;
        
        comparar(numeroUno, numeroDos);
        
        numeroUno = 8;
        numeroDos = 23;
        
        comparar(numeroUno, numeroDos);
        
        numeroUno = 33.7;
        numeroDos = 33.7;
        
        comparar(numeroUno, numeroDos);
    }
    
}
