package poo_p1_evaluacion_1;
import java.util.ArrayList; //Importamos la clase ArrayList para poder realizar arrays.
/**
 *
 * @author erick
 */
public class RegistroNota {
    private ArrayList<Nota> notas; //Array notas de objetos Nota
    
    //Constructor RegistroNota
    public RegistroNota() {
        notas = new ArrayList<>();
    }
    
    //Agregar una nota en el Array
    public void addNota(String nombre, double calificacion) {
        Nota nota = new Nota(nombre, calificacion);
        notas.add(nota);
    }
    
    //Metodo - Check si hay notas
    public boolean checkNota() {
        if (notas.isEmpty()) return true;
        return false;
    }
    
    //Metodo - Calcular la Media
    public double calcMedia() {
        if (this.checkNota()) return 0.0; //Si las notas estan vacias devolvemos 0.0

        double suma = 0.0; //Suma de las notas
        for (Nota nota : notas) { //El objeto es Nota, Recorremos el array y establecemos como nota cada datos guardado.
            suma += nota.getCalificacion(); //Sumamos la nota del objeto
        }

        return suma / notas.size(); //Devolvemos la nota, dividido para el tamano del array
    }
    
    //Metodo - Mostrar los aprobados
    public void showAprobados() {
        if ( this.checkNota() ) { //Si las notas estan vacias devolvemos 0.0
            System.out.println("No se encuentran notas...");
            return;
        }
        
        int contn = 0; // Contador de notas
        for (Nota nota : notas) { //El objeto es Nota, Recorremos el array y establecemos como nota cada datos guardado.
            if( nota.getCalificacion() >= 14 && nota.getCalificacion() <= 20) {
                contn ++;
                System.out.println( contn + ". " + nota.getNombre() + " - APROBO : " + nota.getCalificacion() );
            }
        }
    }
    
    //Metodo - Mostrar las Notas Cargadas
    public void showNotas( boolean OnlyAprobados ) {
        if ( this.checkNota() ) { //Si las notas estan vacias devolvemos 0.0
            System.out.println("No se encuentran notas...");
            return;
        }
        
        int contn = 0; // Contador de notas
        for (Nota nota : notas) { //El objeto es Nota, Recorremos el array y establecemos como nota cada datos guardado.
            if( nota.getCalificacion() >= 14 && nota.getCalificacion() <= 20) {
                contn ++;
                System.out.println( contn + ". " + nota.getNombre() + " - APROBO : " + nota.getCalificacion() );
            } else if ( nota.getCalificacion() < 14 && OnlyAprobados == false ) {
                contn ++;
                System.out.println( contn + ". " + nota.getNombre() + " - NEGADO : " + nota.getCalificacion() );
            }
        }
    }
}
