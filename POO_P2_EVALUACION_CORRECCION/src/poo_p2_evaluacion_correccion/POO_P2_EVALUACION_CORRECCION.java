/*
    UN PROGRAMA CON HERENCIA, CON VEHICULOS
*/
package poo_p2_evaluacion_correccion;

/**
 *
 * @author erick
 */
public class POO_P2_EVALUACION_CORRECCION {
    public static void main(String[] args) {
        System.out.println("\nAUTO 1:"); Auto car1 = new Auto("MHL-W28", "Mazda", "Gris", 4, 1, "Automatico", 0);
        System.out.println("\nAUTO 2:"); Auto car2 = new Auto("JKL-K28", "Audi", "Negro", 4, 0, "Manual", 0);
        System.out.println("\nCAMION 1"); Camion cam1 = new Camion("PKJ-9FJ", "Chevrolet", "Blanco", 6, 1, "Manual", 45.65);
        System.out.println("\nCAMION 2"); Camion cam2 = new Camion("RHG-OPS", "Chevrolet", "Blanco", 10, 1, "Manual", 65.65);
        
        System.out.println("\nAUTO 1:"); car1.showData();
        System.out.println("\nAUTO 2:"); car2.showData();
        System.out.println("\nCAMION 1"); cam1.showData();
        System.out.println("\nCAMION 2"); cam2.showData();
        
        System.out.println("\nAUTO 1:"); car1.ParabrisasOnOff();
        System.out.println("\nAUTO 2"); car2.ParabrisasOnOff();
        System.out.println("\nCAMION 1"); cam1.ParabrisasOnOff();
        System.out.println("\nCAMION 2"); cam2.ParabrisasOnOff();
        System.out.println("\nAUTO 1:"); car1.ParabrisasOnOff();
        System.out.println("\nCAMION 2"); cam2.ParabrisasOnOff();
        
        car1.setColor("Rosa");
        car1.addMulta();
        car2.setMultas(240);
        car2.setMarca("Chevrolet");
        cam1.setCarga(566.34);
        cam2.setColor("Rojo");
        
        System.out.println("\nAUTO 1:"); car1.showData();
        System.out.println("\nAUTO 2:"); car2.showData();
        System.out.println("\nCAMION 1"); cam1.showData();
        System.out.println("\nCAMION 2"); cam2.showData();
    }
}
