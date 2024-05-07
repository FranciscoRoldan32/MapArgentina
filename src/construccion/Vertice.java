package construccion;

import java.util.ArrayList;

import org.openstreetmap.gui.jmapviewer.Coordinate;

public class Vertice {

	private ArrayList<Arista> aristas;
	private String nombre;
	private Coordinate coords;

	public Vertice(String nombre,Coordinate coords) {
		// TODO Auto-generated constructor stub
		this.aristas = new ArrayList<Arista>();
		this.nombre=nombre;
		this.coords=coords;
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
			System.out.println(this.nombre + " -->");
			return;
		}

		for (int i = 0; i < this.aristas.size(); i++) {
			if (i == 0) {
				message += this.aristas.get(i).getOrigen().nombre + " -->  ";
			}

			message += this.aristas.get(i).getDestino().nombre;

			message += " (" + this.aristas.get(i).getWeight() + ")";

			if (i != this.aristas.size() - 1) {
				message += ", ";
			}
		}
		System.out.println(message);
	}
	public String getNombre() {
		return nombre;
	}
	
	public Coordinate getCoords() {
		return coords;
	}

	

}
