package ar.edu.unju.fi.ejercicio2;

public class Vehiculo {
	private String patente;
    private double capacidadPesoKg;
    private double capacidadVolumenDc3;

    public Vehiculo(String patente, double capacidadPesoKg, double capacidadVolumenDc3) {
        this.patente = patente;
        this.capacidadPesoKg = capacidadPesoKg;
        this.capacidadVolumenDc3 = capacidadVolumenDc3;
    }

    public String getPatente() { return patente; }
    public double getCapacidadPesoKg() { return capacidadPesoKg; }
    public double getCapacidadVolumenDc3() { return capacidadVolumenDc3; }

    @Override
    public String toString() {
        return "Vehiculo " + patente + " [Capacidad Max Peso: " + capacidadPesoKg + "kg]";
    }
}

