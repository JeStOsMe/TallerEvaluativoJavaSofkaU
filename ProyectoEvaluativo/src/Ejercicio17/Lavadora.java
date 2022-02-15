package Ejercicio17;

/**
 *
 * @author Jeaniel Osorno
 */
public class Lavadora extends Electrodomestico{
    
    private double carga;
    
    private final double cargaDefecto = 5;
    
    public Lavadora(){
        super();
        this.carga = this.cargaDefecto;
    }
    
    public Lavadora(double precio, double peso){
        super(precio, peso);
        this.carga = this.cargaDefecto;
    }
    
    public Lavadora(double carga, double precioBase, String color, char consumoEnergetico, double peso){
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }


    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal(); 
        
        if (this.carga > 30){
            precioFinal += 50;
            return precioFinal;
        } else{
            return precioFinal;
        }
    }
    
    public double getCarga(){
        return this.carga;
    }
}
