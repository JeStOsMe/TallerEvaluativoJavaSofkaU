package Ejercicio17;

/**
 *
 * @author Jeaniel Osorno
 */
public class testElectrodomesticos {
    
    public static void main(String[] args) {
        //Creando el array
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        double precioCompleto, precioElectrodomestico, precioLavadora, precioTelevision;
        precioCompleto = 0;
        precioElectrodomestico = 0;
        precioLavadora = 0;
        precioTelevision = 0;
        
        //Inicializando valores
        electrodomesticos[0] = new Electrodomestico();
        electrodomesticos[1] = new Lavadora();
        electrodomesticos[2] = new Television();
        electrodomesticos[3] = new Electrodomestico(200, 20);
        electrodomesticos[4] = new Lavadora(250, 40);
        electrodomesticos[5] = new Television(400, 20);
        electrodomesticos[6] = new Electrodomestico(300, "negro", 'D', 40);
        electrodomesticos[7] = new Lavadora(18, 300, "gris", 'A', 30);
        electrodomesticos[8] = new Television(50, false, 700, "rojo", 'G', 25);
        electrodomesticos[9] = new Electrodomestico();
        
        electrodomesticos[8].comprobarColor("rojo");
        electrodomesticos[8].comprobarConsumoEnergetico('G');
        
        double aux;
        for(Electrodomestico el: electrodomesticos){
            if (el instanceof Lavadora){
                System.out.println("\tLavadora");
                aux = el.precioFinal();
                precioLavadora += aux;
            } else if (el instanceof Television){
                System.out.println("\tTelevision");
                aux = el.precioFinal();
                precioTelevision += aux;
            } else{
                System.out.println("\tElectrodomestico sin categoria");
                aux = el.precioFinal();
                precioElectrodomestico += aux;
            }
            
            System.out.println("Precio final: " + aux + "\n");
            precioCompleto += aux;
            
        }
        System.out.println("\n\nPRECIO TOTAL: " + precioCompleto
                     + "\n\tPrecio Electrodomesticos sin categoria: " + precioElectrodomestico
                     + "\n\tPrecio Lavadoras: " + precioLavadora
                     + "\n\tPrecio Televisiones: " + precioTelevision);
        
    }
    
}
