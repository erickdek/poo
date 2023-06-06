import java.util.ArrayList;
import java.util.List;

class Equipo {
    private static int equipoCount = 1;
    private int idEquipo;
    private String nombre;
    private List<Estudiante> integrantes;

    public Equipo(String nombre) {
        this.idEquipo = equipoCount++;
        this.nombre = nombre;
        this.integrantes = new ArrayList<>();
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Estudiante> getIntegrantes() {
        return integrantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        integrantes.add(estudiante);
    }

    public void mostrarIntegrantes() {
        for (Estudiante estudiante : integrantes) {
            System.out.println(estudiante);
        }
    }

    public int getMaxIntegrantes() {
        if (nombre.equals("Futbol Masculino") || nombre.equals("Futbol Femenino")) {
            return 16;
        } else if (nombre.equals("Basquet Masculino") || nombre.equals("Basquet Femenino")) {
            return 10;
        } else if (nombre.equals("Voley Masculino")) {
            return 6;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "idEquipo=" + idEquipo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}