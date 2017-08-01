package ar.com.curso.poi.tdd;

/**
 * @author Administrador
 *
 */
public class PoiBean {
	private String longitud;
	private String latitud;
	private String nombre;
	private String descripcion;
	
//	-27.7815141,-64.2645084 Pizzería "Las Cuartetas" Pizzería "Las Cuartetas" 
//	-34.5978366,-58.3876505 El Cuartito 
//	-34.6033254,-58.3795288 El Palacio de la Pizza 
//	-34.6088526,-58.3759733 Cabildo de Buenos Aires 
	
	public PoiBean() {

	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	public String getLatitud() {
		return latitud;
	}
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
