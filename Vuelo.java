package GestionAeropuerto;

public class Vuelo {
	private String _idVuelo;
	private date _fechaInicio;
	private date _fechaLlegada;
	private CiudadOrigen _lugarorigen;
	private CiudadDestino _ciudadDestino;
	public Avion _unnamed_Avion_;
	public CiudadOrigen _unnamed_CiudadOrigen_;
	public CiudadDestino _unnamed_CiudadDestino_;
	public UserVuelo _unnamed_UserVuelo_;

	public String getIdVuelo() {
		return this._idVuelo;
	}

	public void setIdVuelo(String aIdVuelo) {
		this._idVuelo = aIdVuelo;
	}

	public date getFechaInicio() {
		return this._fechaInicio;
	}

	public void setFechaInicio(date aFechaInicio) {
		this._fechaInicio = aFechaInicio;
	}

	public date getFechaLlegada() {
		return this._fechaLlegada;
	}

	public void setFechaLlegada(date aFechaLlegada) {
		this._fechaLlegada = aFechaLlegada;
	}

	public CiudadOrigen getLugarorigen() {
		return this._lugarorigen;
	}

	public void setLugarorigen(CiudadOrigen aLugarorigen) {
		this._lugarorigen = aLugarorigen;
	}

	public CiudadDestino getCiudadDestino() {
		return this._ciudadDestino;
	}

	public void setCiudadDestino(CiudadDestino aCiudadDestino) {
		this._ciudadDestino = aCiudadDestino;
	}
}