package construccion;


import java.util.ArrayList;
import java.util.Random;

import org.openstreetmap.gui.jmapviewer.Coordinate;


public class Grafo {

	    private static ArrayList<Vertice> vertices;
	    private ArrayList<Arista> aristas;
	    private ArrayList<Provincias>provs;
	    private Random rand;

	    public Grafo(){
	    	Provincias.crearProvs();
	        this.vertices = new ArrayList<Vertice>();
	        this.provs= Provincias.getListProv();
	        this.rand=new Random();
	    }


	    public Vertice addVertex(){
	    	int index = generarNumAleatorio();
	    	Provincias prov= provs.get(index);
	    	Coordinate coords = new Coordinate(prov.getLat(),prov.getLongitud());
	        Vertice vertice = new Vertice(prov.getNombre(),coords);
	        provs.remove(index);
			if (!vertices.contains(vertice)) {
				this.vertices.add(vertice);
			}
	        return vertice;
	    }

	    public void addEdge(Vertice initVertex, Vertice finalVertex, Integer weight){
	        initVertex.addEdge(finalVertex, weight);
	        finalVertex.addEdge(initVertex, weight);
	    }

	    public void removeEdge(Vertice initVertex, Vertice finalVertex){
	        initVertex.removeEdge(finalVertex);
	        finalVertex.removeEdge(initVertex);
	    }

	    public void removeVertex(Vertice prov){
	        vertices.remove(prov);
	    }

	    public ArrayList<Vertice> getVertices() {
	        return vertices;
	    }

	    public void print(){
	        for(Vertice p : this.vertices){
	            p.print();
	        }
	    }

	    
	 
//
//	    public static void main(String[] args) {
//	       Grafo Argentina = new Grafo();
//
//	        ArrayList<Vertice> nombreProv = vertices;
//	        Vertice[] provinces = new Vertice[nombreProv.size()];
//	        for (int i = 0; i < nombreProv.size(); i++) {
//	            provinces[i] = Argentina.addVertex(nombreProv[i]);
//	        }
//	    
//	        //Esto es una prueba no es algo definitivo pero es para ver si funciona los metodos
//	    
//	        // Ejemplo de cómo agregar algunos Edges o Artistas
//	        Argentina.addEdge(provinces[0], provinces[1], 1); // Ejemplo de borde entre Buenos Aires y capital
//	        Argentina.addEdge(provinces[0], provinces[2], 5); // Ejemplo de borde entre Buenos Aires y Catamarca
//	    
//	        // Imprime el grafo
//	        Argentina.print();
//	    }
	    private int generarNumAleatorio() {
	    	return rand.nextInt(provs.size());
	    }
}
