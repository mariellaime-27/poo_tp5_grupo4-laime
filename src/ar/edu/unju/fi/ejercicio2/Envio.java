package ar.edu.unju.fi.ejercicio2;
import java.util.ArrayList;
import java.util.List;

public class Envio {
    private String id;
    private String remitente;
    private String destinatario;
    private String direccionEntrega;
    private EstadoEnvio estado;
    private List<Paquete> paquetes;

    public Envio(String id, String remitente, String destinatario, String direccionEntrega) {
        this.id = id;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.direccionEntrega = direccionEntrega;
        this.estado = EstadoEnvio.GENERADO;
        this.paquetes = new ArrayList<>();
    }

    public String getId() { return id; }
    public EstadoEnvio getEstado() { return estado; }
    public void setEstado(EstadoEnvio estado) { this.estado = estado; }
    public List<Paquete> getPaquetes() { return paquetes; }

    public void agregarPaquete(Paquete p) {
        this.paquetes.add(p);
    }

    public double getPesoTotal() {
        double pesoTotal = 0;
        for (Paquete p : paquetes) {
            pesoTotal += p.getPesoKg();
        }
        return pesoTotal;
    }

    public void despachar() {
        this.estado = EstadoEnvio.EN_RUTA;
    }

    public void devolver() {
        this.estado = EstadoEnvio.DEVUELTO;
    }

    public void mostrarInfo() {
        System.out.println("=== Detalle del Envío " + id + " ===");
        System.out.println("Remitente: " + remitente);
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Estado: " + estado);
        System.out.println("Peso Total: " + getPesoTotal() + " kg");
        System.out.println("Paquetes (" + paquetes.size() + "):");
        for (Paquete p : paquetes) {
            System.out.println("  - " + p);
        }
        System.out.println("================================");
    }
}