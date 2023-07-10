package poo_p2_pract15_ficheros;
import java.io.*;
/**
 *
 * @author ESPE
 */
public class FileManage {
    public static void crearArchivo(String nomArchivo){
        try {
            File file = new File(nomArchivo);
            PrintWriter fileout = new PrintWriter(file);
            System.out.println("Archivo creado.");
        } catch(FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch(Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static void writeArchivo(String nomArchivo, String content){
        try {
            File file = new File(nomArchivo);
            PrintWriter fileout = new PrintWriter(file);
            fileout.println(content);
            fileout.close();
            System.out.println("El archivo fue modificado.");
        } catch(FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch(Exception e) {
            e.printStackTrace(System.out);
        } 
    }
    
    public static void readArchivo(String nomArchivo){
        try {
            File file = new File(nomArchivo);
            BufferedReader contentFile = new BufferedReader(new FileReader(file));
            String line = contentFile.readLine();
            while (line != null){
                System.out.println(line);
                line = contentFile.readLine();
            }
            
            System.out.println("El archivo fue recorrido.");
        } catch(FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch(Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static void deleteArchivo(String nomArchivo){
        try {
            File file = new File(nomArchivo);
            System.out.println(file.exists());
            file.delete();
            
            System.out.println("El archivo fue eliminado.");
        } catch(Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
