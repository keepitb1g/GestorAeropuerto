package GestionAeropuerto;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Aeropuerto aeropuerto = new Aeropuerto();
        aeropuerto.setNombre("Aeropuerto Internacional");
        aeropuerto.setUbicacion("Santiago, Chile");

        Avion avion = new Avion();
        avion.setMatricula("ABC123");
        avion.setCapacidad(180);

        Piloto piloto = new Piloto();
        piloto.setNombre("Juan");
        piloto.setApellido("Pérez");
        piloto.setId("PIL123");

        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("María");
        pasajero.setApellido("Gómez");
        pasajero.setId("PAS123");

        Pasaporte pasaporte = new Pasaporte();
        pasaporte.setId("PAS123");
        pasaporte.setNacionalidad("Chile");
        pasaporte.setHojasDisponibles(30);
        pasaporte.setFechaExpiracion(new Date(2025, 12, 31));

        Vuelo vuelo = new Vuelo();
        vuelo.setIdVuelo("VUE123");
        vuelo.setFechaInicio(new Date(2023, 10, 21));
        vuelo.setFechaLlegada(new Date(2023, 10, 21));

        CiudadOrigen ciudadOrigen = new CiudadOrigen();
        ciudadOrigen.setNombre("Santiago");
        ciudadOrigen.setPais("Chile");

        CiudadDestino ciudadDestino = new CiudadDestino();
        ciudadDestino.setNombre("Temuco");
        ciudadDestino.setPais("Chile");

        // Establecer relaciones
        vuelo.setLugarorigen(ciudadOrigen);
        vuelo.setCiudadDestino(ciudadDestino);
        vuelo.setAvion(avion);

        // Añadir el vuelo al aeropuerto
        aeropuerto.crearVuelo(vuelo);

        // Imprimir para corroborar
        System.out.println("Aeropuerto: " + aeropuerto.getNombre() + " en " + aeropuerto.getUbicacion());
        System.out.println("Vuelo ID: " + vuelo.getIdVuelo() + " desde " + vuelo.getLugarorigen().getNombre() + " a " + vuelo.getCiudadDestino().getNombre());
    }
}
