package laboratorio_empleado;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Laboratorio_empleado {
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nombre,departamento, fechaingresost = null;
        int op, edad,nivel,numpersonal;
        double salario;
        LocalDate fechaingreso = null;
        
        do{
            System.out.println(
                "=================" +
                "\nElija una opcion" +
                "\n1. Director" +
                "\n2. Operario" +
                "\n3. Salir"
            );
            op = sc.nextInt();
            switch(op){
                case 1:
                    //Limpieza
                    sc.nextLine();
                    System.out.println("Usuario tipo Director ");
                    System.out.print("Ingrese el nombre: ");
                    nombre=sc.nextLine();
                    System.out.print("Ingrese la edad: ");
                    edad=sc.nextInt();
                    sc.nextLine();
                    
                    //Metodo estatico
                    fechaingreso = fechaInput(sc);
                    
                    System.out.print("Ingrese su salario actual: ");
                    salario=sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Ingrese el departamento que pertenece: ");
                    departamento= sc.nextLine();
                    System.out.print("Ingrese la cantidad de personas que esta encargado: ");
                    numpersonal= sc.nextInt();
                    
                    //Nuevo objeto con los datos
                    Director dir= new Director(nombre,edad,fechaingreso,salario,departamento,numpersonal);
                    dir.incentivar();
                    break;
                    
                case 2:
                    sc.nextLine();
                    System.out.println("Operario ");
                    System.out.print("Ingrese el nombre: ");
                    nombre=sc.nextLine();
                    System.out.print("Ingrese la edad: ");
                    edad=sc.nextInt();
                    sc.nextLine();
                    
                    //Metodo estatico
                    fechaingreso = fechaInput(sc);
                    
                    System.out.print("Ingrese su salario actual: ");
                    salario=sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Ingrese el nivel actual: ");
                    nivel= sc.nextInt();
                    
                    //Nuevo objeto con los datos
                    Operario oper = new Operario(nombre,edad,fechaingreso,salario,nivel);
                    oper.actualizarnivel();
                    oper.incentivar();
                    break;
                    
                default:
                    System.out.println("Gracias por usar.");
                    break;
                    
            }
        }while(op != 3);
        
    }
    
    public static LocalDate fechaInput(Scanner sc){
        String fechaingresost;
        LocalDate date = LocalDate.now();
        int error;
        
        do{
            try{
                System.out.print("Fecha que ingreso a trabajar en formato: (YYYY-MM-DD): ");
                fechaingresost = sc.nextLine();
                date = LocalDate.parse(fechaingresost, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                error=0;
            }catch(DateTimeParseException e){
                System.out.println("La fecha no corresponde con el formato año-mes-dia (YYYY-MM-DD)");
                error=1;
            }

        }while( error == 1);
        return date;
    }
    
}
