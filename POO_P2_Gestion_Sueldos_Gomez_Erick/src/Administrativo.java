
public class Administrativo extends Personal {
	private String seccion;
	
	public Administrativo(String nom, String ape, int edad, String seccion) {
		super(nom, ape, edad);
		this.seccion = seccion;
	}

	@Override
	String getNomApe() {
		String NomApe = this.getNombre() + " " + this.getApellidos();
		return NomApe;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	
}
