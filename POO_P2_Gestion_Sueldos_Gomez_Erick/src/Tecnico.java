
public class Tecnico extends Personal {
	private int nivel;
	
	public Tecnico(String nom, String ape, int edad, int nivel) {
		super(nom, ape, edad);
		this.nivel = nivel;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	@Override
	String getNomApe() {
		String NomApe = this.getNombre() + " " + this.getApellidos();
		return NomApe;
	}
	
	

}
