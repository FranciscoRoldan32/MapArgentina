package construccion;

public class Provincia {
	

	private String nombre;
	private double latitud;
	private double longitud;

	public Provincia(String provincia, double latitud, double longitud) {
		// TODO Auto-generated constructor stub

		this.nombre = provincia;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	public String getProvincia() {
		return nombre;
	}
	public void setProvincia(String provincia) {
		this.nombre = provincia;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return nombre + " (" +  nombre + ")";
	}
	

}
