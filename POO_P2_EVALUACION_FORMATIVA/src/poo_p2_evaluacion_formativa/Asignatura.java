package poo_p2_evaluacion_formativa;
import java.util.*;

/**
 *
 * @author erick
 */
public class Asignatura {
    private String nombre;
    public int Profesor;
    public List<Estudiante> Estudiantes;

    public Asignatura(String nombre, int profe) {
        this.nombre = nombre;
        this.Profesor = profe;
    }
    
    public void setProfesor(int profesor) {
        this.Profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getProfesor() {
        return Profesor;
    }
    
    public void showEstudiante(){
        int i = 1;
        try {
            if (Estudiantes.size() == 0){
                System.out.println("No hay estudiants");
                return;
            }
            for (Estudiante estudiante : Estudiantes){
                System.out.println(i + " "+estudiante.getNombre());
                i++;
            }
        } catch(Exception e){
            System.out.println("Hubo un error");
        }
    }

    public void addEstudiante(Scanner sc){
        String nombre, codeU; long CI; int edad;
            System.out.println("Ingrese el nombre del estudiante: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese el codigo de la institucion del estudiante: ");
            codeU = sc.nextLine();
            System.out.println("Ingrese la cedula del estudiante: ");
            CI = sc.nextLong();
            System.out.println("Ingrese la edad del estudiante: ");
            edad = sc.nextInt();
            
            Estudiantes.add(new Estudiante( nombre, codeU, CI, edad));
            System.out.println("Datos guardados.");
    }
    
    public void addEstudiante(Scanner sc, int limit){
        String nombre, codeU; long CI; int edad;
        
        for ( int i = 0; i < limit; i ++){
            System.out.println("Ingrese el nombre del estudiante " + i+1 + ": ");
            nombre = sc.nextLine();
            System.out.println("Ingrese el codigo de la institucion del estudiante " + i+1 + ": ");
            codeU = sc.nextLine();
            System.out.println("Ingrese la cedula del estudiante " + i+1 + ": ");
            CI = sc.nextLong();
            System.out.println("Ingrese la edad del estudiante " + i+1 + ": ");
            edad = sc.nextInt();
            
            Estudiantes.add(new Estudiante( nombre, codeU, CI, edad));
            System.out.println("Datos guardados.");
        }
    }
}
