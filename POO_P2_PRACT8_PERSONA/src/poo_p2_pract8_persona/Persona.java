package poo_p2_pract8_persona;

public class Persona {
    public String name;
    protected long cedula;
    public int edad;
    public String genero;
    
    public Persona(String nombre, int edad, String genero, long cedula){
        this.name = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.genero = genero;
    }

    public String getName() {
        return name;
    }

    public long getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
