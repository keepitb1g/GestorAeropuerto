package GestionAeropuerto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aeropuerto {
	private String nombre;
	private String ubicacion;
	private List<Avion> aviones;
	private List<Vuelo> vuelos;

	public Aeropuerto() {
		aviones = new ArrayList<>();
		vuelos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public void crearVuelo(Vuelo vuelo) {
		vuelos.add(vuelo);
	}

	public void registrarAviones(Avion avion) {
		aviones.add(avion);
	}

	public void agregarPasajeros(String idVuelo, Pasajero pasajero) {
		for (Vuelo vuelo : vuelos) {
			if (vuelo.getIdVuelo().equals(idVuelo)) {
				vuelo.agregarPasajero(pasajero);
			}
		}
	}

	public void agregarPiloto(String idVuelo, Piloto piloto) {
		for (Vuelo vuelo : vuelos) {
			if (vuelo.getIdVuelo().equals(idVuelo)) {
				vuelo.agregarPiloto(piloto);
			}
		}
	}

	public boolean validarPasaporte(Pasaporte pasaporte) {
		Date currentDate = new Date();
		return pasaporte.getFechaExpiracion().after(currentDate) && pasaporte.getHojasDisponibles() > 0;
	}

	public List<UserVuelo> buscarUserEnVuelo(Date fecha) {
		List<UserVuelo> usuarios = new ArrayList<>();
		for (Vuelo vuelo : vuelos) {
			if (vuelo.getFechaInicio().equals(fecha)) {
				usuarios.add(vuelo.getUserVuelo());
			}
		}
		return usuarios;
	}

	public List<UserVuelo> buscarUserEnVuelo(String idVuelo) {
		for (Vuelo vuelo : vuelos) {
			if (vuelo.getIdVuelo().equals(idVuelo)) {
				return List.of(vuelo.getUserVuelo());
			}
		}
		return new ArrayList<>();
	}
}
