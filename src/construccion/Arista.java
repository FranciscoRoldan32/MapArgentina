package construccion;

import java.util.Comparator;

public class Arista implements Comparator<Arista> {

	private Vertice origen;

	private Vertice destino;

	private Integer weight;

	public Arista(Vertice origen,Vertice destino, Integer weight){
	        this.origen = origen;
	        this.destino = destino;
	        this.weight = weight;
	    }

	public Vertice getOrigen() {
		return origen;
	}

	public Vertice getDestino() {
		return destino;
	}

	public Integer getWeight() {
		return weight;
	}

	@Override
	public int compare(Arista e1, Arista e2) {
		return e1.weight - e2.weight;
	}


}


