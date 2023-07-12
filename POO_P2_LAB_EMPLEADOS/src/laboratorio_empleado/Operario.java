
package laboratorio_empleado;

import java.time.LocalDate;
import java.time.Period;


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
      
        if(getEdad()>30&&this.getNivel()>2){
            System.out.println("SE HA HECHO ACREEDOR A UN DOBLE BONO POR SUPERAR LOS 30 AÑOS DE EDAD"
                    + "Y TENER UN NIVEL SUPERIOR A 2");
            setSalario(getSalario()+(2*bono));
            System.out.println("SU SALARIO ACTUAL ES DE :"+getSalario());
            
            
        }else {
            if(getEdad()>30||this.getNivel()>2){
                if(getEdad()>30){
                    System.out.println("SE HA HECHO ACREEDOR A UN BONO POR SUPERAR LOS 30 AÑOS DE EDAD");
                    setSalario(getSalario()+bono);
                    System.out.println("SU SALARIO ACTUAL ES DE :"+getSalario());
                    
                }else{
                    System.out.println("SE HA HECHO ACREEDOR A UN BONO POR SUPERAR EL NIVEL 2");
                    setSalario(getSalario()+bono);
                    System.out.println("SU SALARIO ACTUAL ES DE :"+getSalario());
                }
            }else{
                System.out.println("NO HA RECIBIDO NIGUNA BONIFICACIÓN A SU SALARIO");
            }
        }
        
    }
    
    public void actualizarnivel(){
        LocalDate fechaactual= LocalDate.now();
        Period diferencia= Period.between(getFechaingreso(), fechaactual);
        int años = diferencia.getYears();
        int meses=diferencia.getMonths();
        int dias=diferencia.getDays();
        int totaldias=(((años*12)*365)+dias);
        System.out.println(totaldias);
        System.out.println("USTED LLEVA EN SU ACTUAL TRABAJO "+años+" años"+meses+" meses"+dias+" dias");
        if(totaldias>730){
            if(getNivel()<5){
                setNivel(getNivel()+1);
                System.out.println("USTED LLEVA MAS DE DOS AÑOS EN LA EMPRESA A SIDO PROMOVIDO AL NIVEL "+getNivel());
            }else{
                System.out.println("SU NIVEL YA ES EL 5");
            }
        }
        
    }

  
    
}
