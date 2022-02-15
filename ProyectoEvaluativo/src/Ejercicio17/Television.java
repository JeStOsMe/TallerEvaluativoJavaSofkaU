package Ejercicio17;

/**
 *
 * @author Jeaniel Osorno
 */
public class Television extends Electrodomestico{
    private double pulgadas;
    private boolean sintonizadorTDT;
    
    private final double pulgadasDefecto = 20;
    private final boolean sintonizadorTDTDefecto = false;
    
    public Television(){
        this.pulgadas = this.pulgadasDefecto;
        this.sintonizadorTDT = this.sintonizadorTDTDefecto;
    }
    
    public Television(double precio, double peso){
        super(precio, peso);
        this.pulgadas = this.pulgadasDefecto;
        this.sintonizadorTDT = this.sintonizadorTDTDefecto;
    }
    
    public Television(double pulgadas, boolean TDT, double precio, String color, char consumoEnergetico, double peso){
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = TDT;
    }
    
        

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        
        if (this.pulgadas > 40){
            precioFinal = precioFinal + (precioFinal * 0.3);
        }
        if (this.sintonizadorTDT){
            precioFinal += 50;
        }
        
        return precioFinal;
    }
    

    public double getPulgadas() {
        return pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
    
    
}
