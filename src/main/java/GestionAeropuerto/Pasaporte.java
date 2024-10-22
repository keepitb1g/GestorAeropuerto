package GestionAeropuerto;

import java.util.Date;

public class Pasaporte {
	private String id;
	private String nacionalidad;
	private int hojasDisponibles;
	private Date fechaExpiracion;  // Cambiar a java.util.Date

	public Pasajero unnamed_Pasajero_;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getHojasDisponibles() {
		return hojasDisponibles;
	}

	public void setHojasDisponibles(int hojasDisponibles) {
		this.hojasDisponibles = hojasDisponibles;
	}

	public Date getFechaExpiracion() {  // Cambiar a java.util.Date
		return fechaExpiracion;
	}

	public void setFechaExpiracion(Date fechaExpiracion) {  // Cambiar a java.util.Date
		this.fechaExpiracion = fechaExpiracion;
	}
}
