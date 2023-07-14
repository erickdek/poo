package poo_p2_practica_archivos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author erick
 */
public class POO_P2_PRACTICA_ARCHIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String archivoEntrada = "TESTFILE.txt";
        String archivoSalida = "TESTFILEOUT.txt";

        try {
            //Creamos los archivos
            File fileRead = new File(archivoEntrada);
            File fileOut = new File(archivoSalida);
            if (!(fileRead.exists() && fileOut.exists())){
                PrintWriter fileread = new PrintWriter(archivoEntrada);
                PrintWriter fileout = new PrintWriter(archivoSalida);
            }
            
            // Leer el archivo de entrada
            FileReader fr = new FileReader(archivoEntrada);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            int contadorLineas = 0;
            int contadorPalabras = 0;

            // Contar líneas y palabras
            while ((linea = br.readLine()) != null) {
                contadorLineas++;
                String[] palabras = linea.split(" ");
                contadorPalabras += palabras.length;
            }

            // Cerrar el archivo de entrada
            br.close();
            fr.close();

            // Escribir los resultados en el archivo de salida
            FileWriter fw = new FileWriter(archivoSalida);
            BufferedWriter bw = new BufferedWriter(fw);

            String resultado = "Número de líneas: " + contadorLineas + "\n";
            resultado += "Número de palabras: " + contadorPalabras;

            bw.write(resultado);

            // Cerrar el archivo de salida
            bw.close();
            fw.close();

            System.out.println("Conteo de lineas y palabras completado. Los resultados se han guardado en el archivo de salida.");

        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
    
}
