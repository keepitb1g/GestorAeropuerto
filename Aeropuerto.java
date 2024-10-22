package GestionAeropuerto;

import java.util.Vector;
import GestionAeropuerto.Avion;

public class Aeropuerto {
	private String _nombre;
	private String _ubicacion;
	public Vector<Avion> _unnamed_Avion_ = new Vector<Avion>();

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getUbicacion() {
		return this._ubicacion;
	}

	public void setUbicacion(String aUbicacion) {
		this._ubicacion = aUbicacion;
	}

	public void crearVuelo(Vuelo aVuelo) {
		throw new UnsupportedOperationException();
	}

	public void registrarAviones(Avion aAvion, String aIdVuelo) {
		throw new UnsupportedOperationException();
	}

	public void agregarPasajeros(String aIdvuelo, Pasajero aPasajero) {
		throw new UnsupportedOperationException();
	}

	public void agregarPiloto(String aIdvuelo, Piloto aPiloto) {
		throw new UnsupportedOperationException();
	}

	public boolean validarPasaporte(Pasaporte aPasaporte) {
		throw new UnsupportedOperationException();
	}

	public UserVuelo buscarUserPorFecha(date aFechaInicio) {
		throw new UnsupportedOperationException();
	}

	public UserVuelo buscarUserEnVuelo(String aIdVuelo) {
		throw new UnsupportedOperationException();
	}
}