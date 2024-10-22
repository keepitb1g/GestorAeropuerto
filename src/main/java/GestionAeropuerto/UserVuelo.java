package GestionAeropuerto;

import java.util.ArrayList;
import java.util.List;

public class UserVuelo {
	private List<Pasajero> pasajeros;
	private List<Piloto> pilotos;

	public UserVuelo() {
		pasajeros = new ArrayList<>();
		pilotos = new ArrayList<>();
	}

	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public List<Piloto> getPilotos() {
		return pilotos;
	}
}
