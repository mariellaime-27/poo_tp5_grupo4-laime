package ar.edu.unju.fi.ejercicio2;
import java.util.ArrayList;
import java.util.List;

public class ManagerEnvios {
	private List<Envio> envios;
    private List<Vehiculo> vehiculos;

    public ManagerEnvios() {
        this.envios = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
    }

    public void agregarEnvio(Envio e) { envios.add(e); }
    public void agregarVehiculo(Vehiculo v) { vehiculos.add(v); }

    public Envio buscarEnvioPorId(String id) {
        for (Envio e : envios) {
            if (e.getId().equalsIgnoreCase(id)) return e;
        }
        return null;
    }

    public Vehiculo buscarVehiculoPorPatente(String patente) {
        for (Vehiculo v : vehiculos) {
            if (v.getPatente().equalsIgnoreCase(patente)) return v;
        }
        return null;
    }

}
