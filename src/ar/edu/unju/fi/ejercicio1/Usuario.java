package ar.edu.unju.fi.ejercicio1;

public class Usuario {
	private String id;
    private String nombre;
    private String email;
    private CarritoDeCompra carrito;

    public Usuario(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.carrito = new CarritoDeCompra(1);
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public CarritoDeCompra getCarrito() { return carrito; }

    public void agregarAlCarrito(Producto p, int cantidad) {
        carrito.agregar(p, cantidad);
    }

    public void removerDelCarrito(Producto p) {
        carrito.remover(p);
    }

    public double verTotalCarrito() {
        return carrito.total();
    }

    public void mostrarCarrito() {
        System.out.println("--- Carrito de " + nombre + " ---");
        if (carrito.getItems().isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            for (ItemCarrito item : carrito.getItems()) {
                System.out.println("- " + item);
            }
            System.out.println("TOTAL: $" + verTotalCarrito());
        }
        System.out.println("---------------------------------");
    }
}
