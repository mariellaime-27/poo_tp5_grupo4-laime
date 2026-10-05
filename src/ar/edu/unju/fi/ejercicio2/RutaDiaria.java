package ar.edu.unju.fi.ejercicio2;

	import java.util.ArrayList;
	import java.util.List;
 
	public class RutaDiaria {
	    private String fecha;
	    private Vehiculo vehiculo;
	    private List<Envio> envios;

	    public RutaDiaria(String fecha, Vehiculo vehiculo) {
	        this.fecha = fecha;
	        this.vehiculo = vehiculo;
	        this.envios = new ArrayList<>();
	    }

	    public boolean asignarRuta(Envio envio) {
	        if (envio.getPaquetes().isEmpty()) {
	            System.out.println("ERROR: El envío " + envio.getId() + " no contiene paquetes. No se puede asignar a la ruta.");
	            return false;
	        }

	        double pesoActual = 0;
	        for (Envio e : envios) {
	            pesoActual += e.getPesoTotal();
	        }

	        if (pesoActual + envio.getPesoTotal() > vehiculo.getCapacidadPesoKg()) {
	            System.out.println("ERROR: El envío " + envio.getId() + " excede la capacidad del vehículo " + vehiculo.getPatente());
	            return false;
	        }

	        envios.add(envio);
	        envio.setEstado(EstadoEnvio.EN_ALMACEN);
	        System.out.println("Envío " + envio.getId() + " asignado a la ruta del " + fecha);
	        return true;
	    }

	    public void despacharRuta() {
	        for (Envio e : envios) {
	            e.despachar();
	        }
	        System.out.println("Ruta del " + fecha + " despachada.");
	    }
}
