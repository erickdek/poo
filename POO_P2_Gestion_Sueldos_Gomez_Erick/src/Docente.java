
public class Docente extends Personal {
	private String titulo;

	public Docente(String nom, String ape, int edad, String titulo) {
		super(nom, ape, edad);
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	String getNomApe() {
		String NomApe = this.titulo + " " + this.getNombre() + " " + this.getApellidos();
		return NomApe;
	}
	
	
}
