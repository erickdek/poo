package laboratorio_empleado;
import java.time.LocalDate;

public abstract class Empleado {
    private String nombre;
    private int edad;
    private LocalDate fechaingreso;
    double salario;
    final double bono = 450.0; //Final es constante
    
    public abstract void incentivar();
  
    public Empleado(String nombre, int edad, LocalDate fechaingreso, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaingreso = fechaingreso;
        this.salario = salario;
    }

    public LocalDate getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(LocalDate fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

    public String getNombre() {
        return nombre;
                
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    
}
