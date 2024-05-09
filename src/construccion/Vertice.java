package construccion;

public class Vertice {
	
	private String label;
	private int indice;

	public Vertice(String label,int indice) {
		// TODO Auto-generated constructor stub
		this.indice=indice;
		this.label=label;
	}
	
	public int getIndice() {
		return indice;
	}
	
	public String getLabel() {
		return label;
	}
}
