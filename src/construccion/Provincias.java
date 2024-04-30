package construccion;

import java.util.Set;
import java.util.HashSet;

public class Provincias {
	
	private Set<Provincia> provincias;

	public Provincias() {
		// TODO Auto-generated constructor stub
		provincias = new HashSet<Provincia>();
	}
	public void agregar(Provincia provincia) {
		if(!provincias.contains(provincia)) {
			provincias.add(provincia);
		}
	}

	@Override
	public String toString() {
		return "Ubicacione [ubicaciones=" + provincias + "]";
	}
	
	public int tamanio() {
		return provincias.size();
	}
	
	public Set<Provincia> getUbicaciones(){
		return this.provincias;
	}

}
