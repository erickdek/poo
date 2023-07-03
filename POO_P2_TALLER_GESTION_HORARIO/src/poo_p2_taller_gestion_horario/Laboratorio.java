package poo_p2_taller_gestion_horario;

/**
 *
 * @author erick
 */
class Laboratorio {
    private String nombre;
    private String lugar;
    private int capacidadEstudiantes;
    private Persona encargado;
    private Horario horario;

    public Laboratorio(String nombre, String lugar, int capacidadEstudiantes, Persona encargado) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.capacidadEstudiantes = capacidadEstudiantes;
        this.encargado = encargado;
        this.horario = new Horario();
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public int getCapacidadEstudiantes() {
        return capacidadEstudiantes;
    }

    public Persona getEncargado() {
        return encargado;
    }

    public void setEncargado(Persona encargado) {
        this.encargado = encargado;
    }
    
    public boolean setHora(int dia, int hora, String asignatura){
        horario.asignarHorario(dia, hora, asignatura, this.nombre);
        return true;
    }
    
    public void showHorario(){
        horario.mostrarHorario();
    }
}