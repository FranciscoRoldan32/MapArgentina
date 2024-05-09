package logica;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

import construccion.Vertice;

public class KruskalHelp {
	 private Map<Vertice, Vertice> parentMap;


	    public KruskalHelp(ArrayList<Vertice> arrayList) {
	        parentMap = new HashMap<>();
	        for (Vertice vertice : arrayList) {
	            parentMap.put(vertice, vertice);
	        }

	    }

	    public Vertice find(Vertice vertice) {
	    	Vertice parent = parentMap.get(vertice);
	        if (parent == vertice) {
	            return vertice;
	        }
	        // Compresión de ruta
	        parentMap.put(vertice, find(parent));
	        return parentMap.get(vertice);
	    }

	    public void union(Vertice origen, Vertice dest) {
	    	Vertice srcParent = find(origen);
	    	Vertice destParent = find(dest);
	        parentMap.put(srcParent, destParent);

	    }
}
