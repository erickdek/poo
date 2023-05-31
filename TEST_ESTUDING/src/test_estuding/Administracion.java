package test_estuding;
import java.util.ArrayList;
/**
 *
 * @author erick
 */
public class Administracion {
    public ArrayList<Notas> arrNotas; //Creamos el array tipo objetos Notas
    public ArrayList<Notas> arrBestNotas; //Creamos el array tipo objetos Notas - Las mejores notas

    public Administracion() {
        arrNotas = new ArrayList<>(); //Establecer el arrNotas para guardar datos como array.
        arrNotas = new ArrayList<>();
    }
    
    public void addNotas(double nota, String name, int cedula){
        Notas nota1 = new Notas(nota, name, cedula);
        arrNotas.add(nota1);
    }
    
    public int showBestStudents( int limit ){ //10
        int num;
        this.arrBestNotas = this.arrNotas;
        for(int i=0;i<(this.arrBestNotas.size()-1);i++){
            for(int j=0;j<(this.arrBestNotas.size()-i-1);j++){
                Notas num1 = this.arrBestNotas.get(j); //num1 = asdjjasd[0];
                Notas num2 = this.arrBestNotas.get(j+1); //num2 = asdjjasd[0];
                if( num1.nota < num2.nota){ //mayor a menor
                    Notas aux =  this.arrBestNotas.get(j); //aux = asdjjasd[j];
                    this.arrBestNotas.set(j, num2); //asdjjasd[j] = num2;
                    this.arrBestNotas.set(j+1, aux);//asdjjasd[j+1] = aux;
                }
            }
        }
        
        //0,1,2,3,4,5,6,7,8,9
        for (int i = 0; i < limit ; i++){
            num = i; //num = 0
            num ++; //num = 1
            Notas nota = this.arrBestNotas.get(i); //Creamos la varaible nota que guarda un objeto tipo Notas
            System.out.println( num + ": Estudiante: " + nota.nombre + " - Nota: " + nota.nota);
        }
        return 0;
    }
    
    public int showStudents(){ //10
        int num;
        this.arrBestNotas = this.arrNotas;
        for (int i = 0; i < this.arrBestNotas.size() ; i++){
            num = i; //num = 0
            num ++; //num = 1
            Notas nota = this.arrBestNotas.get(i); //Creamos la varaible nota que guarda un objeto tipo Notas
            System.out.println( num + ": Estudiante: " + nota.nombre + " - Nota: " + nota.nota);
        }
        return 0;
    }
    
    public double promNotas(){
        double notasTotal = 0.0;
        for (int i = 0; i < this.arrNotas.size() ; i++){
            Notas nota = this.arrNotas.get(i); //Creamos la varaible nota que guarda un objeto tipo Notas
            notasTotal += nota.nota;
        }
        return notasTotal / this.arrNotas.size();
    }
    
    public void showReprobados(){
        int num;
        double notasTotal = 0.0;
        for (int i = 0; i < this.arrNotas.size() ; i++){
            num = i; //num = 0
            num ++; //num = 1
            Notas nota = this.arrNotas.get(i); //Creamos la varaible nota que guarda un objeto tipo Notas
            if (nota.nota < 7){
                System.out.println( num + ": Estudiante REPROBADO: " + nota.nombre + " - Nota: " + nota.nota);
            }
            notasTotal += nota.nota;
        }
    }
    
    public void searchCedula(int cedula){
        int num;
        if ( this.arrNotas.size() == 0){
            System.out.println( "Por favor agrega a un estudiante...");
            return; //Aqui en adelante ya no se ejecuta
        }
        for (int i = 0; i < this.arrNotas.size() ; i++){
            num = i; //num = 0
            num ++; //num = 1
            Notas nota = this.arrNotas.get(i); //Creamos la varaible nota que guarda un objeto tipo Notas
            if (nota.getCedula() == cedula){
                System.out.println( "El Estudiante encontrado fue: ");
                System.out.println( num + ": Estudiante: " + nota.nombre + " - Cedula: " + nota.getCedula() + " - Nota: " + nota.nota);
            } else {
                System.out.println( "No se ha encontrado el estudiante.");
            }
        }
    }
}
