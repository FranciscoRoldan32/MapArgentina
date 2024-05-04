package construccion;

import java.util.ArrayList;

public class Vertice {

	private ArrayList<Arista> aristas;
	private String data;

	public Vertice(String data) {
		// TODO Auto-generated constructor stub
		this.aristas = new ArrayList<Arista>();
		this.data = data;
	}

	public void addEdge(Vertice dest, Integer weight) {
		this.aristas.add(new Arista(this, dest, weight));
		// this.edges.add(new Edge(dest, this,weight));
	}

	public void removeEdge(Vertice dest) {
		aristas.removeIf(edge -> edge.getDestino().equals(dest));
	}

	public ArrayList<Arista> getAristas() {
		return aristas;
	}

	public void print() {
		String message = "";

		if (this.aristas.size() == 0) {
			System.out.println(this.data + " -->");
			return;
		}

		for (int i = 0; i < this.aristas.size(); i++) {
			if (i == 0) {
				message += this.aristas.get(i).getOrigen().data + " -->  ";
			}

			message += this.aristas.get(i).getDestino().data;

			message += " (" + this.aristas.get(i).getWeight() + ")";

			if (i != this.aristas.size() - 1) {
				message += ", ";
			}
		}
		System.out.println(message);
	}

}
