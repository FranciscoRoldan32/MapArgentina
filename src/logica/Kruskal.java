package logica;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import construccion.Arista;
import construccion.Grafo;
import construccion.Vertice;
public class Kruskal {

	private Grafo kruskalGraph;
	private ArrayList<Arista> sortedEdges;
	private Set<Vertice> vertices;
	
	public Kruskal() {
		sortedEdges = new ArrayList<>();
        vertices = new HashSet<>();
	}
	private class weightComparator implements Comparator<Arista> {

        @Override
        public int compare(Arista e1, Arista e2) {
            return e1.getWeight() - e2.getWeight();
        }
    }



    public Grafo minimumSpanningTree(Grafo graphOriginal) {
        kruskalGraph = new Grafo();


        //Agrega todo las aristas en una lista y colecta todo los Vertice
        for (Vertice vertex : graphOriginal.getVertices()) {
            
            //Esto es para agregar al grafo nuevo todo los Vertice que nesesita
            kruskalGraph.addVertex(vertex.getLabel());
            
            vertices.add(vertex);


            sortedEdges.addAll(graphOriginal.getAdjacencyList().get(vertex.getIndice()));

            List<Arista> edges = graphOriginal.getAdjacencyList().get(vertex.getIndice());

            //Checkea si la liesta de Aristas (Edges) no esta vacia o Null
            if (edges != null) { 
                sortedEdges.addAll(edges);
            }
        }
        Collections.sort(sortedEdges, new weightComparator());
        
       //Inicializar conjunto disjunto para detección de ciclo

        KruskalHelp kruskalHelper = new KruskalHelp(new ArrayList<>(vertices));


        //Iterar sobre Aristas ordenados
        for (Arista edge : sortedEdges) {
        	Vertice src = edge.getOrigen();;
        	Vertice dest = edge.getDestino();
            int weight = edge.getWeight();

            // Comprobar si incluir esta arista forma un ciclo
            if (kruskalHelper.find(src) != kruskalHelper.find(dest)){

                //Se agrega el caso arista con su peso
                kruskalGraph.addEdge(src, dest, weight);

                System.out.println(src.getLabel() + " --> " + dest.getLabel() + " == " + edge.getWeight());

                //Unir los conjuntos de inicio y destino
                kruskalHelper.union(src, dest);
            }
        }

        //Retornamos el grafo todo armado con su arista corresponientes 
        return kruskalGraph;

    }

}
