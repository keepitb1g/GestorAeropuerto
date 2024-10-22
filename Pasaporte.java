package GestionAeropuerto;

public class Pasaporte {
	private String _id;
	private String _nacionalidad;
	private int _hojasDisponibles;
	private date _fechaExpiracion;
	public Pasajero _unnamed_Pasajero_;

	public String getId() {
		return this._id;
	}

	public void setId(String aId) {
		this._id = aId;
	}

	public String getNacionalidad() {
		return this._nacionalidad;
	}

	public void setNacionalidad(String aNacionalidad) {
		this._nacionalidad = aNacionalidad;
	}

	public int getHojasDisponibles() {
		return this._hojasDisponibles;
	}

	public void setHojasDisponibles(int aHojasDisponibles) {
		this._hojasDisponibles = aHojasDisponibles;
	}

	public date getFechaExpiracion() {
		return this._fechaExpiracion;
	}

	public void setFechaExpiracion(date aFechaExpiracion) {
		this._fechaExpiracion = aFechaExpiracion;
	}
}