package laboratorio_empleado;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class Operario extends Empleado {
    private int nivel;

    public Operario(String nombre, int edad, LocalDate fechaingreso, double salario,int nivel) {
        super(nombre, edad, fechaingreso, salario);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void incentivar() {
      
        if( getEdad() > 30 && this.getNivel()> 2 ){
            System.out.println("Por superar los 30 años, y un nivel mayor a 2, obtendra un doble bono");
            //Obtener el doble bono y sumarle al salario actual
            setSalario( getSalario() + (2*bono) );
            System.out.println("Su salario actual es de: $USD"+getSalario());
            return;

        } else if(getEdad() > 30 || this.getNivel() > 2){
            System.out.println("Usted fue apto para un bono.");
            //Obtener el bono y sumarle al salario actual
            setSalario(getSalario()+bono);
            System.out.println("Su salario actual es de: $USD:"+getSalario());
            return;
        }

        //Caso contrario todo
        System.out.println("No ha sido aceptado para el Bono...");
        System.out.println("Su salario es de: $USD:"+getSalario());
        
        
    }
    
    public void actualizarnivel(){
        LocalDate currentDate = LocalDate.now();
        Period difFechas = Period.between(getFechaingreso(), currentDate);
        int numYears = difFechas.getYears();
        int numMeses = difFechas.getMonths();
        int numDias = difFechas.getDays();
        //Obtener el numero total de dias
        long numTDias = ChronoUnit.DAYS.between(getFechaingreso(), currentDate);

        System.out.println("Numero de dias trabajando: " + numTDias);
        System.out.println("Usted ha estado trabajando por: " + numYears + " años, " + numMeses + " meses y " + numDias + " dias");
        if(numTDias>730){
            if(getNivel()<5){
                setNivel(getNivel()+1);
                System.out.println("Usted lleva mas de 2 años en la empresa, su nivel ahora es: "+getNivel());
            }else{
                System.out.println("Su nivel actual ya es igual a 5");
            }
        }
        
    }

  
    
}
