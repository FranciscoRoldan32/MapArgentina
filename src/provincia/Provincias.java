package provincia;

import java.util.HashMap;
import java.util.Map;

public class Provincias {
	
	private Map<String, Coordinates> locations;

    public Provincias(){
        this.locations = new HashMap<>();
        generateProvinceArgentina();
    }

    public void generateProvinceArgentina(){
        locations.put("Buenos Aires", new Coordinates("Buenos Aires", -36.605, -58.435));
        locations.put("Ciudad Autónoma de Buenos Aires", new Coordinates("Ciudad Autónoma de Buenos Aires", -34.615, -58.433));
        locations.put("Catamarca", new Coordinates("Catamarca", -28.4696, -65.7852));
        locations.put("Chaco", new Coordinates("Chaco", -27.4512, -58.9866));
        locations.put("Chubut", new Coordinates("Chubut", -43.3002, -65.1023));
        locations.put("Córdoba", new Coordinates("Córdoba", -31.4201, -64.1888));
        locations.put("Corrientes", new Coordinates("Corrientes", -27.4692, -58.8302));
        locations.put("Entre Ríos", new Coordinates("Entre Ríos", -31.6222, -60.7299));
        locations.put("Formosa", new Coordinates("Formosa", -26.1852, -58.1761));
        locations.put("Jujuy", new Coordinates("Jujuy", -24.1858, -65.2995));
        locations.put("La Pampa", new Coordinates("La Pampa", -36.6167, -64.2833));
        locations.put("La Rioja", new Coordinates("La Rioja", -29.4131, -66.8558));
        locations.put("Mendoza", new Coordinates("Mendoza", -32.8908, -68.8272));
        locations.put("Misiones", new Coordinates("Misiones", -26.5003, -54.5837));
        locations.put("Neuquén", new Coordinates("Neuquén", -38.9516, -68.0591));
        locations.put("Río Negro", new Coordinates("Río Negro", -40.8128, -63.0012));
        locations.put("Salta", new Coordinates("Salta", -24.7859, -65.4117));
        locations.put("San Juan", new Coordinates("San Juan", -31.5375, -68.5364));
        locations.put("San Luis", new Coordinates("San Luis", -33.2994, -66.3356));
        locations.put("Santa Cruz", new Coordinates("Santa Cruz", -50.0000, -69.0000));
        locations.put("Santa Fe", new Coordinates("Santa Fe", -31.6333, -60.7000));
        locations.put("Santiago del Estero", new Coordinates("Santiago del Estero", -27.7834, -64.2649));
        locations.put("Tierra del Fuego", new Coordinates("Tierra del Fuego", -54.8000, -68.3000));
        locations.put("Tucumán", new Coordinates("Tucumán", -26.8241, -65.2226));
    }

    public Map<String, Coordinates> getLocations() {
        return locations;
    }
}
