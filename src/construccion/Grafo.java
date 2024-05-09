package construccion;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openstreetmap.gui.jmapviewer.Coordinate;


public class Grafo {

	    private  ArrayList<Vertice> vertices;
	    private int numVertices;
	    private List<List<Arista>> listaAdj;

	    public Grafo(){
	    	this.numVertices = 0;
	        this.vertices = new ArrayList<>();
	        this.listaAdj= new ArrayList<>();
	    }


	    public Vertice addVertex(String label){
	    	Vertice vertice = new Vertice (label,numVertices);
	    	vertices.add(vertice);
	    	listaAdj.add(new ArrayList<>());
	    	numVertices++;
	        return vertice;
	    }

	    public void addEdge(Vertice origen, Vertice destino, Integer weight){
	    	int indiceOrigen = origen.getIndice();
	    	if (listaAdj.size()<=indiceOrigen) {
	    		listaAdj.add(new ArrayList<>());
	    	}
	    	listaAdj.get(indiceOrigen).add(new Arista(origen,destino,weight));
	    }
	    
	    public List<Vertice> getVertices(){
	    	return vertices;
	    }
	    
	    public List<List<Arista>> getAdjacencyList() {
	        return listaAdj;
	    }

	    public int getNumVertices() {
	        return numVertices;
	    }
	    public void print() {
	        for (int i = 0; i < numVertices; i++) {
	            if(listaAdj.get(i).size() != 0){
	                System.out.print(vertices.get(i).getLabel() + " --> ");
	                List<Arista> aristas = listaAdj.get(i);
	                for (Arista arista : aristas) {
	                    System.out.print(vertices.get(arista.getDestino().getIndice()).getLabel() + "(" + arista.getWeight() + ") ");
	                }
	                System.out.println();
	            }
	        }
	    }
	    

	
}
