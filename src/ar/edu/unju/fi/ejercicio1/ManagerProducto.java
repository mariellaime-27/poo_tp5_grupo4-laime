package ar.edu.unju.fi.ejercicio1;
import java.util.ArrayList;
import java.util.List;

public class ManagerProducto {
	private List<Producto> productos;

    public ManagerProducto() {
        this.productos = new ArrayList<>();
        inicializarProductos();
    }

    private void inicializarProductos() {
        productos.add(new Producto("P001", "Notebook HP 15", 750000.0, true));
        productos.add(new Producto("P002", "Mouse Inalámbrico Logitech", 25000.0, true));
        productos.add(new Producto("P003", "Teclado Mecánico Redragon", 60000.0, true));
        productos.add(new Producto("P004", "Monitor 24' Samsung", 180000.0, true));
        productos.add(new Producto("P005", "Auriculares HyperX", 85000.0, true));
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Producto buscarPorCodigo(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }
}
