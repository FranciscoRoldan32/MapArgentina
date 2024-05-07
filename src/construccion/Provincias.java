package construccion;

import java.util.ArrayList;

public class Provincias {
	private String nombre;
	private double lat;
	private double longitud;
	private ArrayList<Provincias> provincias;

	public Provincias(String nombre, double lat, double longitud) {
		this.nombre = nombre;
		this.lat = lat;
		this.longitud = longitud;
	}

	public ArrayList<Provincias> getListProv() {
		return provincias;
	}

	public void cargarProvs() {

		Provincias prov1 = new Provincias("Buenos Aires", -36.28178, -60.31968);
		provincias.add(prov1);
		Provincias prov2 = new Provincias("Ciudad Autonoma de Buenos Aires", -36.2817759, -60.3196808);
		provincias.add(prov2);
		Provincias prov3 = new Provincias("Cordoba", -31.409390, -64.204858);
		provincias.add(prov3);
		Provincias prov4 = new Provincias("La Pampa", -37.29642, -65.29408);

		Provincias prov5 = new Provincias("Neuquen", -38.41065, -69.71708);

		Provincias prov6 = new Provincias("Rio Negro", -40.25210, -66.96917);
		Provincias prov7 = new Provincias("Chubut", -44.14527, -68.93929);
		Provincias prov8 = new Provincias("Santa Cruz", -49.02666, -70.23615);
		Provincias prov9 = new Provincias("Tierra del Fuego", -54.09385, -67.68996);
		Provincias prov10 = new Provincias("Mendoza", -34.97024, -68.51561);
		Provincias prov11 = new Provincias("San Luis", -34.21053, -65.98875);
		Provincias prov12 = new Provincias("Santa Fe", -30.72635, -61.13280);
		Provincias prov13 = new Provincias("Entre Rios", -31.98348, -59.24315);
		Provincias prov14 = new Provincias("Corrientes", -28.85776, -57.90282);
		Provincias prov15 = new Provincias("Misiones", -27.15066, -54.76073);
		Provincias prov16 = new Provincias("Formosa", -24.56072, -60.33674);
		Provincias prov17 = new Provincias("San Juan", -31.06812, -68.96208);
		Provincias prov18 = new Provincias("La Rioja", -29.66286, -67.03840);
		Provincias prov19 = new Provincias("Santiago del Estero", -27.79400, -63.45686);
		Provincias prov20 = new Provincias("Chaco", -26.60250, -60.69838);
		Provincias prov21 = new Provincias("Tucuman", -27.07184, -65.41847);
		Provincias prov22 = new Provincias("Salta", -25.48099, -64.91589);
		Provincias prov23 = new Provincias("Jujuy", -23.29234, -65.67789);
		Provincias prov24 = new Provincias("Malvinas Argentinas", -51.77758, -59.72898);
	}

}
