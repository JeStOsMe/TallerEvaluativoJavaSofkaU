package Ejercicio17;

/**
 *
 * @author Jeaniel Osorno
 */
public class Electrodomestico {
    
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;
    
    private final String coloresDisponibles = "blanco negro rojo azul gris";
    private final String consumosDisponibles = "A B C D E F";
    
    public Electrodomestico (){
        this.precioBase = 100;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }
    
    public Electrodomestico (double precioBase, double peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
    }
    
    public Electrodomestico (double precioBase, String color, char consumoEnergetico, double peso){
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    
    public void comprobarConsumoEnergetico(char letra){
        if (!this.consumosDisponibles.contains(String.valueOf(letra).toUpperCase())){
            this.consumoEnergetico = 'F';
        } 
    }
    
    public void comprobarColor(String color){
        if (!this.coloresDisponibles.contains(color.toLowerCase())){
            this.color = "blanco";
        }
    }
    
    public double precioFinal(){
        double precioFinal = this.precioBase;
        
        System.out.println("Precio base: " + this.precioBase);
        
        //Comprobando según su consumo energetico:
        switch(this.consumoEnergetico){
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
        }
        
        //Comprobando según su peso:
        if (this.peso >= 0 && this.peso <= 19){
            precioFinal += 10;
        } else if (this.peso >= 20 && this.peso <= 49){
            precioFinal += 50;
        } else if (this.peso >= 50 && this.peso <= 79){
            precioFinal += 80;
        } else if (this.peso >= 80){
            precioFinal += 100;
        }
        
        return precioFinal;
    }
    
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
    
    
    
}
