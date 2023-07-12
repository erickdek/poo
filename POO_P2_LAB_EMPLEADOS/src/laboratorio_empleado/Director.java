
package laboratorio_empleado;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Director extends Empleado {
    private String departamento;
    private int numpersonal;

    public Director( String nombre, int edad, LocalDate fechaingreso, double salario,String departamento, int numpersonal) {
        super(nombre, edad, fechaingreso, salario);
        this.departamento = departamento;
        this.numpersonal = numpersonal;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNumpersonal() {
        return numpersonal;
    }

    public void setNumpersonal(int numpersonal) {
        this.numpersonal = numpersonal;
    }

    @Override
    public void incentivar() {
        LocalDate fechaactual= LocalDate.now();
        Period diferencia=Period.between(getFechaingreso(),fechaactual);
        int meses = diferencia.getMonths();
        int años= diferencia.getYears();
        int totalmeses=(años*12)+meses;
        System.out.println("SU PERMANENCIA EN EL TRABAJO ES DE "+totalmeses+" MESES");
        if(totalmeses>30&&this.getNumpersonal()>20){
            System.out.println("SU SALARIO ACTUAL ES DE :"+getSalario());
            setSalario(getSalario()+(2*bono));
            System.out.println("POR HABER SUPERADO LOS 30 MESES DE ESTANCIA EN EL TRABAJO"
                    + "Y MANEJAR MAS DE 20 PERSONAS EN SU CARGO"
                    + "SU NUEVO SALARIO ES DE "+getSalario());
        }else {
            if(totalmeses>30||this.getNumpersonal()>20){
                if(totalmeses>30){
                    
                    System.out.println("SU SALARIO ACTUAL ES DE :"+getSalario());
                    setSalario(getSalario()+bono);
                    System.out.println("POR HABER SUPERADO LOS 30 MESES DE ESTANCIA EN EL TRABAJO"
                    + "SU NUEVO SALARIO ES DE "+getSalario());
                }else{
                    
                    System.out.println("SU SALARIO ACTUAL ES DE :"+getSalario());
                    setSalario(getSalario()+bono);
                    System.out.println("POR TENER A SU CARGO MAS DE 20 PERSONAS HA RECIBIDO UN BONO A SU SALARIO"
                    + "SU NUEVO SALARIO ES DE "+getSalario());
                }
            }else{
                    System.out.println("NO HA RECIBIDO NIGUNA BONIFICACIÓN A SU SALARIO");
                }
            }
        }
        
    
    
}
