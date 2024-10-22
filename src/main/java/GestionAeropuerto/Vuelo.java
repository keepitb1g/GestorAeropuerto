package GestionAeropuerto;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Vuelo {
	private String idVuelo;
	private Date fechaInicio;
	private Date fechaLlegada;
	private CiudadOrigen lugarorigen;
	private CiudadDestino ciudadDestino;
	private Avion avion;
	private List<Pasajero> pasajeros;
	private List<Piloto> pilotos;
	private UserVuelo userVuelo;

	public Vuelo() {
		pasajeros = new ArrayList<>();
		pilotos = new ArrayList<>();
	}

	// Getters y setters para los atributos
	public String getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(String idVuelo) {
		this.idVuelo = idVuelo;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public CiudadOrigen getLugarorigen() {
		return lugarorigen;
	}

	public void setLugarorigen(CiudadOrigen lugarorigen) {
		this.lugarorigen = lugarorigen;
	}

	public CiudadDestino getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(CiudadDestino ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public void agregarPasajero(Pasajero pasajero) {
		pasajeros.add(pasajero);
	}

	public void agregarPiloto(Piloto piloto) {
		pilotos.add(piloto);
	}

	public UserVuelo getUserVuelo() {
		return userVuelo;
	}

	public void setUserVuelo(UserVuelo userVuelo) {
		this.userVuelo = userVuelo;
	}
}
