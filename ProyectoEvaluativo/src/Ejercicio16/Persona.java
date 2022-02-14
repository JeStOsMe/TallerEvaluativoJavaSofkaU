package Ejercicio16;

/**
 *
 * @author Jeaniel Osorno
 */
public class Persona {
    
    //Atributos privados. Solo se acceden mediante getters o setters
    private String Nombre;
    private int Edad;
    private String DNI;
    private String Sexo;
    private double Peso;
    private double Altura;
    
    //Constructor sin parámetros, para inicializar todo por defecto.
    public Persona(){
        this.Nombre = "";
        this.Edad = 0;
        this.DNI = this.generaDNI();
        this.Sexo = "H";
        this.Peso = 0;
        this.Altura = 0;
    }
    
    //Constructor que recibe Nombre, Edad y Sexo, lo demás por defecto.
    public Persona(String Nombre, int Edad, String Sexo){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.DNI = this.generaDNI();
        this.Sexo = Sexo;
        this.Peso = 0;
        this.Altura = 0;
    }
    
    //Constructor con todos los atributos como parámetros
    public Persona(String Nombre, int Edad, String Sexo, double Peso, double Altura){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.DNI = this.generaDNI();
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }
    
    public int calcularIMC(){
        double IMC;
        
        IMC = (this.Peso / Math.pow(this.Altura, 2));
        System.out.println("Su IMC es de: " + IMC);
        
        if(IMC < 20){
            return -1;
        } else if (IMC >= 20 && IMC <= 25){
            return 0;
        } else if (IMC > 25){
            return 1;
        } else {
            return 2;
        }
    }
    
    public boolean esMayorDeEdad(){
        if (this.Edad >= 18){
            return true;
        } else{
            return false;
        }
    }
    
    public void comprobarSexo(String sexo){
        
        if (sexo.charAt(0) == 'H' || sexo.charAt(0) == 'M'){
            this.Sexo = String.valueOf(sexo.charAt(0));
            return;
        } else{
            this.Sexo = "H";
            return;
        }
    }
    
    @Override
    public String toString(){
        String resumen;
        resumen = "\tNombre: " + this.Nombre
              + "\n\tEdad: " + this.Edad
              + "\n\tDNI: " + this.DNI
              + "\n\tSexo: " + this.Sexo
              + "\n\tPeso: " + this.Peso
              + "\n\tAltura: " + this.Altura;
        return resumen;
    }
    
    public String generaDNI(){
        /*Genera un aleatorio entre 0 y 1, ninguno incluido. Luego, lo multiplica por 10^8 
        Para tomar las primeras 8 cifras. Luego, redondea para eliminar decimales. 
        Finalmente, retorna el aleatorio*/
        String randomDNI = String.valueOf(Math.round(Math.random() * Math.pow(10, 8)));
        
        return randomDNI;
    }

    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    
}
