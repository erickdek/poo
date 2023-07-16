package laboratorio_empleado;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

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
        LocalDate currentDate= LocalDate.now();
        Period difFechas = Period.between(getFechaingreso(),currentDate);
        int numMeses = difFechas.getMonths();
        int numYears = difFechas.getYears();
        int numDias = difFechas.getDays();
        
        //Obtener el numero total de dias
        long numTMeses = ChronoUnit.MONTHS.between(getFechaingreso(), currentDate);
        
        System.out.println("Usted ha trabajado por: " + numTMeses + " MESES");
        System.out.println("Usted ha estado trabajando por: " + numYears + " años, " + numMeses + " meses y " + numDias + " dias");
        
        if(numTMeses > 30 && this.getNumpersonal() > 20){
            System.out.println("Su salario actual es de: $USD"+getSalario());
            setSalario(getSalario()+(2*bono));
            System.out.println("Por haber superado 30 meses en el trabajo y tener a cargo a más de 20 personas"
                    + "\nSu salario actual es de: $USD"+getSalario());
            return;
            
        } else if(numTMeses > 30 || this.getNumpersonal() > 20) {
            System.out.println("Su salario actual es de: $USD"+getSalario());
            setSalario(getSalario()+bono);
            System.out.println("Usted fue apto para un bono."
            + "\nSu salario actual es de: $USD"+getSalario());
            return;
            
        }
            //Caso contrario todo
            System.out.println("No ha sido aceptado para el Bono...");
            System.out.println("Su salario es de: $USD:"+getSalario());
        }
        
    
    
}
