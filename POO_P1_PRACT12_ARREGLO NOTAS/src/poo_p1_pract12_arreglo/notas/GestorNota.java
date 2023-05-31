package poo_p1_pract12_arreglo.notas;
import java.util.ArrayList;

/**
 *
 * @author erick
 */
public class GestorNota {
    ArrayList<Double> notas;
    
    public GestorNota(){
        notas = new ArrayList<>();
    }
    
    public void guardarNota (double n){
        notas.add(n);
    }
    
    public double media(){
        double media=0;
        for (double d:notas){
            media += d;
        }
        return media/notas.size();
    }
    
    public int aprobados(){
        int ap = 0;
        for (double d: notas){
            if (d >= 14){
                ap++;
            }
        }
        return ap;
    }
    
    
}
