package ar.edu.unju.fi.ejercicio2;

public class Paquete {
	private String codigo;
    private String descripcion;
    private double pesoKg;
    private double volumenDc3;

    public Paquete(String codigo, String descripcion, double pesoKg, double volumenDc3) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.pesoKg = pesoKg;
        this.volumenDc3 = volumenDc3;
    }

    public String getCodigo() { return codigo; }
    public String getDescripcion() { return descripcion; }
    public double getPesoKg() { return pesoKg; }
    public double getVolumenDc3() { return volumenDc3; }

    @Override
    public String toString() {
        return "Paquete[" + codigo + " - " + descripcion + ", " + pesoKg + "kg, " + volumenDc3 + "dm3]";
    }
}
