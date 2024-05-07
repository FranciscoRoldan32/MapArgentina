package construccion;

import java.util.ArrayList;


public class Provincias {
	private String nombre;
	private double lat;
	private double longitud;
	private static ArrayList<Provincias> provincias;

	public Provincias(String nombre,double lat,double longitud) {
		this.nombre=nombre;
		this.lat=lat;
		this.longitud=longitud;
		this.provincias= new ArrayList<Provincias>();
	}
	
	public static ArrayList<Provincias> getListProv(){
		return provincias;
	}
	
	

	public static Provincias[] crearProvs() {
		Provincias []provs = {new Provincias("Jujuy",-23.29234, -65.67789), 
				new Provincias("Malvinas Argentinas",-51.77758, -59.72898),
				new Provincias("Salta",-25.48099, -64.91589),
				new Provincias("Tucuman",-27.07184, -65.41847),
				new Provincias("Chaco",-26.60250, -60.69838),
				new Provincias("Santiago del Estero",-27.79400, -63.45686),
				new Provincias("La Rioja",-29.66286, -67.03840),
				new Provincias("San Juan",-31.06812, -68.96208),
				new Provincias("Formosa",-24.56072, -60.33674),
				new Provincias("Misiones",-27.15066, -54.76073),
				new Provincias("Corrientes",-28.85776, -57.90282),
				new Provincias("Entre Rios",-31.98348, -59.24315),
				new Provincias("Santa Fe",-30.72635, -61.13280),
				new Provincias("Santa Fe",-30.72635, -61.13280),
				new Provincias("San Luis",-34.21053, -65.98875),
				new Provincias("San Luis",-34.21053, -65.98875),
				new Provincias("Mendoza",-34.97024, -68.51561),
				new Provincias("Tierra del Fuego",-54.09385, -67.68996),
				new Provincias("Santa Cruz",-49.02666, -70.23615),
				new Provincias("Chubut",-44.14527, -68.93929),
				new Provincias("Rio Negro",-40.25210, -66.96917),
				new Provincias("Neuquen",-38.41065, -69.71708),
				new Provincias("La Pampa",-37.29642, -65.29408),
				new Provincias("Cordoba",-31.409390, -64.204858),
				new Provincias("Ciudad Autonoma de Buenos Aires",-36.2817759, -60.3196808),
				new Provincias("Buenos Aires",-36.28178, -60.31968)
				};
		 for (Provincias prov : provs ) {
			 provincias.add(prov);
		 }
		 return provs;
		}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public int lenghtProvs() {
		return provincias.size();
	}
	
	@Override
	public String toString() {
		return "Provincias (nombre=" + nombre + ", lat=-" + lat + ", longitud=-" + longitud + ")";
	}	
		 
	
	

	
	}

	

