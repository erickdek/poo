package poo_p2_pract4_try.pkgcatch.leer.archivos;
import java.io.*;

public class POO_P2_PRACT4_TRYCATCHLEERARCHIVOS {

    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = null;
        br = new BufferedReader(new FileReader("G:\\Mi uniidad\\Universidad\\2DO\\POO\\Practicas\\POO_P2_PRACT4_TRY-CATCH LEER ARCHIVOS\\src\\files\\string.txt"));
        String linea;
        try {
            while((linea=br.readLine()) != null ){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e){
            System.out.println("Vales vrg plena, no esta el archivo pa leer");
        } catch (IOException e){
            System.out.println("Mmmm.. valio la plena");
        } catch (Exception e){
            System.out.println("Mmmm.. valio la plena Default");
        }
    }
    
}
