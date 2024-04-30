package construccion;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Grafo {
	
	private int [][] matriz;
	private List<Arista> aristas;
	
	public Grafo(int vertices) {
		matriz = new int[vertices][vertices];
		aristas = new ArrayList<>();
	}

}
