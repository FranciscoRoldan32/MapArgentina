package construccion;


import java.util.ArrayList;


public class Grafo {

	    private ArrayList<Vertice> provincia;
	    private ArrayList<Arista> aristas;



	    public Grafo(){
	        this.provincia = new ArrayList<Vertice>();
	    }


	    public Vertice addVertex(String data){
	        Vertice nuevaProvincia = new Vertice(data);
	        this.provincia.add(nuevaProvincia);
	        return nuevaProvincia;
	    }

	    public void addEdge(Vertice initProv, Vertice finalProv, Integer weight){
	        initProv.addEdge(finalProv, weight);
	        finalProv.addEdge(initProv, weight);
	    }

	    public void removeEdge(Vertice initProv, Vertice finalProv){
	        initProv.removeEdge(finalProv);
	        finalProv.removeEdge(initProv);
	    }

	    public void removeVertex(Vertice prov){
	        provincia.remove(prov);
	    }

	    public ArrayList<Vertice> getProvincias() {
	        return provincia;
	    }

	    public void print(){
	        for(Vertice p : this.provincia){
	            p.print();
	        }
	    }

	    private static String[] generateProvinceArgentinaStrings() {
			return new String[]{ 
	            "Buenos Aires", "Ciudad Autonoma de Buenos Aires", "Catamarca",
	            "Chaco", "Chubut", "Cordoba", "Corrientes", "Entre Rios",
	            "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza",
	            "Misiones", "Neuquen", "Rio Negro", "Salta", "San Juan",
	            "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero",
	            "Tierra del Fuego", "Antartida e Islas del Atlantico Sur",
	            "Tucuman"
				};

	        }

	    public static void main(String[] args) {
	       Grafo Argentina = new Grafo();

	        String[] nombreProv = generateProvinceArgentinaStrings();
	        Vertice[] provinces = new Vertice[nombreProv.length];
	        for (int i = 0; i < nombreProv.length; i++) {
	            provinces[i] = Argentina.addVertex(nombreProv[i]);
	        }
	    
	        //Esto es una prueba no es algo definitivo pero es para ver si funciona los metodos
	    
	        // Ejemplo de cómo agregar algunos Edges o Artistas
	        Argentina.addEdge(provinces[0], provinces[1], 1); // Ejemplo de borde entre Buenos Aires y capital
	        Argentina.addEdge(provinces[0], provinces[2], 5); // Ejemplo de borde entre Buenos Aires y Catamarca
	    
	        // Imprime el grafo
	        Argentina.print();
	    }
}
