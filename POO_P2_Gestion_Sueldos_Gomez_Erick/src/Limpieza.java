
public class Limpieza extends Personal {
	private String area;
	public Limpieza(String nom, String ape, int edad, String area) {
		super(nom, ape, edad);
		this.area = area;
	}

	@Override
	String getNomApe() {
		String NomApe = this.getNombre() +" " + this.getApellidos();
		return NomApe;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	
}
