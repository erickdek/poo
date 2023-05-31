package evaluacion_u1_erick_gomez;
import java.util.ArrayList;
    
/**
 *
 * @author erick
 */
public class Gestor {
    ArrayList<Profesor> arrProfes;
    ArrayList<Estudiante> arrEstudiantes;
    ArrayList<Materia> arrMaterias;
    ArrayList<Matricula> arrMatriculas;
    
    public Gestor(){
        arrProfes = new ArrayList<>();
        arrEstudiantes = new ArrayList<>();
        arrMaterias = new ArrayList<>();
        arrMatriculas = new ArrayList<>();
    }
    
    //Agregar un profesor al array
    public boolean addProfe(String name, String direction, long cedula, long phone, long cellphone){
        Profesor profe = new Profesor(name, direction, cedula, phone, cellphone);
        arrProfes.add(profe);
        return true;
    }
    //Verifica si hay mas de 1 elemento en el array
    public boolean checkProfes (){
        if ( arrProfes.size() == 0){
            return false;
        } return true;
    }
    //Visualizar todos los datos del array
    public void showProfes (){
        int position = 0;
        if (!this.checkProfes()){
            //No existen los profesores
            System.out.println("No hay ningun profesor agregado...");
            return;
        }
        for (Profesor profe : arrProfes){
            position++;
            System.out.println( "ID: " + position + " - Nombre: " + profe.getName() + " - Direccion: " + profe.getDirection() );
        }
    }
    
    //Agregar un profesor al array
    public boolean addEstudiante(String name, long cedula, int gener){
        Estudiante estudiante = new Estudiante(name, cedula, gener);
        arrEstudiantes.add(estudiante);
        return true;
    }
    //Verifica si hay mas de 1 elemento en el array
    public boolean checkEstudiantes (){
        if ( arrEstudiantes.size() == 0){
            return false;
        } return true;
    }
    //Visualizar todos los datos del array
    public void showEstudiantes (){
        int position = 0;
        if (!this.checkEstudiantes()){
            //No existen los profesores
            System.out.println("No hay ningun profesor agregado...");
            return;
        }
        for (Profesor profe : arrProfes){
            position++;
            System.out.println( "ID: " + position + " - Nombre: " + profe.getName() + " - Direccion: " + profe.getDirection() );
        }
    }
    
    //Agregar un profesor al array
    public boolean addMateria(String name, int idProfe){
        if (!this.checkProfes()){
            //No existen los profesores
            System.out.println("No hay ningun profesor agregado...");
            return false;
        }
        this.showProfes();
        Materia estudio = new Materia(name, idProfe);
        arrMaterias.add(estudio);
        return true;
    }
    //Verifica si hay mas de 1 elemento en el array
    public boolean checkMaterias (){
        if ( arrMaterias.size() == 0){
            return false;
        } return true;
    }
    //Visualizar todos los datos del array
    public void showMaterias (){
        int position = 0;
        if (!this.checkMaterias()){
            //No existen los profesores
            System.out.println("No hay ninguna materia agregada...");
            return;
        }
        for (Materia materia : arrMaterias){
            position++;
            System.out.println( "ID: " + position + " - Nombre: " + materia.name + " - ID Profesor: " + materia.getIdProfesor() );
        }
    }
    
    //Agregar un profesor al array
    public boolean addMatricula(int idEstudiante, int idMateria){
        Matricula matri = new Matricula(idEstudiante, idMateria);
        arrMatriculas.add(matri);
        return true;
    }
    //Verifica si hay mas de 1 elemento en el array
    public boolean checkMatricula (){
        if ( arrMatriculas.size() == 0){
            return false;
        } return true;
    }
    //Visualizar todos los datos del array
    public void showMatriculas (){
        int position = 0;
        if (!this.checkMatricula()){
            //No existen los profesores
            System.out.println("No hay ninguna matricula agregada...");
            return;
        }
        for (Matricula matricula : arrMatriculas){
            position++;
            Materia estudio = arrMaterias.get( matricula.getIdMateria() );
            System.out.println( "ID: " + position + " \n - Estudiante: " + matricula.getIdEstudiante() + "\n - ID Materia: " + matricula.getIdMateria()  );/*+ " - Materia: " + estudio.name*/
        }
    }
    
    
    
    
}
