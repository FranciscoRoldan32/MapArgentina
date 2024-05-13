package construccion;


import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


public class Grafo {

	    private  List<Vertice> vertices;
	    private int numVertices;
	    
	    private List<List<Arista>> listaAdj;
	    
	    public Grafo(){
	    	this.numVertices = 0;
	        this.vertices = new ArrayList<>();
	        this.listaAdj= new ArrayList<>();
	    }


	    public Vertice addVertex(String label){
			for (Vertice existingVertex : vertices) {
				if (existingVertex.getLabel().equals(label)) {
					throw new IllegalArgumentException("Vertex with label '" + label + "' already exists");
				}
			}
			Vertice vertex = new Vertice(label, numVertices);
			vertices.add(vertex);
			listaAdj.add(new ArrayList<>());
			numVertices++;
			return vertex;
	    }

	    public void addEdge(Vertice origen, Vertice destino, Integer weight){
	    	  int sourceIndex = origen.getIndice();

	          if(weight <= 0){
	              throw new IllegalArgumentException("La gráfica no puede ser igual o inferior a 0");
	          }

	          for (Arista edge : listaAdj.get(sourceIndex)) {
	              if (edge.getDestino().equals(destino)) {
	                  // Edge already exists, no need to add it again
	                  throw new IllegalArgumentException("Este Arista ya fue agregado al gráfico.");
	              }
	          }

	          if(origen.equals(destino)){
	              throw new IllegalArgumentException("El gráfico no aceptará que el Origen y el Destino sean iguales");
	          }

	          if (!vertices.contains(origen) || !vertices.contains(destino)) {
	              throw new IllegalArgumentException("El vertice de origen o destino no existe en el gráfico");
	          }

	          //Esto es para ver si todo esta inciado correctamente
	          if (listaAdj.size() <= sourceIndex) {
	        	  listaAdj.add(new ArrayList<>());
	          }
	          //Todo listo y se agrega el grafo
	          listaAdj.get(sourceIndex).add(new Arista(origen,destino, weight));
	    }
	    
	    public List<Vertice> getVertices(){
	    	return vertices;
	    }
	    public void setVertices(List<Vertice> vertices) {
	        this.vertices = vertices;
	    }
	    
	    public List<List<Arista>> getAdjacencyList() {
	        return listaAdj;
	    }
	    
	    public int getNumVertices() {
	        return numVertices;
	    }
	    
	    public Map<String, List<String>> obtenerTodosLosAdjEnStr() {
	        Map<String, List<String>> mapArgentinaEdges = new HashMap<>();
	        
	        for (int i = 0; i < numVertices; i++) {
	            List<String> edgesProvinces = new ArrayList<>();
	            
	            if (!listaAdj.get(i).isEmpty()) {
	                List<Arista> edges = listaAdj.get(i);
	                
	                for (Arista edge : edges) {
	                    int srcIndex = edge.getOrigen().getIndice();
	                    int destIndex = edge.getDestino().getIndice();
	                    
	                    String srcLabel = vertices.get(srcIndex).getLabel();
	                    String destLabel = vertices.get(destIndex).getLabel();
	                    
	                    // Agrega la destinacion a la lista
	                    edgesProvinces.add(srcLabel);
	                    edgesProvinces.add(destLabel);
	                }
	                
	                // Agrega las arista al mapa
	                mapArgentinaEdges.put(vertices.get(i).getLabel(), edgesProvinces);
	            }
	        }
	        return mapArgentinaEdges;
	    }
	    
	    public List<String> generarMapaAdj() {
	        List<String> representation = new ArrayList<>();
	    
	        for (int i = 0; i < numVertices; i++) {
	            if (listaAdj.get(i).size() != 0) {
	                StringBuilder line = new StringBuilder();
	                line.append(vertices.get(i).getLabel()).append(" --> ");
	                List<Arista> edges = listaAdj.get(i);
	                for (Arista edge : edges) {
	                    line.append(vertices.get(edge.getDestino().getIndice()).getLabel())
	                        .append("(").append(edge.getWeight()).append(") ");
	                }
	                representation.add(line.toString());
	            }
	        }
	        return representation;
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
