package ar.edu.unju.fi.ejercicio1;
import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompra {
	private int id;
    private List<ItemCarrito> items;
    private static int contadorItems = 1;

    public CarritoDeCompra(int id) {
        this.id = id;
        this.items = new ArrayList<>();
}

    public int getId() { return id; }
    public List<ItemCarrito> getItems() { return items; }

    public void agregar(Producto p, int cantidad) {
        if (!p.isActivo()) {
            System.out.println("El producto " + p.getNombre() + " no está activo.");
            return;
        }
        for (ItemCarrito item : items) {
            if (item.getProducto().getCodigo().equals(p.getCodigo())) {
                item.setCantidad(item.getCantidad() + cantidad);
                return;
            }
        }
        items.add(new ItemCarrito(contadorItems++, p, cantidad));
    }

    public void remover(Producto p) {
        items.removeIf(item -> item.getProducto().getCodigo().equals(p.getCodigo()));
    }

    public double total() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.subTotal();
        }
        return total;
    }

    public void vaciar() {
        items.clear();
    }
}