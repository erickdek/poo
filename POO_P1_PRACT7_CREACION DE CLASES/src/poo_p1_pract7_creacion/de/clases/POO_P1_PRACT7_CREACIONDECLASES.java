package poo_p1_pract7_creacion.de.clases;
public class POO_P1_PRACT7_CREACIONDECLASES {
    public static void main(String[] args) {
        //Nuevo objeto PC1
        Computador pc1 = new Computador();
        pc1.cpu = "Intel CPU";
        pc1.cores = 4;
        pc1.disk = "SSD";
        pc1.storage = 512;
        pc1.ram = 8;
        pc1.type_ram = "DDR4";
        System.out.println( 
                " - CPU: " + pc1.cpu +
                " - Nucleos: " + pc1.cores + 
                " - RAM: " + pc1.ram + 
                " - TIPO: " + pc1.type_ram
        );
        //Nuevo objeto PSCREEN1
        Monitor screen1 = new Monitor();
        screen1.color = "Negro";
        screen1.conector = "DP";
        screen1.hz = 60;
        screen1.marca = "ASUS";
        screen1.modelo = "HILLIX-123K";
        screen1.peso = 6;
        System.out.println( 
                " - Monitor: " + screen1.modelo +
                " - Marca: " + screen1.marca + 
                " - Color: " + screen1.color + 
                " - Peso: " + screen1.peso
        );
        
        //Nuevo objeto PRINT1
        Impresora print1 = new Impresora();
        print1.color = "Negro";
        print1.marca = "EPSON";
        print1.modelo = "KLM-451";
        print1.peso = 6;
        print1.tamano = "Mediano";
        print1.wifi = true;
        System.out.println( 
                " - Monitor: " + print1.modelo +
                " - Marca: " + print1.marca + 
                " - Color: " + print1.color + 
                " - Peso: " + print1.peso
        );
    }
}
