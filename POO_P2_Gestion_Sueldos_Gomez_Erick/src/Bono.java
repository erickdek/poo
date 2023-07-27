
public class Bono {
	private String desc;
	private int ope;
	private double amount;
	
	public Bono(String desc, int ope, double amount) {
		super();
		this.desc = desc;
		this.ope = ope;
		this.amount = amount;
	}
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getOpe() {
		return ope;
	}
	public void setOpe(int ope) {
		this.ope = ope;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
