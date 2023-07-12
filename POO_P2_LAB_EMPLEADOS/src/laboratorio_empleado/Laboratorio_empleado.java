
package laboratorio_empleado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Laboratorio_empleado {
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        String nombre,departamento;
        String fechaingresost=null;
        int edad,nivel,numpersonal,error;
        
        double salario;
        LocalDate fechaingreso=null;
        int op1;
        
        do{
            System.out.println("-----------BIENVENIDOS AL SISTEMA DE GESTION DE EMPLEADOS--------------"
                + "\n1. Director"
                + "\n2. Operario"
                + "\n3. Salir"
                + "\n Digite 1,2,3");
            op1=entrada.nextInt();
            switch(op1){
                case 1:
                 
                    entrada.nextLine();
                    System.out.println("USUARIO DIRECTOR ");
                    System.out.print("INGRESE SU NOMBRE: ");
                    nombre=entrada.nextLine();
                    System.out.print("INGRESE SU EDAD: ");
                    edad=entrada.nextInt();
                    entrada.nextLine();
                    error=0;
                    do{
                        try{
                            System.out.print("INGRESE LA FECHA QUE INGRESO A TRABAJAR en el formato(YYYY-MM-DD): ");
                            fechaingresost=entrada.nextLine();
                            fechaingreso=LocalDate.parse(fechaingresost, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                            error=0;
                        }catch(DateTimeParseException e){
                            System.out.println("LA FECHA INGRESADA NO ESTA EN EL FORMATO (YYYY-MM-DD)");
                            error=1;
                        }
                                
                    }while(error==1);
                    System.out.print("INGRESE SU SALARIO ANUAL: ");
                    salario=entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("INGRESE AL DEPARTAMENTO QUE PERTENECE: ");
                    departamento= entrada.nextLine();
                    System.out.print("INGRESE CUANTO PERSONAL MANEJA: ");
                    numpersonal= entrada.nextInt();
                    Director dir= new Director(nombre,edad,fechaingreso,salario,departamento,numpersonal);
                    dir.incentivar();
                    
                    break;
                    
                case 2:
                    entrada.nextLine();
                    System.out.println("USUARIO OPERARIO ");
                    System.out.print("INGRESE SU NOMBRE: ");
                    nombre=entrada.nextLine();
                    System.out.print("INGRESE SU EDAD: ");
                    edad=entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("INGRESE LA FECHA QUE INGRESO A TRABAJAR en el formato(YYYY-MM-DD): ");
                    fechaingresost=entrada.nextLine();
                    fechaingreso=LocalDate.parse(fechaingresost, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    System.out.print("INGRESE SU SALARIO ANUAL: ");
                    salario=entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("INGRESE EL NIVEL EN QUE SE ENCUENTRA: ");
                    nivel= entrada.nextInt();
                    Operario oper= new Operario(nombre,edad,fechaingreso,salario,nivel);
                    oper.actualizarnivel();
                    oper.incentivar();
                    
                    break;
                default:
                    System.out.println("SALIENDO.....");
                    break;
                    
                 
                    
            }
        }while(op1!=3);
        
    }
    
}
