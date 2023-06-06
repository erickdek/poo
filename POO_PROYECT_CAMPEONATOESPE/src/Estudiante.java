class Estudiante {
    private int numero;
    private String idEstudiante;
    private String cedula;
    private String nombres;
    private String apellidos;
    private int semestre;

    public Estudiante(int numero, String idEstudiante, String cedula, String nombres, String apellidos, int semestre) {
        this.numero = numero;
        this.idEstudiante = idEstudiante;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.semestre = semestre;
    }

    public int getNumero() {
        return numero;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getSemestre() {
        return semestre;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "numero=" + numero +
                ", idEstudiante='" + idEstudiante + '\'' +
                ", cedula='" + cedula + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", semestre=" + semestre +
                '}';
    }
}